/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4pbo;

/**
 *
 * @author USER
 */
public class PerusahaanLama extends Asset {
    private int TanggalLama;

    public PerusahaanLama(String NamaAsset, String Lokasi, int IdAsset, int Kuantitas, int Harga, int TanggalLama) {
        super(NamaAsset, Lokasi, IdAsset, Kuantitas, Harga);
        this.TanggalLama = TanggalLama;
    }

    public int getTanggalLama() {
        return TanggalLama;
    }

    public void setTanggalLama(int TanggalLama) {
        this.TanggalLama = TanggalLama;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\n");
        System.out.println("Tanggal Penerimaan Barang : " + this.TanggalLama);
    }
    
    public void displayInfo(boolean showTanggalLama){
        if(showTanggalLama) displayInfo();
        else super.displayInfo();
    }
}
