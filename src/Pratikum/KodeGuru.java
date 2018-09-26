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
 class KodeGuru extends Sekolah {
    private String kodeGuru ;

    public KodeGuru(String namaGuru, String mapel, String materiMapel, String kodeGuru) {
        super(namaGuru, mapel, materiMapel);
          this.kodeGuru = kodeGuru ;
   }
    
   public void info (){
       System.out.println("Kode Guru :" + this.kodeGuru);
       super.info();
   }
   }
    
    
    

