import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Seats> seats = new ArrayList<>();
        List<Food> food = new ArrayList<>();
        List<Booze> booze = new ArrayList<>();
        List<Others> otherButtons = new ArrayList<>();


        Seats b1 = new Seats("Bar1", 0.0, true, 5, 5, 100, 50);
        Seats b2 = new Seats("Bar2", 0.0, true,110,5,100,50);
        Seats b3 = new Seats("Bar3", 0.0, true,215,5,100,50);
        Seats b4 = new Seats("Bar4", 0.0, true,320,5,100,50);
        Seats b5 = new Seats("Bar5", 0.0, true,425,5,100,50);

        Booze d1 = new Booze("Wine", 6.00, 5, 200, 100, 50);
        Booze d2 = new Booze("Beer", 4.00, 110, 200, 100, 50);
        Booze d3 = new Booze("HardStuff", 8.00, 215, 200, 100, 50);

        Food f1 = new Food("Pizza", 10.50, 5, 5, 100, 50);
        Food f2 = new Food("Burger", 12.50, 110, 5, 100, 50);
        Food f3 = new Food("Pasta", 15, 215, 5, 100, 50);

        Others backButton = new Others("Back", 5, 500,100,50);
        Others printButton = new Others("Print", 110, 500, 100, 50);
        Others closeButton = new Others("Close", 215, 500, 100 ,50);

        otherButtons.add(backButton);
        otherButtons.add(printButton);
        otherButtons.add(closeButton);

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

        new UserInterface(seats, food, booze, otherButtons);

    }

}
