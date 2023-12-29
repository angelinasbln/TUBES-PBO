public class Mahasiswa {
    private String nama;
    private String npm;
    private String jadwal;

    // Constructor
    public Mahasiswa(String nama, String npm, String jadwal) {
        this.nama = nama;
        this.npm = npm;
        this.jadwal = jadwal;
    }

    // Getters
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getJadwal() {
        return jadwal;
    }

    // Setters
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
}
