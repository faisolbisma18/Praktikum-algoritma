import java.util.Scanner;

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
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
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
        } else {
            return stack[top--];
        }
    }

    public Mahasiswa10 peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Daftar Tugas:");
            for (int i = 0; i <= top; i++) {
                System.out.println((i + 1) + ". " + stack[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas stack: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();
        StackTugasMahasiswa10 stack = new StackTugasMahasiswa10(kapasitas);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Tugas");
            System.out.println("3. Nilai Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (stack.isFull()) {
                        System.out.println("Stack Penuh!");
                        break;
                    }
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas);
                    stack.push(mhs);
                    break;
                case 2:
                    stack.print();
                    break;
                case 3:
                    Mahasiswa10 mhsTop = stack.pop();
                    if (mhsTop != null) {
                        System.out.print("Masukkan Nilai: ");
                        int nilai = sc.nextInt();
                        mhsTop.tugasDinilai(nilai);
                        System.out.println("Tugas dinilai: " + mhsTop);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
