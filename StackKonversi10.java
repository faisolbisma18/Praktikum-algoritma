public class StackKonversi10 {
    int[] tumpukanBiner;  
    int size;     
    int top;      

    public StackKonversi10() {
        this.size = 32; 
        this.tumpukanBiner = new int[size];
        this.top = -1;  
    }

    public StackKonversi10(int size) {
        this.size = size;
        this.tumpukanBiner = new int[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            tumpukanBiner[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; 
        } else {
            return tumpukanBiner[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return -1;  
        } else {
            return tumpukanBiner[top];
        }
    }
}
