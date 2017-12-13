package org.oop.example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;


public class Form2 extends JFrame {
    JButton press = new JButton("Draw circle");
    Map<Integer, Point> coordinats;

    private double x1 = 100;
    private double y1 = 100;

    Form2() {
        super("circle"); // title
        this.setBounds(500, 500, 500, 500); // bounds of frame
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6, 2, 0, 0));
        press.addActionListener(new Form2.ButtonEventListener());
        container.add(press);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);

        if (coordinats != null) {
            for (Map.Entry<Integer, Point> elem : coordinats.entrySet()) {
                int x2 = (int) elem.getValue().getX();
                int y2 = (int) elem.getValue().getY();
                graphics.drawLine((int) x1, (int) y1, x2, y2);
                x1 = x2;
                y1 = y2;
            }
            x1 = 100;
            y1 = 100;
        }
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            ModifiedPlain modifiedPlain = new ModifiedPlain(x1,y1);
            coordinats = modifiedPlain.roundPlain(200,100,200);
            repaint();
        }
    }
}
