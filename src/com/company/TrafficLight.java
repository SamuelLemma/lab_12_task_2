package com.company;

public class TrafficLight {
    public static void Traffics(Lights ls) {
        switch (ls) {
            case RED:
            case GREEN:
            case YELLOW:
                System.out.println(String.format("%s! It's %s light",
                        ls.colour, ls.name()));
                break;
            default:
                System.out.println("Traffic lights are out of order,"
                        + "please try again later.");
        }
    }

    enum Lights {
        RED("Stop"), YELLOW("Ready"), GREEN("Go");

        String colour;

        Lights(String colour) {
            this.colour = colour;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Lights ls = Lights.RED;
            TrafficLight.Traffics(ls);
        }
    }
}

