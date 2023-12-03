public class Building {
    Room[] rooms = new Room[10];
    private int numberOfBathrooms;
    private int numberOfFloors;
    private String isOfficeBuilding;

    Building(Room[] rooms, int numberOfBathrooms, int numberOfFloors, String isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public void Building() {
        for (int i = 0; i < rooms.length; i++) {

            rooms[i] = new Room(1, 4, 5);
        }
    }

    public int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public String getIsOfficeBuilding() {
        return this.isOfficeBuilding;
    }
}