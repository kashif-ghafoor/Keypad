import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class Listener implements ActionListener {
    static ArrayList <Character> array = new ArrayList<Character>();//list 
    @Override
    public void actionPerformed(ActionEvent e) {

        for(int count = 0;count<12;count++) {
            if(Main.buttons[count]==e.getSource()) {
                array.add(Main.names[count]);
                char[] arr = new char[array.size()];
                for (int i =0;i<array.size();i++) {
                    arr[i]=array.get(i);
                }
                Main.textField.setText(String.valueOf(arr));
            }
        }
    }
}