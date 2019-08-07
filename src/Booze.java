import javax.swing.*;
import java.util.List;

public class Booze {
    JButton button;
    String name;
    double amt;

    Booze(String name, double amt, int x, int y, int w, int h){
        this.name = name;
        this.amt = amt;
        this.button = new JButton(name);
        button.setBounds(x, y, w, h);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public static void printBooze(List<Booze> booze) {
        for(Booze d: booze) System.out.println(d.getName());
    }

    public JButton getButton(){
        return this.button;
    }
}
