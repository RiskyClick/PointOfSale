import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class UserInterface extends JFrame implements ActionListener {

    boolean foodMenu = false;
    boolean drinkMenu = false;
    boolean seatMenu = true;

    UserInterface(List<Seats> seats, List<Food> food, List<Booze> booze) {

        setTitle("POS");

        displayMenu();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 750);
        setLayout(null);
        setVisible(true);
    }

    private void displayMenu() {
        if(seatMenu){
            for(int i = 0; i < seats.size(); i++){
                add(seats.get(i).getButton());
                seats.get(i).getButton().addActionListener(this);
            }
        }

        else if(drinkMenu) {
            for(int i = 0; i < booze.size(); i++){
                add(booze.get(i).getButton());
                booze.get(i).getButton().addActionListener(this);
            }
        }

        else if(foodMenu) {
            for(int i = 0; i < food.size(); i++){
                add(food.get(i).getButton());
                food.get(i).getButton().addActionListener(this);
            }
        }
        else {
            for(Seats s: seats){
                s.getButton().setVisible(false);
            }for(Booze b: booze){
                b.getButton().setVisible(false);
            }for(Food f: food){
                f.getButton().setVisible(false);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String clicked = actionEvent.getActionCommand();
        if(clicked.equals("Bar1")){
            seatMenu = false;
            drinkMenu = true;
            displayMenu();
        }
    }
}