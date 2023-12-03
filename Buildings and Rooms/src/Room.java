public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    Room (int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
    public int getNumberOfLamps (){
        return this. numberOfLamps;
    }
    public int getNumberOfWindows (){
        return this.numberOfWindows;
    }
}
