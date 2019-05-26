//Java application for mobile application for an imaginary fast- food restaurant, Flyers’//

import java.util.Scanner;

public class RestaurantFlyers {

	public static void main(String[] args) {
		// Method of delivery service
		Scanner imTheReader = new Scanner(System.in);
	
		boolean deliveryService=false;
	
	    int delivery = 0;
	    int zip = 0;
	    int deliveryCost = 0;
		while(deliveryService == false)
		{
		    System.out.println(" Delivery service : ");

            System.out.println("1. Pick-Up");
    
            System.out.println("2. Delivery");
    
            System.out.print("Enter your choice(1 or 2) : ");
            delivery = imTheReader.nextInt();
          
            // Delivery choice
            if (delivery == 2)
            {
                 System.out.println("Delivery zipcode choice : ");
                System.out.print("Zip code: ");
                zip = imTheReader.nextInt();
    		    
    		    if(zip >= 60441 && zip <= 60451)
    		    {
    		        if(zip == 60441 || zip == 60451)
    		        {
    		            System.out.println("Delivery with extra cost ($7.00)");
    		            deliveryCost = 7;
    		        }
    		        else
    		        {
    		            System.out.println("Delivery Available ($5.00).");
    		            deliveryCost = 5;
    		        }
    		        
    		        deliveryService = true;
    		    }
    		    else
    		        System.out.println("Delivery Not Available.");
            }
            else
                break;
		}
        
        //item on the menu
        
        System.out.println(" item: ");

        System.out.println("1. Flyers' Burger: $4.50");

        System.out.println("2. Flyers' Drink: $1.50");

        System.out.println("3. Flyers' Fries: $2.50");

        System.out.println("4. Flyers' Desert: $3.00");
        
        int item = 1;
        double sum = 0;
        while( item != 0)
        {
            System.out.print("Enter your choice(1-4) : ");
            item = imTheReader.nextInt();
            if(item == 1 || item == 2 || item == 3 || item == 4)
            {
                if (item == 1)
                    sum = sum + 4.5;
                if (item == 2)
                    sum = sum + 1.50;
                if (item == 3)
                    sum = sum + 2.50;
                if (item ==4)
                    sum = sum + 3.00;

                System.out.println("Added to the list. Enter another choice (1-4, 0 to not add more)");
            }
            else
            {
                if(item != 0)
                    System.out.println("Not a valid item");
            }
        }
        
        //Final prints and costs with all the choices from the user
        if(deliveryService == false)
        {
            System.out.println("The total without taxes for pick-up: $"+sum);
            double total = sum + (sum * 0.05);
            System.out.println("The total with taxes: $"+total);
        }
        else
        {
            System.out.println("The Total without delivary and taxes: "+sum);
            double total = sum + (sum * 0.05) + deliveryCost;
            System.out.println("The Total with Taxes and delivery: " +total);
        }
       
	}
}