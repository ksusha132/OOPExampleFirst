package org.oop.example1;


public class Main {
    public static void main(String[] args) {

        ModifiedPlain modifiedPlain = new ModifiedPlain(0, 0); // задали откуда будем рисовать линию
        modifiedPlain.setCourse(30); // задали угол
//        modifiedPlain.printCoordinats(modifiedPlain.moveForvard(50)); // задали дистанцию и продвинулись
//        modifiedPlain.moveBack(50); // вернулись обратно на туже дистанцию при том же курсе

        modifiedPlain.moveForvard(100);
        modifiedPlain.printCoordinats(modifiedPlain.getPoint());
        Form form = new Form();
        form.setVisible(true);
        form.pack();
    }
}
