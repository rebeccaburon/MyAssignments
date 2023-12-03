public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(1, 3, 4);
        Room r2 = new Room(2, 4, 5);
        Room r3 = new Room(3, 5, 6);


        Building building1 = new Building(new Room[]{r1, r2, r3}, 10, 10, "Main Building");
        int totalLamps = countLampsInBuilding(building1);
        System.out.println("Total of lamps is: " + totalLamps);

    }

    public static  int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.rooms) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
}

