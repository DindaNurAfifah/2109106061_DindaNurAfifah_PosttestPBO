/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1pbo;

/**
 *
 * @author USER
 */
public class Asset {
    public int IdAsset;
    public int Kuantitas;
    public int Harga;
    public String NamaAsset;
    public String Divisi;
    
    
    public Asset() {}
    
    public Asset(int IdAsset, String NamaAsset, String Ket) {
           this.IdAsset = IdAsset;
           this.NamaAsset = NamaAsset;
           this.Harga = Harga;
           this.Kuantitas = Kuantitas;
           this.Divisi = Divisi;
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
        return IdAsset;
    }
    
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
    public String NamaAsset() {
        return NamaAsset;
    }
    
    public void setNamaAsset(String NamaAsset) {
        this.NamaAsset = NamaAsset;
    }
    
    public String Divisi() {
        return Divisi;
    }
    
    public void setDivisi(String Divisi) {
        this.Divisi = Divisi;
    }
    
    public String preview(){
        return IdAsset + "\t\t" +  NamaAsset  + "\t\t" +  Divisi + "\t\t" +  Kuantitas + "\t\t" + Harga;
    }

}