/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author asus
 */
public class MountainTruck extends Truck {

    //the Montaintruck subclass adds one fields
    public int seatHeight;

    //the Mountaintruck subclass has one contructor
    public MountainTruck(int startHeight, int startCadence, int startGear, int startSpeed) {
        super(startCadence, startGear, startSpeed);
        seatHeight = startHeight;
    }

    //the MontainTruck subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] aku) {
        System.out.println("mulai Berjalan");
        MountainTruck MB = new MountainTruck(0, 0, 0, 0);
        System.out.println("gear =" + MB.gear);
        System.out.println("speed =" + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear =" + MB.gear);
        System.out.println("speed =" + MB.speed);
        MB.speedUp(2);
        System.out.println("gear =" + MB.gear);
        System.out.println("speed =" + MB.speed);

    }
}
