package service;

public class ParkingSpot {
    private final String parkingSpotId;
    private final String vehicleType;
    private boolean isOccupied;
    private String vehicleId;

    public ParkingSpot(String parkingSpotId, String vehicleType, boolean isOccupied, String vehicleId) {
        this.parkingSpotId = parkingSpotId;
        this.vehicleType = vehicleType;
        this.isOccupied = isOccupied;
        this.vehicleId = vehicleId;
    }

    public void setFreeParkingSpace(){
        this.isOccupied=false;
    }

    public String getParkingSpotId() {
        return parkingSpotId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
}
