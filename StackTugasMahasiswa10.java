public class StackTugasMahasiswa10 {
    Mahasiswa10[] stack;
    int size;
    int top;

    public StackTugasMahasiswa10(int size) {
        this.size = size;
        this.stack = new Mahasiswa10[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa10 mhs) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        } else {
            stack[++top] = mhs;
        }
    }

    public Mahasiswa10 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
        return stack[top--];
    }

    public Mahasiswa10 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        return stack[top];
    }

    public Mahasiswa10 peekBottom() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        return stack[0]; 
    }

    public int countTasks() {
        return top + 1; 
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Nama\t\tNIM\t\tKelas\t\tNilai");
            for (int i = 0; i <= top; i++) {
                Mahasiswa10 m = stack[i];
                String nilaiStr = m.nilai >= 0 ? String.valueOf(m.nilai) : "Belum dinilai";
                System.out.println(m.nama + "\t" + m.nim + "\t" + m.kelas + "\t" + nilaiStr);
            }
        }
    }
}
