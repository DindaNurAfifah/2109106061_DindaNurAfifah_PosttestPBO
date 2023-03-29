/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4pbo;

/**
 *
 * @author USER
 */
public class PerusahaanBaru extends Asset {
    private int TanggalBaru;

    public PerusahaanBaru(String NamaAsset, String Lokasi, int IdAsset, int Kuantitas, int Harga, int TanggalBaru) {
        super(NamaAsset, Lokasi, IdAsset, Kuantitas, Harga);
        this.TanggalBaru = TanggalBaru;
    }

    public int getTanggalBaru() {
        return TanggalBaru;
    }

    public void setTanggalBaru(int TanggalBaru) {
        this.TanggalBaru = TanggalBaru;
    }

    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\n");
        System.out.println("Tanggal Penerimaan Barang : " + this.TanggalBaru);
    }
   
    public void displayInfo(boolean showTanggalBaru){
        if(showTanggalBaru) displayInfo();
        else super.displayInfo();
    }
}
