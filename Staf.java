public class Staf {

    private String nama;
    private String nomorIdentifikasi;
    private String jadwal;

    // Constructor
    public Staf(String nama, String nomorIdentifikasi, String jadwal) {
        this.nama = nama;
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.jadwal = jadwal;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }
    public String getNomorIdentifikasi() {
        return nomorIdentifikasi;
    }
    public String getJadwal() {
        return jadwal;
    }
    // Getters for nomorIdentifikasi and jadwal (add them as well)
    // ...
}
