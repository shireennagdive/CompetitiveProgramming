package ParkingLot;

public class MotorCycle extends Vehicle {
    public MotorCycle(){
        size = VehicleSize.COMPACT;
        spotsNeeded = 5;
    }

    @Override
    public boolean canVehicleFitInSpot(ParkingSpot parkingSpot) {
        return parkingSpot.getSpotSize() == VehicleSize.COMPACT ||
                parkingSpot.getSpotSize() == VehicleSize.LARGE ||
                parkingSpot.getSpotSize() == VehicleSize.MOTOR_CYCLE ;
    }

}
