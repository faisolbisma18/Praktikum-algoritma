public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa10(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + 
               ", Nilai: " + (nilai >= 0 ? nilai : "Belum dinilai");
    }
}
