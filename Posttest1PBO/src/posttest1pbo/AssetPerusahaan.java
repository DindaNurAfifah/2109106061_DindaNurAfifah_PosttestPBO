/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1pbo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class AssetPerusahaan {
    ArrayList<Asset> list;
    
    public AssetPerusahaan (){
        list = new ArrayList<>();
    }
    
    public void add(Asset data){
        if(!find(data.getIdAsset())){
            list.add(data);
            System.out.println("=======================================================================================");
            System.out.println("                                  Adding new data Succesfully                          ");
        } else {
            System.out.println("=======================================================================================");
            System.out.println("                                This ID Is Already Available                           ");
        }
    }
    
    public boolean find(int IdAsset) {
        for(Asset l: list) {
            if(l.getIdAsset() == IdAsset) {
            System.out.println(l);
            return true;
            }
        }
        return false;
    }
    
    public void delete(int daIdAsset){
        Asset dataDel = null;
        
        for(Asset ll : list) {
            if( ll.getIdAsset() == daIdAsset) {
            dataDel  = ll;
            }
        }
        
        if(dataDel == null) {
            System.out.println("=======================================================================================");
            System.out.println("                                      ID CHOOSEN NOT EXIST                             ");
        } else{
            list.remove(dataDel);
            System.out.println("=======================================================================================");
            System.out.println("                                      DELETE DATA SUCSSES                              ");
        }
    }
    
    public Asset findlagi( int IdAsset) {
        for (Asset l : list) {
            if(l.getIdAsset() == IdAsset) {
                return l;
            }
        }
        return null;
    }
    
    public void update(int id, Scanner input) {
        if(find(id)) {
            Asset ass = findlagi(id);
            System.out.println("Enter New Data");
            System.out.print("ID ASSET: ");
            int IdAsset = input.nextInt();
            input.nextLine();
            System.out.print("NAMA BARANG: ");
            String NamaAsset = input.nextLine();
            System.out.print("DIVISI: ");
            String Divisi = input.nextLine();
            System.out.print("KUANTITAS: ");
            int Kuantitas = input.nextInt();
            input.nextLine();
            System.out.print("HARGA: ");
            int Harga = input.nextInt();
            input.nextLine();
            ass.setIdAsset(IdAsset);
            ass.setNamaAsset(NamaAsset);
            ass.setDivisi(Divisi);
            ass.setHarga(Harga);
            ass.setKuantitas(Kuantitas);
            System.out.println("=======================================================================================");
            System.out.println("                                     UPDATE DATA SUCSSES                               ");
        } else {
            System.out.println("=======================================================================================");
            System.out.println("                                     ID CHOOSEN NOT EXIST                              ");
        }
    }
    
    public void tampil() {
        if(list.isEmpty()) {
            System.out.println("=======================================================================================");
            System.out.println("                                              Empty                                    ");
        } else {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s", "ID ASSET", "NAMA BARANG", "DIVISI", "KUANTITAS", "HARGA", "\n");
            System.out.println("\n");
            for (Asset data : list) {
            System.out.println(data.preview());
        }
        }
        
    }
}