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
        point.setX(point.getX() + distance * Math.cos(course / 180 * Math.PI));
        point.setY(point.getY() + distance * Math.sin(course / 180 * Math.PI));
        return point; // обновили старые координаты
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
