public class MahasiswaMain10 {
    public static void main(String[] args) {
        Mahasiswa10 mhs1 = new Mahasiswa10();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa10 mhs2 = new Mahasiswa10("Annisa Nabila", "2141720160", "TI 2L", 3.25);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa10 mhsBisma = new Mahasiswa10("Mochammad Faisol Bismagraha", "244107020010", "TI 1F",3.55);
        mhsBisma.tampilkanInformasi();
        }
    
}
