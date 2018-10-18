package ParkingLot;

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int spotNumber;
    private Level level;
    private int row;

    public ParkingSpot(Level level, int row, int spotNumber, VehicleSize spotSize) {
        this.spotSize = spotSize;
        this.spotNumber = spotNumber;
        this.level = level;
        this.row = row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public int getRow() {
        return row;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public boolean isSpotAvailable() {
        return vehicle == null;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public boolean park(Vehicle v) {
        if (!canFitVehicle(v)) return false;
        this.vehicle = v;
        v.parkInSpot(this);
        return true;
    }

    public boolean canFitVehicle(Vehicle v) {
        return isSpotAvailable() && v.canVehicleFitInSpot(this);
    }

}
