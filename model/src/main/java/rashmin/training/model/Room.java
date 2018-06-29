package rashmin.training.model;

public class Room {

    private String roomType;
    private int price;
    private int maxAdults;

    public Room(String roomType, int price, int maxAdults) {
        this.roomType = roomType;
        this.price = price;
        this.maxAdults = maxAdults;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxAdults() {
        return maxAdults;
    }

    public void setMaxAdults(int maxAdults) {
        this.maxAdults = maxAdults;
    }

}
