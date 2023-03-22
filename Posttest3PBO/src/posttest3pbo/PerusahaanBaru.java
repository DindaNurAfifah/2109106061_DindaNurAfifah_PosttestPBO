/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3pbo;

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

    void setTanggalLama(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
