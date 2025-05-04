import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        StackTugasMahasiswa10 stack = new StackTugasMahasiswa10(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Menghitung Jumlah Tugas yang Dikumpulkan");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa10 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas " + biner);
                    }   

                    break;
                case 3:
                    Mahasiswa10 atas = stack.peek();
                    if (atas != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + atas.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas:");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa10 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;
                case 6:
                    int jumlahTugas = stack.countTasks();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlahTugas);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);
    }
}
