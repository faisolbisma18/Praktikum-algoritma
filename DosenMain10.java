package pertemuan2;

public class DosenMain10 {
    public static void main(String[] args) {
        Dosen10 dsn1 = new Dosen10();
        dsn1.idDosen="5678";
        dsn1.nama="Budiono";
        dsn1.statusAktif=true;
        dsn1.tahunBergabung=2011;
        dsn1.bidangKeahlian="Algoritma";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Sistem Operasi");
        dsn1.tampilInformasi();

        Dosen10 dsn2 = new Dosen10("5678", "Budi", true, 2010, "Fisika");
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Basis Data");
    }
}
