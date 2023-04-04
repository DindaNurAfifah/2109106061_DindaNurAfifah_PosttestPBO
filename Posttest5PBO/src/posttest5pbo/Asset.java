/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5pbo;

/**
 *
 * @author USER
 */
public abstract class Asset {
    protected String NamaAsset;
    protected int IdAsset;
    protected int Kuantitas;
    protected int Harga;
    protected int Tanggal;

    public Asset(String NamaAsset, String Lokasi, int IdAsset, int Kuantitas, int Harga, int Tanggal) {
        this.NamaAsset = NamaAsset;
        this.IdAsset = IdAsset;
        this.Kuantitas = Kuantitas;
        this.Harga = Harga;
        this.Tanggal = Tanggal;
    }
    
    protected abstract void display();

    public String getNamaAsset() {
        return NamaAsset;
    }

    public void setNamaAsset(String NamaAsset) {
        this.NamaAsset = NamaAsset;
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

    public int getTanggal() {
        return Tanggal;
    }

    public void setTanggal(int Tanggal) {
        this.Tanggal = Tanggal;
    }
    
    public void displayInfo() {
        System.out.println("\n===================================================================================");
        System.out.printf("| %-10s | %-20s | %-15s | %-25s |","ID BARANG", "NAMA BARANG", "KUANTITAS", "HARGA");
        System.out.println("\n");
        System.out.printf("| %-10s | %-20s | %-15s | %-25s |", this.IdAsset, this.NamaAsset, this.Kuantitas, this.Harga);
    }
    
    
}
