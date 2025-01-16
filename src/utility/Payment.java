package utility;

import entity.Vehicle;

import java.util.Date;

//Strategy Pattern
public class Payment {
    Vehicle vehicle;

    public double calculateParkingCharge(){
        long currentTime=(vehicle.getEntryTime().getTime()-new Date().getTime())/(1000*60*60);

        if(vehicle.getVehicleType().equals("bike")){
            return currentTime*10;
        }
        return currentTime*20;
    }
}
