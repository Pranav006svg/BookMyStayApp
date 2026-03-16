public abstract class Room {

    // Number of beds in the room
    protected int numberOfBeds;

    // Room size in square feet
    protected int squareFeet;

    // Price per night
    protected double pricePerNight;

    // Constructor used by child classes
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    // Display room details
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}
