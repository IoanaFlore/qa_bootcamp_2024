package homework_building;

import homework_building.rooms.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class Building {

    private final HashMap<Integer, Floor> floors = new HashMap<>();
    @Getter
    @Setter
    private String name;

    public Building(String name) {
        this.name = name;
    }

    public void addFloor(Integer floor_number, Floor floor) {
        this.floors.put(floor_number, floor);
    }

    public String toString() {
        System.out.println("Builidng " + this.name + " has " + this.floors.size() + " floors");
        for (int key : this.floors.keySet()) {
            Floor floorData = this.floors.get(key);
            System.out.println(floorData);
            for (Room r : floorData.getRooms()) {
                System.out.println(r.getNumberOfRooms() + " " + r.getRoomType());
                for (int i = 1; i <= r.getNumberOfRooms(); i++) {
                    System.out.print("   " + r.getRoomType() + " " + i + ": " + r.getDescription() + "\n");
                }

                System.out.println();
            }

        }
        return "";
    }
}
