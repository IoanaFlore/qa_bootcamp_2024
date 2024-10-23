package homework_building;

import homework_building.enums.Furniture;
import homework_building.rooms.*;

import java.util.Arrays;
import java.util.List;


public class BuildingStructure {
    public static void main(String[] args) {

        Building building = new Building("X");

        // First Floor
        Floor firstFloor = new Floor(1);
        firstFloor.addRoom(new OfficeSpace(1, 20, RoomConfiguration.DEFAULT_OFFICE));
        firstFloor.addRoom(new Toilet(2, RoomConfiguration.DEFAULT_TOILET));
        firstFloor.addRoom(new Kitchen(1, RoomConfiguration.DEFAULT_KITCHEN_FURNITURES));
        firstFloor.addRoom(new ConferenceRoom(3, 10, false));
        building.addFloor(firstFloor.getFloorNumber(), firstFloor);


        // First Floor
        Floor secondFloor = new Floor(2);
        secondFloor.addRoom(new OfficeSpace(2, 10, RoomConfiguration.DEFAULT_OFFICE));
        secondFloor.addRoom(new Toilet(2, RoomConfiguration.DEFAULT_TOILET));
        secondFloor.addRoom(new Kitchen(1, RoomConfiguration.CUSTOM_KITCHEN_1));
        secondFloor.addRoom(new ConferenceRoom(4, 8, false));
        building.addFloor(secondFloor.getFloorNumber(), secondFloor);


        // First Floor
        Floor thirdFloor = new Floor(3);
        thirdFloor.addRoom(new Toilet(2, RoomConfiguration.DEFAULT_TOILET));
        thirdFloor.addRoom(new ConferenceRoom(1, 30, true));
        thirdFloor.addRoom(new ConferenceRoom(1, 20, true));
        thirdFloor.addRoom(new ConferenceRoom(4, 10, false));
        building.addFloor(thirdFloor.getFloorNumber(), thirdFloor);

        System.out.println(building);
    }
}

