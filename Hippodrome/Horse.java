package Hippodrome;

import java.util.Arrays;

    public class Horse {

        String name;
        double speed;
        double distance;

        public Horse(String name, double speed, double distance){
            this.name = name;
            this.speed = speed;
            this.distance = distance;
        }

        public void move(){
            distance+=speed * (Math.random());

        }

        public void print(){
            char[] chars = new char[(int) distance];
            Arrays.fill(chars, '.');
            System.out.println(new String(chars) + getName());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }
    }

