package homework_building.rooms;

import homework_building.enums.Furniture;
import homework_building.enums.RoomType;
import lombok.Getter;

public class ConferenceRoom extends Room {

    @Getter
    private int number;
    private int seats;
    private boolean hasTelepresence;

    public ConferenceRoom(int numberConferenceRoom, int seats, boolean hasTelepresence) {
        super(RoomType.CONFERENCE_ROOM);
        this.number = numberConferenceRoom;
        this.seats = seats;
        this.hasTelepresence = hasTelepresence;
        furnitures.add(Furniture.SEAT);

        if (seats > 20) {
            furnitures.add(Furniture.VIDEO_PROJECTOR);
        } else {
            furnitures.add(Furniture.TV);
        }
        if (hasTelepresence) {
            furnitures.add(Furniture.TELEPRESENCE);
        }
    }

    @Override
    public String getDescription() {
        return seats + " seats " + (hasTelepresence ? " with Telepresence " : " ");
    }

    @Override
    public Integer getNumberOfRooms() {
        return this.number;
    }


}
