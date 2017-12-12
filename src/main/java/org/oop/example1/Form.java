package org.oop.example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class Form extends JFrame {
    JButton press = new JButton("Draw");

    private Point modifiedPoint;
    private double x1 = 100;
    private double y1 = 100;

    Form() {
        super("line"); // title
        this.setBounds(500, 500, 500, 500); // bounds of frame
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6, 2, 0, 0));
        press.addActionListener(new ButtonEventListener());
        container.add(press);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
                int x2 = (int) modifiedPoint.getX();
                int y2 = (int) modifiedPoint.getY();
                graphics.drawLine((int) x1, (int) y1, x2, y2);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            ModifiedPlain modifiedPlain = new ModifiedPlain(x1,y1);
            modifiedPoint = modifiedPlain.moveForvard(50);
            repaint();
        }
    }
}
