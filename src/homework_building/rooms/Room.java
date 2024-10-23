package homework_building.rooms;

import homework_building.enums.Furniture;
import homework_building.enums.RoomType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public abstract class Room {

    @Getter
    @Setter
    protected RoomType roomType;
    @Getter
    protected List<Furniture> furnitures = new ArrayList<>();

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public abstract String getDescription();

    public abstract Integer getNumberOfRooms();


}
