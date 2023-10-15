package Week7.ProgrammingProject4;

import java.util.Scanner;

public class TestApartments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create 5 apartment objects. For this we need to have to use array
        Apartment[] apartments = new Apartment[5];

        apartments[0] = new Apartment(221, 1, 2);
        apartments[1] = new Apartment(222, 3, 3);
        apartments[2] = new Apartment(223, 4, 3);
        apartments[3] = new Apartment(224, 4, 4);
        apartments[4] = new Apartment(225, 6, 7);

        // Step 2: Prompt the user and get output
        System.out.println("Please enter the min number of bedrooms required: ");
        int minBedrooms = input.nextInt();

        System.out.println("Please enter the min number of bathrooms required: ");
        int minBathrooms = input.nextInt();

        // Step 3: Display all apartments that meet criteria
        boolean foundApartments = false;
        for (Apartment apartment : apartments) {
            if(apartment.getBedroomsNumber() >= minBedrooms && apartment.getBathroomsNumber() >= minBathrooms) {
                System.out.println(apartment);
                foundApartments = true;
            }
        }
        
        if (!foundApartments) {
            System.out.println("No apartments meet the specified criteria");
        }
        input.close();

    }
}
