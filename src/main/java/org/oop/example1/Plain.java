package org.oop.example1;


public class Plain {
    private double course = 0;
    private Point point;
    private double distance = 0;

    Plain(double x ,double y){
        point = new Point();
        point.setX(x);
        point.setY(y);
    }

    public Point moveForvard(double distance) {
        this.distance = distance;
        Point modifiedPoint = new Point();
        modifiedPoint.setX(getPoint().getX() + distance * Math.cos(getCourse() / 180 * Math.PI));
        modifiedPoint.setY(getPoint().getY() + distance * Math.sin(getCourse() / 180 * Math.PI));
        return modifiedPoint;
    }

    public void printCoordinats(Point modifiedPoint) {
        System.out.println("Chanded coordinates:");
        System.out.print(" X = " + modifiedPoint.getX() + "||");
        System.out.print(" Y = " + modifiedPoint.getY() + "||");
        System.out.print(" Course = " + course + "||");
        System.out.println(" Distance = " + distance );
    }


    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
