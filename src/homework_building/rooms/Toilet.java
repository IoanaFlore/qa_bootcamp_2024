package homework_building.rooms;

import homework_building.enums.Furniture;
import homework_building.enums.RoomType;
import lombok.Getter;

import java.util.List;

public class Toilet extends Room {

    @Getter
    private int number;

    public Toilet(int numberToilet, List<Furniture> furnitureData) {
        super(RoomType.TOILET);
        this.number = numberToilet;
        furnitures.addAll(furnitureData);

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
