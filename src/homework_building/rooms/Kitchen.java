package homework_building.rooms;

import homework_building.enums.Furniture;
import homework_building.enums.RoomType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Kitchen extends Room {

    @Getter
    private int number;

    public Kitchen(int numberKitchen, List<Furniture> furnituresData) {
        super(RoomType.KITCHEN);
        this.number = numberKitchen;
        furnitures.addAll(furnituresData);
    }

    @Override
    public String getDescription() {
        String description = "";
        for (Furniture f : furnitures) {
            description = description + " " + f.toString().toLowerCase();
        }
        return description;
    }

    @Override
    public Integer getNumberOfRooms() {
        return this.number;
    }
}
