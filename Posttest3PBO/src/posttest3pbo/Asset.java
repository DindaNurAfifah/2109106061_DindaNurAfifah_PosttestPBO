/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3pbo;

/**
 *
 * @author USER
 */
public class Asset {
    protected String NamaAsset;
    protected String Lokasi;
    protected int IdAsset;
    protected int Kuantitas;
    protected int Harga;

    public Asset(String NamaAsset, String Lokasi, int IdAsset, int Kuantitas, int Harga) {
        this.NamaAsset = NamaAsset;
        this.Lokasi = Lokasi;
        this.IdAsset = IdAsset;
        this.Kuantitas = Kuantitas;
        this.Harga = Harga;
    }

    public String getNamaAsset() {
        return NamaAsset;
    }

    public void setNamaAsset(String NamaAsset) {
        this.NamaAsset = NamaAsset;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String Lokasi) {
        this.Lokasi = Lokasi;
    }

    public int getIdAsset() {
        return IdAsset;
    }

    public void setIdAsset(int IdAsset) {
        this.IdAsset = IdAsset;
    }

    public int getKuantitas() {
        return Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        this.Kuantitas = Kuantitas;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
    
    
    
}
