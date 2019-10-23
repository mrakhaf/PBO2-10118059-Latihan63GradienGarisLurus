/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan63gradiengarislurus;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat titik = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik (" + titik.getX1() + "," + titik.getY1() + ") dan (" + titik.getX2() + "," + titik.getY2() + ")");
        System.out.println("memiliki Gradien sebesar " + titik.hitungGradien());
        System.out.println("");
        Koordinat titik2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (" + titik2.getX1() + "," + titik2.getY1() + ") dan (" + titik2.getX2() + "," + titik2.getY2() + ")");
        System.out.println("memiliki Gradien sebesar " + titik2.hitungGradien());
    }
    
}
