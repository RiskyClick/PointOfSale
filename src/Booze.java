import java.util.List;

public class Booze {
    String name;
    double amt;

    Booze(String name, double amt){
        this.name = name;
        this.amt = amt;
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
}
