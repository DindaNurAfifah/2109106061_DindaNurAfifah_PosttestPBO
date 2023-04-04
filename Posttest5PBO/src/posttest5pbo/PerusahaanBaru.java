/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5pbo;

/**
 *
 * @author USER
 */
final class PerusahaanBaru extends Asset {
    private final int TanggalBaru;
    private String Lokasi;
    
    public PerusahaanBaru(String NamaAsset, String Lokasi, int IdAsset, int Kuantitas, int Harga, int Tanggal) {
        super(NamaAsset, Lokasi, IdAsset, Kuantitas, Harga, Tanggal);
        this.TanggalBaru = Tanggal;
        this.Lokasi = Lokasi;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String Lokasi) {
        this.Lokasi = Lokasi;
    }

    @Override
    public void display() {
        super.displayInfo();
        System.out.println("\n");
        System.out.println("Tanggal Penerimaan Barang : " + this.Tanggal);
        System.out.println("Tanggal Penyimpanan Barang: " + this.Lokasi);
    }
   
    public void display(boolean showLokasi){
        if(showLokasi) display();
        else super.displayInfo();
    }
}
