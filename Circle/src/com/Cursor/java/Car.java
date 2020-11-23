package com.Cursor.java;

public class Car {

    public static void main(String[] args) {
        Machine car = new Machine();
        car.setName();
        car.startUp();
        car.setGear(5);
        car.setSpeed(90);
        car.setSpeed(-42);
        car.stopped();
    }
}


class Machine {
    private String name;
    private boolean startUp;
    private int gear;
    private int speed;


    public Machine() {

        this.name = "Porsche";

    }


    public void setName() {
        System.out.println("Trademark of car is - " + getName());
    }

    public String getName() {
        return name;
    }


    public void startUp() {
        startUp = true;
        System.out.println("The car is started");
    }

    public void stopped() {
        startUp = false;
        System.out.println("The car is stopped, because engine is off.");
    }


    public void setGear(int gear) {
        if (gear == 0 || gear > 6) {
            System.out.println(" Car cannot has this gear -  " + gear );
            return;
        }
        this.gear = gear;
        System.out.println("Car rides on gear " + gear);
    }

    public int getGear() {
        return gear;
    }

    public void setSpeed(int speed) {
        if (speed == 0) {
            this.speed = speed;
            System.out.println("The car is staying, because speed is " + speed + " km per hour");

        } else if (speed > 0) {
            this.speed = speed;
            System.out.println("The car is riding, because it has speed  " + speed + " km per hour");

        } else {
            System.out.println("Car cannot has the speed low than 0 ;)");
        }
    }

    public int getSpeed() {
        return speed;
    }


}



