/* CarCareChoice.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   10/14/2016
*/

import java.util.Scanner;

public class CarCareChoice
    {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
        {
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};

        System.out.println("Choose from the following for a price listing: ");
        for (int i = 0; i < services.length; i++)
            {
                System.out.println(services[i]);
            }
        System.out.print(">> ");
        String input = scan.nextLine();
        for (int x = 0; x < services.length; x++)
            {
                if (services[x].equals(input))
                    System.out.println("The cost is $" + prices[x]);
            }
        }// end main method
    }
