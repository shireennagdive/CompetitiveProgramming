package ParkingLot;

public class Level {
    private int floor;
    private ParkingSpot[] parkingSpots;
    private static int SPOTS_PER_ROW = 10;
    private int availableSpots = 0;

    public Level(int floor, int numberOfAvailableSpots) {
        this.floor = floor;
        availableSpots = numberOfAvailableSpots;
        parkingSpots = new ParkingSpot[numberOfAvailableSpots];
        int row;
        int largeSpots = numberOfAvailableSpots / 4; //7
        int motorCycleSpots = numberOfAvailableSpots / 4; //7
        int compactSpots = numberOfAvailableSpots - largeSpots - motorCycleSpots;
        for (int i = 0; i < numberOfAvailableSpots; i++) {
            VehicleSize vehicleSize = VehicleSize.MOTOR_CYCLE;
            if (i < largeSpots) {
                vehicleSize = VehicleSize.LARGE;
            } else if (i < largeSpots + compactSpots) {
                vehicleSize = VehicleSize.COMPACT;
            }
            row = i / SPOTS_PER_ROW;
            parkingSpots[i] = new ParkingSpot(this, row, i, vehicleSize);
            //jdk - provides env to develop and run/execute java application
            // jre - provides env to just run java (customer/client)
            //jvm - in jre, jvm is responsible to run
            //jvm - interpretor // jvm executes our code line by line
            //jdk = jre + dev tools
            //jre = jvm + library classes
        }
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (getAvailableSpots() < vehicle.spotsNeeded) return false;
        int startSpotNumber = findAvailableSpots(vehicle);
        return startSpotNumber >= 0 && parkAtStartingSpot(startSpotNumber, vehicle);
    }

    private boolean parkAtStartingSpot(int startSpotNumber, Vehicle vehicle) {
        vehicle.clearSpots();
        boolean success = true;
        for (int i = startSpotNumber; i < startSpotNumber + vehicle.spotsNeeded; i++) {
            success &= parkingSpots[i].park(vehicle);
        }
        availableSpots -= vehicle.getSpotsNeeded();
        return success;
    }

    private int findAvailableSpots(Vehicle vehicle) {
        int spotsNeeded = vehicle.getSpotsNeeded();
        int spotsFound = 0;
        int lastRow = -1;
        for (int i = 0; i < parkingSpots.length; i++) {
            ParkingSpot spot = parkingSpots[i];
            if (lastRow != spot.getRow()) {
                spotsFound = 0;
                lastRow = spot.getRow();
            }
            if (spot.canFitVehicle(vehicle)) {
                spotsFound++;
            } else {
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded) {
                return i - (spotsNeeded - 1);
            }

        }

        return -1;
    }


}
