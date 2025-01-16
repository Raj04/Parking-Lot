package entity;

import java.util.Date;

//factory pattern to create objects
public class Vehicle {
    private final String vehicleId;
    private final String vehicleType;
    private final Date entryTime;

    public Vehicle(String vehicleId, String vehicleType,Date entryTime) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.entryTime=new Date();
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }


    public Date getEntryTime() {
        return entryTime;
    }

}
