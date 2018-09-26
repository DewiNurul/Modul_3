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
public class Siswa extends KodeGuru {

    public int siswaFisika;

    public Siswa(String namaGuru, String mapel, String materiMapel, String kodeGuru, int siswaFisika) {
        super(namaGuru, mapel, materiMapel, kodeGuru);
        this.siswaFisika = siswaFisika;

    }

    public void info() {
        System.out.println(" Siswa Fisika :" + this.siswaFisika);

        super.info();
    }

}
