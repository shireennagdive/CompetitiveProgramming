package ParkingLot;

public class Bus extends Vehicle {
    public Bus(){
        size = VehicleSize.LARGE;
        spotsNeeded = 5;

    }

    @Override
    public boolean canVehicleFitInSpot(ParkingSpot parkingSpot) {
        return parkingSpot.getSpotSize() == VehicleSize.LARGE;
    }

}
