package entity;

import service.ParkingSpot;

public class Admin {
    private final String adminId;
    ParkingSpot parkingSpot;

    public Admin(String adminId, ParkingSpot parkingSpot) {
        this.adminId = adminId;
        this.parkingSpot = parkingSpot;
    }

    public String getAdminId() {
        return adminId;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
