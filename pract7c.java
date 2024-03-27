import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


    class BoderLayoutDemo extends JFrame {
        BoderLayoutDemo()
        {
                
            JPanel pa = new JPanel();
            pa.setLayout(new BorderLayout());
            pa.add(new JButton("WelCome"), BorderLayout.NORTH);
            pa.add(new JButton("Geeks"), BorderLayout.SOUTH);
            
            pa.add(new JButton("Layout"), BorderLayout.EAST);
            pa.add(new JButton("Border"), BorderLayout.WEST);
            pa.add(new JButton("GeeksforGeeks"), BorderLayout.CENTER);
            add(pa);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 300);
            setVisible(true);
        }
    }

public class pract7c{
    public static void main(String[] args)
	{
			
		new BoderLayoutDemo();
	}

}
