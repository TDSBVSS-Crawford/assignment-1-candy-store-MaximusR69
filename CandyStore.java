import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        String candy; 
        int quantity; 
        double cost;
        double tax = 0.13;
        
        System.out.println("Welcome to the candy shop!"); //welcome screen

        System.out.println("Please write quit to stop"); //asks if you want to end the loop

    while (true){
        candy = candyChoices(scanner);
        
        if (candy.equalsIgnoreCase("quit")){ //ends the loop
            break;
        }
        else
        {
        
        //quantity 
        System.out.println("Enter the quantity");
        quantity = scanner.nextInt();
        scanner.nextLine();
        
        //cost calculated
        cost = calculateCost(candy, quantity);

                    //Recipt
        System.out.println("------------------");
        System.out.println("Recipt");
        System.out.println("Candy" + candy);
        System.out.println("Quanity" + quantity);
        System.out.println("Cost before tax" + cost);
        System.out.println("The Tax" + (cost * tax));
        System.out.println("Total cost with tax" + (cost + (cost * tax)));
        System.out.println("Thank for coming to the candy shop!");

        } //end main

    }
}
    public static String candyChoices(Scanner scanner) {

        System.out.println("Please choose from the following options or type quit to exit:");
        System.out.println("a) Reese's Pieces: $2.50/0.5 kg");
        System.out.println("b) Skittles: $1.75/1 kg");
        System.out.println("c) Jubjubes: $0.50/1 kg");
        System.out.println("d) Lollipops: 1 for $0.50 or 5 for $2.00");
        System.out.println("e) Smarties: $1.50/1 kg");
        System.out.println("Choose a candy");
        
        String choice = scanner.nextLine();
       
        return choice;  
    }

    public static double calculateCost(String candy, int quantity) {
        double cost = 0.0;
        switch(candy){
            case "a":
            cost = quantity * 2.5; //cost reese's
            break;
            case "b":
            cost = quantity * 1.75; // cost of Skittles
            break;
            case "c":
            cost = quantity * 0.5; // cost of Jubjubes
            break;
            case "d": // cost of lolipops
            int Lollipops5 = quantity / 5;// cost of lolipops if you choose 5
            int Lollipops1 = quantity % 5;// cost of lolipops if you choose 1
            cost = Lollipops5 * 2.0 + Lollipops1 * 0.5;
            break;
            case "e":
            cost = quantity * 1.5; //cost of Smarties 
            break;
        }


        
        return cost;
    }
} // end class