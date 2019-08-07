import java.util.List;

public class Food {
    double amt;
    String name;

    Food(String name, double amt){
        this.name = name;
        this.amt = amt;
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
}
