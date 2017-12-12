package org.oop.example1;


public class ModifiedPlain extends Plain {

  ModifiedPlain(double x, double y) {
    super(x, y);
  }

  public Point moveBack(double distance){
    moveForvard(-distance);
    return getPoint();
  }

}
