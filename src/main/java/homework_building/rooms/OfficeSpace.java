package homework_building.rooms;

import homework_building.enums.Furniture;
import homework_building.enums.RoomType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class OfficeSpace extends Room {

    @Getter
    private int number;
    private int desks;

    public OfficeSpace(int numberOffice, int desks, List<Furniture> furnitureData) {
        super(RoomType.OFFICE_SPACE);
        this.number = numberOffice;
        this.desks = desks;
        furnitures.addAll(furnitureData);
//        furnitures.add(Furniture.DESK);
    }

    @Override
    public String getDescription() {
        // return this.desks +" "+ Furniture.DESK;
        String description = "";
        for (Furniture f : furnitures) {
            if (f == Furniture.DESK) {
                description = description + " " + this.desks + " " + f.toString().toLowerCase();
            } else {
                description = description + " " + f.toString().toLowerCase();
            }

        }
        return description;
    }

    @Override
    public Integer getNumberOfRooms() {
        return this.number;
    }

}
