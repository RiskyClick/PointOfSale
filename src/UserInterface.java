import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class UserInterface extends JFrame implements ActionListener{

    List<Seats> seats;
    List<Food> food;
    List<Booze> booze;
    boolean foodMenu = false;
    boolean drinkMenu = false;
    boolean seatMenu = true;

    UserInterface(List<Seats> seats, List<Food> food, List<Booze> booze) {
        this.booze = booze;
        this.food = food;
        this.seats = seats;
        setTitle("POS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 750);
        setLayout(null);
        setVisible(true);
        displayButtens();

    }

    private void displayButtens() {
        System.out.println(seatMenu);
        System.out.println(foodMenu);
        System.out.println(drinkMenu);
        if (seatMenu) {
            for(Seats s: seats){
                add(s.getButton());
                s.getButton().addActionListener(this);
                s.getButton().setVisible(true);
            }
            for (Booze b : booze) {
                b.getButton().setVisible(false);
            }
            for (Food f : food) {
                f.getButton().setVisible(false);
            }
        } else if (drinkMenu) {
            for(Booze b: booze){
                add(b.getButton());
                b.getButton().addActionListener(this);
                b.getButton().setVisible(true);
            }
            for (Seats s : seats) {
                s.getButton().setVisible(false);
            }
            for (Food f : food) {
                f.getButton().setVisible(false);
            }
        } else if (foodMenu) {
            for(Food f: food){
                add(f.getButton());
                f.getButton().addActionListener(this);
                f.getButton().setVisible(true);
            }
            for (Seats s : seats) {
                s.getButton().setVisible(false);
            }
            for (Booze b : booze) {
                b.getButton().setVisible(false);
            }
        } else {
            for (Seats s : seats) {
                s.getButton().setVisible(false);
            }
            for (Booze b : booze) {
                b.getButton().setVisible(false);
            }
            for (Food f : food) {
                f.getButton().setVisible(false);
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String choice = actionEvent.getActionCommand();
        if(choice.equals("Bar1")){
            seatMenu = false;
            foodMenu = true;
            drinkMenu = false;
        }
        displayButtens();
    }



//    boolean foodMenu = false;
//    boolean drinkMenu = false;
//    boolean seatMenu = true;
//    String choice;
//    JFrame frame;
//    Graphics g;
//
//    UserInterface(List<Seats> seats, List<Food> food, List<Booze> booze) {
//
//        setTitle("POS");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        setSize(1000, 750);
//        setLayout(null);
//
//        setVisible(true);
//
//
//
//
//    }
//
//
//
//
//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//        choice = actionEvent.getActionCommand();
//        Display menu = new Display(choice);
//        frame.update(g);
//    }
//
//    @Override
//    public void update(Graphics g){
//        if (seatMenu) {
//            for (int i = 0; i < seats.size(); i++) {
//                add(seats.get(i).getButton());
//                seats.get(i).getButton().addActionListener(this);
//            }
//        } else if (drinkMenu) {
//            for (int i = 0; i < booze.size(); i++) {
//                add(booze.get(i).getButton());
//                booze.get(i).getButton().addActionListener(this);
//            }
//        } else if (foodMenu) {
//            for (int i = 0; i < food.size(); i++) {
//                add(food.get(i).getButton());
//                food.get(i).getButton().addActionListener(this);
//            }
//        } else {
//            for (Seats s : seats) {
//                s.getButton().setVisible(false);
//            }
//            for (Booze b : booze) {
//                b.getButton().setVisible(false);
//            }
//            for (Food f : food) {
//                f.getButton().setVisible(false);
//            }
//        }
//    }
}