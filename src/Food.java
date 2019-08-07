import javax.swing.*;
import java.util.List;

public class Food {
    JButton button;
    double amt;
    String name;

    Food(String name, double amt, int x, int y, int w, int h){
        this.name = name;
        this.amt = amt;
        this.button = new JButton(name);
        button.setBounds(x, y, w, h);
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printFood(List<Food> food) {
        for(Food f: food) System.out.println(f.getName());
    }

    public JButton getButton(){
        return this.button;
    }
}
