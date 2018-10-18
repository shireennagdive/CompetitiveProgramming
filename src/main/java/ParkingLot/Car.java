package ParkingLot;

public class Car extends Vehicle {
    public Car() {
        size = VehicleSize.COMPACT;
        spotsNeeded = 1;
    }

    @Override
    public boolean canVehicleFitInSpot(ParkingSpot parkingSpot) {
        return parkingSpot.getSpotSize() == VehicleSize.LARGE || parkingSpot.getSpotSize() == VehicleSize.COMPACT;
    }
}
