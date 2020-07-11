package Hippodrome;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }


    public Horse getWinner(){
        return horses.stream()
                .max(Comparator.comparingDouble(Horse::getDistance))
                .get();
    }

    public void printWinner(){
        System.out.printf("Winner is %s!%n",getWinner().getName());
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for(int i = 0; i<100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print(){
        for(Horse horse:horses){
            horse.print();

        }
        for(int i =0; i < 10; i++){
            System.out.println();
        }
    }

    public void move(){
        for (Horse horse: horses) { horse.move(); }
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("horse1", 3,0);
        Horse horse2 = new Horse("horse2", 3,0);
        Horse horse3 = new Horse("horse3", 3,0);
        horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);

        game.run();
        game.printWinner();
    }
}
