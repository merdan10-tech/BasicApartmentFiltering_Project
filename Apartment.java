package Week7.ProgrammingProject4;

public class Apartment {
    
    // Step 1: Declare attributes
    private int apartmentNumber;
    private int bedroomsNumber;
    private int bathroomsNumber;

    // Step 2: Constructor
    public Apartment(int apartmentNumber, int bedroomsNumber, int bathroomsNumber) {
        this.apartmentNumber = apartmentNumber;
        this.bedroomsNumber = bedroomsNumber;
        this.bathroomsNumber = bathroomsNumber;
    }

    // Step 3: Getters
    public int getApartmentNumber() {
        return this.apartmentNumber;
    }
    public int getBedroomsNumber() {
        return this.bedroomsNumber;
    }
    public int getBathroomsNumber() {
        return this.bathroomsNumber;
    }

    // Step 4: Override the toString method to print the object details

    public String toString() {
        return "Apartment --> Apartment Number: " + apartmentNumber + " Number of Bedrooms: " + bedroomsNumber +
        " Number of Bathrooms: " + bathroomsNumber;

    }
    
}
