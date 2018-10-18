package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected List<ParkingSpot> parkingSpots = new ArrayList<>();
    public VehicleSize size;
    public String licensePlate;
    protected int spotsNeeded;

    //inher poly abstra encap
    public VehicleSize getSize() {
        return size;
    }

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public void parkInSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public void removeVehicleFromSpot() {

    }

    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); i++) {
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();

    }

    public abstract boolean canVehicleFitInSpot(ParkingSpot parkingSpot);
}
