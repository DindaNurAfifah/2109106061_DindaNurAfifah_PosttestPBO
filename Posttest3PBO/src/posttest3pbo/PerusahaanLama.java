/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3pbo;

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
    
    
    
}
