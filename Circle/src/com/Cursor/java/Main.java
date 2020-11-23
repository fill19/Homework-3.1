package com.Cursor.java;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("The square of circle = " + circle.squareOfCircle()  );

    }


     static class Circle {
        private double radius;

         Circle(double radius) {
            this.radius = radius;
        }

        public double squareOfCircle() {

            return (Math.PI * radius * radius);

        }


    }
}