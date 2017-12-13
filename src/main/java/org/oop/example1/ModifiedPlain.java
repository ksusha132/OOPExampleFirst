package org.oop.example1;


import java.util.HashMap;

public class ModifiedPlain extends Plain {
    private Integer smooth;

    ModifiedPlain(double x, double y) {
        super(x, y);
    }

    public Point moveBack(double distance) {
        moveForvard(-distance);
        return getPoint();
    }

    public HashMap<Integer, Point> roundPlain(Integer smooth, double round, double distance) {
        this.smooth = smooth;
        double deltaDist = distance / smooth; // количество кусков
        double course = 0;
        HashMap<Integer, Point> map = new HashMap<Integer, Point>();
        for (int i = 0; i < smooth; i++) {
            Point pointForCircle = new Point();
            course = 180 * deltaDist / (Math.PI * round) + course; // change course for every piese
            setCourse(course); // update course
            Point p = moveForvard(deltaDist);

            pointForCircle.setX(p.getX());
            pointForCircle.setY(p.getY());
            map.put(i, pointForCircle);
            printCoordinats(pointForCircle);

        }
        return map;
    }

}
