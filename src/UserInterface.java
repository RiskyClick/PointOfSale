import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UserInterface extends JFrame implements ActionListener {

    List<Seats> seats;
    List<Food> food;
    List<Booze> booze;
    List<Others> otherButtons;

    boolean showSeats = true;
    JFrame frame= new JFrame("POS");



    public UserInterface(List<Seats> seats, List<Food> food, List<Booze> booze, List<Others> otherButtons) {
        this.seats = seats;
        this.booze = booze;
        this.food = food;
        this.otherButtons = otherButtons;
        frame.setTitle("POS");
        frame.setSize(1000, 750);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inService();
    }

    private void inService() {
        for(Others o: otherButtons){
            frame.add(o.getButton());
            o.getButton().addActionListener(this);
            o.getButton().setVisible(true);
        }
        if(showSeats == true){
            for(Seats s: seats){
                frame.add(s.getButton());
                s.getButton().addActionListener(this);
                s.getButton().setVisible(true);
            }
            for(Booze b: booze) {
                b.getButton().setVisible(false);
            }
            for(Food f: food) {
                f.getButton().setVisible(false);
            }

            }else{
            for(Seats s: seats){
                s.getButton().setVisible(false);
            }
            for(Booze b: booze){
                frame.add(b.getButton());
                b.getButton().addActionListener(this);
                b.getButton().setVisible(true);

            }
            for(Food f: food){
                frame.add(f.getButton());
                f.getButton().addActionListener(this);
                f.getButton().setVisible(true);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String clicked = actionEvent.getActionCommand();
        Seats buffer = null;

        for(Seats s: seats){
            if(clicked.equals(s.getName())){
                buffer = s;
                showSeats = false;
                inService();
            }
        }
        for(Food f: food){
            if(clicked.equals((f.getName()))){
                buffer.addToBill(f.getName(), f.getAmt());
                inService();
            }
        }
        for(Booze b: booze){
            if(clicked.equals(b.getName())){
                buffer.addToBill(b.getName(), b.getAmt());
                inService();
            }
        }
        if (clicked.equals("Back")){
            showSeats = true;
            inService();
        }
        else if(clicked.equals("Close")){
            System.out.println("Need to work on payment");
            inService();
        }
        else if(clicked.equals("Print")){
            System.out.println(buffer.getProducts());
            System.out.println(buffer.getAmt());
            inService();
        }

    }
}