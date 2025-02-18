package pertemuan2;

public class Dosen10 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif/Tidak: " + statusAktif);
        System.out.println("Bergabung pada tahun: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg){
        thnSkrg -= tahunBergabung;
        tahunBergabung = thnSkrg;
        return thnSkrg;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

    public Dosen10(){
    }

    public Dosen10(String ID, String nm, boolean sa, int tb, String bk){
        idDosen = ID;
        nama = nm;
        statusAktif = sa;
        tahunBergabung = tb;
        bidangKeahlian = bk;
    }
}
