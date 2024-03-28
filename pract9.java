
import java.awt.*;
import java.awt.event.*;

class MouseAdapterExample1 extends MouseAdapter {

    Frame f;

    MouseAdapterExample1() {

        f = new Frame("Mouse Adapter");

        f.addMouseListener(this);

        f.setSize(300, 300);
       
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {

        Graphics g = f.getGraphics();

        g.setColor(Color.BLUE);

        g.fillOval(80, 50, 30, 30);
    }
}

public class pract9 {
    public static void main(String[] args) {
        new MouseAdapterExample1();
    }
}
