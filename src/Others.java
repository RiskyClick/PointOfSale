import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Others {

    JButton button;
    String name;

    Others(String name, int x, int y, int w, int h){
        this.name = name;
        this.button = new JButton(name);
        button.setBounds(x, y, w, h);
    }

    public JButton getButton(){
        return this.button;
    }


}
