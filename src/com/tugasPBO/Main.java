package com.tugasPBO;
/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : PBO1/ IF1
  Deskripsi : menampilkan nilai akhir mahasiswa
* */

public class Main {
    public static void main(String[] args){
        Nilai n = new Nilai(75,45,34);

        System.out.println("QUIZ : "+n.getQuiz());
        System.out.println("UTS  : "+n.getUts());
        System.out.println("UAS  : "+n.getUas()+"\n");
        double hasil = n.NilaiAkhir(n.getQuiz(),n.getUas(),n.getUts());
        System.out.println("Nilai Akhir :"+hasil+"\n");
        System.out.println("Indeks  :"+n.Index(hasil));
        System.out.println("Keterangan  :"+n.keterangan(n.Index(hasil)));


    }
}
