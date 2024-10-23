package homework_building.rooms;

import homework_building.enums.Furniture;

import java.util.Arrays;
import java.util.List;

public class RoomConfiguration {

    public static final List<Furniture> DEFAULT_KITCHEN_FURNITURES =
            Arrays.asList(Furniture.COFFEE_MACHINE, Furniture.FRIDGE, Furniture.WATER_DISPENSER);

    public static final List<Furniture> CUSTOM_KITCHEN_1 =
            Arrays.asList(Furniture.COFFEE_MACHINE, Furniture.FRIDGE, Furniture.WATER_DISPENSER, Furniture.SINK);

    public static final List<Furniture> DEFAULT_TOILET =
            Arrays.asList(Furniture.SHOWER, Furniture.SINK);

    public static final List<Furniture> DEFAULT_OFFICE =
            Arrays.asList(Furniture.DESK);
}
