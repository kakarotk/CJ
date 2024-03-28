import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class pract7{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame. setSize(300,400);

        GridLayout gl = new GridLayout(3,2);

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 1");
        JButton btn3 = new JButton("Button 1");
        JButton btn4 = new JButton("Button 1");
        JButton btn5 = new JButton("Button 1");
        JButton btn6 = new JButton("Button 1");

        frame.setLayout(gl);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);

        frame.setVisible(true);
    }

}