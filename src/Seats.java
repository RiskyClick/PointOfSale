import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Seats {

    JButton button;
    String name;
    double amt;
    boolean vacant;
    List<String> products = new ArrayList<>();

    Seats(String name, double amt, boolean vacant, int x, int y, int w, int h){
        this.name = name;
        this.amt = amt;
        this.vacant = vacant;
        this.button = new JButton(name);
        button.setBounds(x, y, w, h);
    }

    public JButton getButton(){
        return this.button;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public void addToBill(String product, double amt){
        products.add(product);
        this.amt += amt;
    }

    public static void printSeats(List<Seats> seats) {
        for(Seats s: seats) System.out.println(s.getName());
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

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }
}
