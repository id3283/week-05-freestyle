package hotel;

public class Room {
    private boolean occupied;
    private boolean dirty;
    private int roomNumber;

    public Room(int number) {
        this.roomNumber = number;
    }

    public void checkIn() {
        this.occupied = true;
        this.dirty = true;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void display() {
        System.out.println("Room number: " + this.roomNumber + " Occupied: " + this.occupied + " Dirty: " + this.dirty);
    }
}
