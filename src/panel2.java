import javax.swing.*;

public class panel2 extends JPanel {
    public panel2() {
        setPanel2();

    }
    public void setPanel2() {
        setLayout(null);
        Main.label = new JLabel("Number to dial");
        Main.label.setBounds(2,3,120,30);
        add(Main.label);
        Main.textField = new JTextField();
        Main.textField.setBounds(93,8,180,20);
        add(Main.textField);

    }
}
