import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javafx.application.Application.launch;

public class Main {

    public static void main(String[] args) {
        List<Seats> seats = new ArrayList<>();
        List<Food> food = new ArrayList<>();
        List<Booze> booze = new ArrayList<>();

        Seats b1 = new Seats("Bar1", 0.0, true, 5, 5, 100, 50);
        Seats b2 = new Seats("Bar2", 0.0, true,110,5,100,50);
        Seats b3 = new Seats("Bar3", 0.0, true,215,5,100,50);
        Seats b4 = new Seats("Bar4", 0.0, true,320,5,100,50);
        Seats b5 = new Seats("Bar5", 0.0, true,425,5,100,50);

        Booze d1 = new Booze("Wine", 6.00, 5, 5, 100, 50);
        Booze d2 = new Booze("Beer", 4.00, 110, 5, 100, 50);
        Booze d3 = new Booze("HardStuff", 8.00, 215, 5, 100, 50);

        Food f1 = new Food("Pizza", 10.50, 5, 5, 100, 50);
        Food f2 = new Food("Burger", 12.50, 110, 5, 100, 50);
        Food f3 = new Food("Pasta", 15, 5, 215, 100, 50);

        seats.add(b1);
        seats.add(b2);
        seats.add(b3);
        seats.add(b4);
        seats.add(b5);

        booze.add(d1);
        booze.add(d2);
        booze.add(d3);

        food.add(f1);
        food.add(f2);
        food.add(f3);

        new UserInterface(seats, food, booze);


//        boolean inService = true;
//        boolean printSeats = true;
//        boolean printFood = false;
//        Scanner reader = new Scanner(System.in);
//        int position = 0;
//
//

//
//        while(inService){
//
//            if(printSeats) {
//                Seats.printSeats(seats);
//                System.out.println("Enter bar seat:");
//                String seatChoice = reader.nextLine();
//                for (int i = 0; i < seats.size(); i++) {
//                    if (seats.get(i).getName().equals(seatChoice)) {
//                        position = i;
//                        printSeats = false;
//                        printFood = true;
//                    }
//                }
//            }
//            else if(printFood){
//                Food.printFood(food);
//                System.out.printf("Enter food to add: ");
//                String foodChoice = reader.nextLine();
//                for (int i = 0; i < food.size(); i++) {
//                    if(foodChoice.equals("Seats")){
//                        printSeats = true;
//                        printFood = false;
//                    }
//                    else if (foodChoice.equals("Booze")){
//                        printSeats = false;
//                        printFood = false;
//                    }
//                    else if (food.get(i).getName().equals(foodChoice)) {
//                        seats.get(position).addToBill(food.get(i).getName(), food.get(i).getAmt());
//                        System.out.println(seats.get(position).getAmt());
//
//                    }
//                }
//            }
//            else {
//                Booze.printBooze(booze);
//                System.out.printf("Enter Booze to add: ");
//                String boozeChoice = reader.nextLine();
//                for (int i = 0; i < food.size(); i++) {
//                    if(boozeChoice.equals("Seats")){
//                        printSeats = true;
//                        printFood = false;
//                    }
//                    else if (boozeChoice.equals("Food")){
//                        printSeats = false;
//                        printFood = true;
//                    }
//                    else if (booze.get(i).getName().equals(boozeChoice)) {
//                        seats.get(position).addToBill(booze.get(i).getName(), booze.get(i).getAmt());
//                        System.out.println(seats.get(position).getAmt());
//                    }
//                }
//            }
//        }
    }
}
