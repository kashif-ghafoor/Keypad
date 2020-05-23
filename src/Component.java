import javax.swing.*;
import java.awt.*;

public class Component extends JPanel {
    public Component() {
        setComponent();
    }
    public void setComponent() {
        GridLayout layout = new GridLayout(4,3);
        setLayout(layout);
        Main.buttons=new JButton[Main.names.length];
    for(int count = 0;count<12;count++) {
        Main.buttons[count]=new JButton(String.valueOf(Main.names[count]));
        add(Main.buttons[count]);
        Main.buttons[count].addActionListener(new Listener());
    }



    }

}
