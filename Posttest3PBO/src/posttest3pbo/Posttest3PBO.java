/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3pbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Posttest3PBO 
{
    public static void main(String[] args) throws IOException  {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<PerusahaanBaru> dataBaru = new ArrayList<PerusahaanBaru>();
        ArrayList<PerusahaanLama> dataLama = new ArrayList<PerusahaanLama>();
        
        while(true){
            menu();
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan) {
                case 1:
                    System.out.println("\n");
                    System.out.println("========================================================================================================");
                    System.out.println("=                                              READ DATA ASSET                                         =");
                    System.out.println("========================================================================================================");
                    System.out.println("=                                          [1] Data Perusahaan Baru                                    =");
                    System.out.println("=                                          [2] Data Perusahaan Lama                                    =");
                    System.out.println("=                                          [3] Exit                                                    =");
                    System.out.println("========================================================================================================");
                    System.out.println("Pilih Menu: [1/2]");
                    int pilihan1 = Integer.parseInt(br.readLine());
                    switch(pilihan1) {
                        case 1:
                            System.out.println("\n");
                            System.out.println("========================================================================================================");
                            System.out.println("=                                               DATA ASSET                                             =");
                            System.out.println("========================================================================================================");
                            if(dataBaru.isEmpty()) {
                                System.out.println("=                                                                                                      =");
                                System.out.println("=                                                 Empty                                                =");
                                System.out.println("=                                                                                                      =");
                                System.out.println("========================================================================================================");
                                break;
                            } else {
                                System.out.printf("| %-9s | %-20s | %-20s | %-10s | %-15s | %-20s","ID BARANG", "NAMA BARANG", "LOKASI", "KUANTITAS", "HARGA", "TANGGAL");
                                for (int i = 0; i < dataBaru.size(); ++i) {
                                    System.out.println("\n");
                                    System.out.printf("| %-9s | %-20s | %-20s | %-10s | %-15s | %-20s",dataBaru.get(i).getIdAsset(), dataBaru.get(i).getNamaAsset(),
                                                    dataBaru.get(i).getLokasi(), dataBaru.get(i).getKuantitas(), dataBaru.get(i).getHarga(), dataBaru.get(i).getTanggalBaru());
                                }
                            }
                            break;
                        case 2:
                            System.out.println("\n");
                            System.out.println("========================================================================================================");
                            System.out.println("=                                               DATA ASSET                                             =");
                            System.out.println("========================================================================================================");
                            if(dataLama.isEmpty()) {
                                System.out.println("=                                                                                                      =");
                                System.out.println("=                                                 Empty                                                =");
                                System.out.println("=                                                                                                      =");
                                System.out.println("========================================================================================================");
                                break;
                            } else {
                                System.out.printf("| %-9s | %-20s | %-20s | %-10s | %-15s | %-20s","ID BARANG", "NAMA BARANG", "LOKASI", "KUANTITAS", "HARGA", "TANGGAL");
                                for (int j = 0; j < dataLama.size(); ++j) {
                                    System.out.println("\n");
                                    System.out.printf("| %-9s | %-20s | %-20s | %-10s | %-15s | %-20s",dataLama.get(j).getIdAsset(), dataLama.get(j).getNamaAsset(),
                                                    dataLama.get(j).getLokasi(), dataLama.get(j).getKuantitas(), dataLama.get(j).getHarga(), dataLama.get(j).getTanggalLama());
                                }
                                break;
                            }
                        case 3:
                            break;
                          
                    }
                    break;
                case 2:
                    while(true) {
                    System.out.println("\n");
                    System.out.println("========================================================================================================");
                    System.out.println("=                                                 ADD DATA                                             =");
                    System.out.println("========================================================================================================");
                    System.out.println("=                                          [1] Data Perusahaan Baru                                    =");
                    System.out.println("=                                          [2] Data Perusahaan Lama                                    =");
                    System.out.println("=                                          [3] Exit                                                    =");
                    System.out.println("========================================================================================================");
                    System.out.println("Pilih Menu: [1/2]");
                    int pilihan2 = Integer.parseInt(br.readLine());
                    switch(pilihan2) {
                        case 1: 
                            System.out.print("Nama Barang   : ");
                            String nama = br.readLine();
                            System.out.print("Lokasi        : ");
                            String lct = br.readLine();
                            System.out.print("ID Barang     : ");
                            int id = Integer.parseInt(br.readLine());
                            System.out.print("Kuantitas     : ");
                            int kuan = Integer.parseInt(br.readLine());
                            System.out.print("Harga         : ");
                            int hg = Integer.parseInt(br.readLine());
                            System.out.print("Tanggal       : ");
                            int tgl = Integer.parseInt(br.readLine());
                            PerusahaanBaru newPerusahaanBaru = new PerusahaanBaru(nama, lct, id, kuan, hg, tgl);
                            dataBaru.add(newPerusahaanBaru);
                        break;
                        case 2:
                            System.out.print("Nama Barang   : ");
                            String nama1 = br.readLine();
                            System.out.print("Lokasi        : ");
                            String lct1 = br.readLine();
                            System.out.print("ID Barang     : ");
                            int id1 = Integer.parseInt(br.readLine());
                            System.out.print("Kuantitas     : ");
                            int kuan1 = Integer.parseInt(br.readLine());
                            System.out.print("Harga         : ");
                            int hg1 = Integer.parseInt(br.readLine());
                            System.out.print("Tanggal       : ");
                            int tgl1 = Integer.parseInt(br.readLine());
                            PerusahaanLama newPerusahaanLama = new PerusahaanLama(nama1, lct1, id1, kuan1, hg1, tgl1);
                            dataLama.add(newPerusahaanLama);
                        break;
                    
                        case 3:
                            break;
                    }
                    break;
                    }
                    break;
                case 3:
                    while(true){
                    System.out.println("\n");
                    System.out.println("========================================================================================================");
                    System.out.println("=                                                UPDATE DATA                                           =");
                    System.out.println("========================================================================================================");
                    System.out.println("=                                          [1] Data Perusahaan Baru                                    =");
                    System.out.println("=                                          [2] Data Perusahaan Lama                                    =");
                    System.out.println("=                                          [3] Exit                                                    =");
                    System.out.println("========================================================================================================");
                    System.out.println("Pilih Menu: [1/2]");
                    int pilihan3 = Integer.parseInt(br.readLine());
                    switch(pilihan3) {
                        case 1:
                            if(dataBaru.isEmpty()) {
                                System.out.println("========================================================================================================");
                                System.out.println("=                                                                                                      =");
                                System.out.println("=                                                   Empty                                              =");
                                System.out.println("=                                                                                                      =");
                                System.out.println("========================================================================================================");
                            break;
                            } else {
                                System.out.println("========================================================================================================");
                                for(int i = 0; i < dataBaru.size(); i++) {
                                    
                                    System.out.print((i+1) + ".\t");
                                    System.out.print("Nama Barang   : "+ dataBaru.get(i).getNamaAsset());
                                    System.out.println("\n");
                                }
                                System.out.println("\n");
                                System.out.println("========================================================================================================");
                                System.out.print("Choose Name   : "); String findbru = (br.readLine());
                                System.out.println("========================================================================================================");
                                for(PerusahaanBaru bru : dataBaru) {
                                    if(bru.getNamaAsset().equals(findbru)){
                                        System.out.println("=                                               ADDING NEW DATA                                        =");
                                        System.out.println("========================================================================================================");
                                        System.out.print("Nama Barang   : ");bru.setNamaAsset(br.readLine());
                                        System.out.print("Lokasi        : ");bru.setLokasi(br.readLine());
                                        System.out.print("Id Barang     : ");bru.setIdAsset(Integer.parseInt(br.readLine()));
                                        System.out.print("Kuantitas     : ");bru.setKuantitas(Integer.parseInt(br.readLine()));
                                        System.out.print("Harga         : ");bru.setHarga(Integer.parseInt(br.readLine()));
                                        System.out.print("Tanggal       : ");bru.setTanggalBaru(Integer.parseInt(br.readLine()));
                                        System.out.println("========================================================================================================");
                                        System.out.println("=                                              UPDATE DATA SUCSSES                                     =");
                                        System.out.println("========================================================================================================");
                                    } else {
                                        System.out.println("=                                                DATA NOT EXIST                                        =");
                                        System.out.println("========================================================================================================");
                                    }
                                
                                    
                                }
                                break;
                            }
                            
                            
                        case 2:
                            if(dataLama.isEmpty()) {
                                System.out.println("========================================================================================================");
                                System.out.println("=                                                                                                      =");
                                System.out.println("=                                                   Empty                                              =");
                                System.out.println("=                                                                                                      =");
                                System.out.println("========================================================================================================");
                            break;
                            } else {
                                System.out.println("========================================================================================================");
                                for(int j = 0; j < dataLama.size(); j++) {
                                    
                                    System.out.print((j+1) + ".\t");
                                    System.out.print("Nama Barang   : "+ dataLama.get(j).getNamaAsset());
                                    System.out.println("\n");
                                }
                                System.out.println("\n");
                                System.out.println("========================================================================================================");
                                System.out.print("Choose Name   : "); String findlma = (br.readLine());
                                System.out.println("========================================================================================================");
                                for(PerusahaanLama lma : dataLama) {
                                    if(lma.getNamaAsset().equals(findlma)){
                                        System.out.println("=                                               ADDING NEW DATA                                        =");
                                        System.out.println("========================================================================================================");
                                        System.out.print("Nama Barang   : ");lma.setNamaAsset(br.readLine());
                                        System.out.print("Lokasi        : ");lma.setLokasi(br.readLine());
                                        System.out.print("Id Barang     : ");lma.setIdAsset(Integer.parseInt(br.readLine()));
                                        System.out.print("Kuantitas     : ");lma.setKuantitas(Integer.parseInt(br.readLine()));
                                        System.out.print("Harga         : ");lma.setHarga(Integer.parseInt(br.readLine()));
                                        System.out.print("Tanggal       : ");lma.setTanggalLama(Integer.parseInt(br.readLine()));
                                        System.out.println("========================================================================================================");
                                        System.out.println("=                                              UPDATE DATA SUCSSES                                     =");
                                        System.out.println("========================================================================================================");
                                    } else {
                                        System.out.println("=                                                DATA NOT EXIST                                        =");
                                        System.out.println("========================================================================================================");
                                    }
                                    
                                }
                                break;
                            }
                            
                            case 3:
                                break;
                            
                    }
                    break;
                    }
            break;
        
                case 4:
                    while(true) {
                        System.out.println("\n");
                        System.out.println("========================================================================================================");
                        System.out.println("=                                                 DELETE DATA                                          =");
                        System.out.println("========================================================================================================");
                        System.out.println("=                                          [1] Data Perusahaan Baru                                    =");
                        System.out.println("=                                          [2] Data Perusahaan Lama                                    =");
                        System.out.println("=                                          [3] Exit                                                    =");
                        System.out.println("========================================================================================================");
                        System.out.println("Pilih Menu: [1/2]");
                        int pilihan4 = Integer.parseInt(br.readLine());
                        switch(pilihan4) {
                            case 1:
                                if(dataBaru.isEmpty()) {
                                    System.out.println("=                                                                                                      =");
                                    System.out.println("=                                                   Empty                                              =");
                                    System.out.println("=                                                                                                      =");
                                    System.out.println("========================================================================================================");
                                    break;
                                } else {
                                    System.out.println("========================================================================================================");
                                    for(int i = 0; i < dataBaru.size(); i++) {
                                        System.out.print((i+1) + ".\t");
                                        System.out.print("Nama Barang   : "+ dataBaru.get(i).getNamaAsset());
                                        System.out.println("\n");
                                    }
                                    System.out.println("\n");
                                    System.out.println("========================================================================================================");
                                    System.out.print("Choose Name   : "); String findbru1= (br.readLine());
                                    System.out.println("========================================================================================================");
                                    for (int i = 0; i < dataBaru.size(); i++) {
                                        if(dataBaru.get(i).getNamaAsset().equals(findbru1)) {
                                            dataBaru.remove(i);
                                            System.out.println("=                                              DELETE DATA SUCSSES                                     =");
                                            System.out.println("========================================================================================================");
                                        } else {
                                        System.out.println("=                                                DATA NOT EXIST                                        =");
                                        System.out.println("========================================================================================================");
                                    }
                                        
                                    }
                                    break;
                            }
                            case 2:
                                if(dataLama.isEmpty()) {
                                    System.out.println("=                                                                                                      =");
                                    System.out.println("=                                                   Empty                                              =");
                                    System.out.println("=                                                                                                      =");
                                    System.out.println("========================================================================================================");
                                    break;
                                } else {
                                    System.out.println("========================================================================================================");
                                    for(int j = 0; j < dataLama.size(); j++) {
                                        System.out.print((j+1) + ".\t");
                                        System.out.print("Nama Barang   : "+ dataLama.get(j).getNamaAsset());
                                        System.out.println("\n");
                                    }
                                    System.out.println("\n");
                                    System.out.println("========================================================================================================");
                                    System.out.print("Choose Name   : "); String findlma1 = (br.readLine());
                                    System.out.println("========================================================================================================");
                                    for (int j = 0; j < dataLama.size(); j++) {
                                        if(dataLama.get(j).getNamaAsset().equals(findlma1)) {
                                            dataLama.remove(j);
                                            System.out.println("========================================================================================================");
                                            System.out.println("=                                              DELETE DATA SUCSSES                                     =");
                                            System.out.println("========================================================================================================");
                                        } else {
                                        System.out.println("=                                                DATA NOT EXIST                                        =");
                                        System.out.println("========================================================================================================");
                                    }
                                        
                                    }
                                    break;
                                }
                                
                                case 3:
                                    break;
                          
                    }
                        break;
                            
                          
                    }
                    break;
                    
                case 5 :
                    System.out.println("========================================================================================================");
                    System.out.println("=                                               EXIT PROGRAM...                                        =");
                    System.out.println("========================================================================================================");
                    System.exit(0);
                    
                default:
                    System.out.println("========================================================================================================");
                    System.out.println("=                                               MENU NOT EXIST                                         =" );
                    System.out.println("========================================================================================================");
                    break;
            }
        
        
        
    }
        
    }
        
    public static void menu(){
        System.out.println("\n");
        System.out.println("========================================================================================================");
        System.out.println("=                                                  MENU                                                =");
        System.out.println("========================================================================================================");
        System.out.println("=                                             [1] Read Asset                                           =");
        System.out.println("=                                             [2] Add Asset                                            =");
        System.out.println("=                                             [3] Update Asset                                         =");
        System.out.println("=                                             [4] Delete Asset                                         =");
        System.out.println("=                                             [5] Exit                                                 =");
        System.out.println("========================================================================================================");
        
        System.out.println("Pilih Menu: [1/2/3/4/5]");
        
               
        }
    
    public static void garis() {
        System.out.println("========================================================================================================");
    }
}
