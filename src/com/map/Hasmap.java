package com.map;

import java.util.HashMap;

public class Hasmap {

    public static void main(String[] args)
    {
        // membuat objek hashmap
        HashMap<Integer, String> days = new HashMap<Integer, String>();
        // mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");
        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);
//        tampilkan berdasarkan key
        System.out.println("Hari kedua: " + days.get(4));
        System.out.println("Hari kedua: " + days.get(5));
        System.out.println("Hari kedua: " + days.get(6));
//        Delete
        days.remove(2);
        System.out.println("Isi objek days: " + days);
//        replace
        days.put(1, "Jadi Ahad");
        days.replace(4, "Jadi Rabo");
        System.out.println("Isi objek days: " + days);
    }
}
