public class TransportasiUmum {
    private String nomorKendaraan;
    private String jenisKendaraan;
    private String jadwalKeberangkatan;

    // Constructor
    public TransportasiUmum(String nomorKendaraan, String jenisKendaraan, String jadwalKeberangkatan) {
        this.nomorKendaraan = nomorKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.jadwalKeberangkatan = jadwalKeberangkatan;
    }
    public String getNomorKendaraan() {
        return nomorKendaraan;
    }    public String getJenisKendaraan() {
        return jenisKendaraan;
    }    public String getJadwalKeberangkatan() {
        return jadwalKeberangkatan;
    }
    // Getters and setters (similar to the other classes)
    // ...
}