/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author asus
 */
public class Sekolah {

    private String namaGuru;
    private String mapel;
    private String materiMapel;

    public Sekolah(String namaGuru, String mapel, String materiMapel) {
        this.namaGuru = namaGuru;
        this.mapel = mapel;
        this.materiMapel = materiMapel;
    }

    public void info() {
        System.out.println("Nama Guru :" + this.namaGuru);
        System.out.println("Mapel :" + this.mapel);
        System.out.println("Materi Mapel :" + this.materiMapel);

    }

}
