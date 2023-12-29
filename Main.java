public class Main {

    public static void main(String[] args) {
        // Buat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Angelina Simbolon", "4522210044", "Senin, Selasa, Rabu");

        // Tampilkan informasi tentang mahasiswa
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NPM: " + mahasiswa.getNpm());
        System.out.println("Jadwal: " + mahasiswa.getJadwal());

        // Buat objek Staf
        Staf staf = new Staf("Bambang Pramuja", "126381993", "Kamis, Jumat, Sabtu");

        // Tampilkan informasi tentang staf
        System.out.println("Nama: " + staf.getNama());
        System.out.println("Nomor identitas: " + staf.getNomorIdentifikasi());
        System.out.println("Jadwal: " + staf.getJadwal());

        // Buat objek TransportasiUmum
        TransportasiUmum transportasiUmum = new TransportasiUmum("B01", "Bus", "07:00 WIB");

        // Tampilkan informasi tentang transportasi umum
        System.out.println("Nomor kendaraan: " + transportasiUmum.getNomorKendaraan());
        System.out.println("Jenis kendaraan: " + transportasiUmum.getJenisKendaraan());
        System.out.println("Jadwal keberangkatan: " + transportasiUmum.getJadwalKeberangkatan());
    }
}
