package com.map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

    public static void main(String[] args) {
        // membuat objek treemap
        TreeMap<Integer, String> hari = new TreeMap<>();
        // mengisi nilai ke objek days
        hari.put(1, "Minggu");
        hari.put(2, "Senin");
        hari.put(3, "Selasa");
        hari.put(4, "Rabu");
        hari.put(5, "Kamis");
        hari.put(6, "Jum'at");
        hari.put(7, "Sabtu");

        // mencetak semua isi dari objek days
        for(Map.Entry<Integer,String> hariEntry : hari.entrySet()){
            System.out.println("Key : "+ hariEntry.getKey() + " Data : "+ hariEntry.getValue());
        }

        System.out.println(" ");
//ambil data berdasarkan key
        int key = 5;
        System.out.println("Key : "+ key +" Data : "+ hari.get(key));

        System.out.println(" ");
//cari data berdasarkan value key
        int kadal = 4;
        if (hari.containsKey(kadal)){
            System.out.println("Key: " + kadal + " data " + hari.get(kadal));
        } else {
            System.out.println("Key tidak terdaftar");
        }

        System.out.println(" ");
//        Cari data berdasarkan value data

        Integer iKey = null;
        String data = "Sabtu";

        for(Map.Entry<Integer, String> hariEntry : hari.entrySet()){
            if (hariEntry.getValue().equals(data)){
                iKey = hariEntry.getKey();
                break;
            } else iKey = null;
        }
        if (iKey != null){
            System.out.println("Key: " + key + " data " + hari.get(iKey));
        } else System.out.println("Key tidak terdaftar");

        System.out.println(" ");
//        mengetahui panjang treemap
        hari.size();
        System.out.println("Jumlah data: " + hari.size());

        System.out.println(" ");
//        menghapus hari data berdasarkan key
        System.out.println("JUmalh data sebelum dihapus: " +hari.size());
        hari.remove(key);
        System.out.println("Jumlah data setelah dihapus: " +hari.size());

        System.out.println("");
//        menghapus data berdasarkan semua data
        System.out.println("jumlah data sebelum dihapus: " + hari.size());
        hari.clear();
        System.out.println("jumlah data Setelah dihapus: " + hari.size());

    }


}
