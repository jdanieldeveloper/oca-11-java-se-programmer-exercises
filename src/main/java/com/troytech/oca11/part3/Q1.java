package com.troytech.oca11.part3;

public class Q1 {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);

        Point p2 = new Point();
        p1.setX(2);
        p1.setY(2);

        Point p3 = new Point();
        p1.setX(3);
        p1.setY(3);

        Plane plane = new Plane();
        plane.setPoint(p1, p2, p3);

        System.out.print("The prom of the points is : " + plane.calculateProm());

    }
}// end class


class Plane {
    private Point[] points;

    private double calculateDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }

    public double calculateProm(){
        int sumPoints = 0;
        //TODO iterate and calculate

        return  sumPoints / points.length;
    }

    public Point[] getPoint() {
        return points;
    }

    public void setPoint(Point... point) {
        this.points = point;
    }
}

class Point {
    private double x;
    private double y;
    private double distance;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
