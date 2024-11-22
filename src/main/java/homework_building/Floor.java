package homework_building;

import homework_building.rooms.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    @Getter
    @Setter
    private int floorNumber;
    @Getter
    private List<Room> rooms = new ArrayList<>();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }


    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public String toString() {
        return "Floor " + this.floorNumber + ":";
    }
}
