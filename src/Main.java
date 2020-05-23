import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Main {
    static JButton[] buttons;
    static Character[] names={'1','2','3','4','5','6','7','8','9','*','0','#'};
    static JTextField textField;
    static JLabel label;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelePhone");
        JSplitPane splitPane = new JSplitPane();

        Component cmp = new Component();
        panel2 panel = new panel2();
        frame.setSize(300,290);
        frame.getContentPane().setLayout(new GridLayout());
        frame.getContentPane().add(splitPane);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(215);
        splitPane.setDividerSize(0);
        splitPane.setTopComponent(cmp);
        splitPane.setBottomComponent(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}