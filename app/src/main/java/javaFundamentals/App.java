/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaFundamentals;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class App {
    public static String pluralize(String word, int number) {
        if (number > 1) {
            return "I own" + " " + number + " " + word + "s";
        } else {
            return "I own" + " " + number + " " + word;
        }
    }

    public static String flipNHeads(int n) {
        int consecutiveHeadFlips = 0;
        int flips = 0;
        while(consecutiveHeadFlips !=n) {
            double random = Math.random();
            if (random < .5) {
                System.out.println("TAILS");
                consecutiveHeadFlips = 0;
                flips++;
            }
            if (random >=.5) {
                System.out.println("HEADS");
                consecutiveHeadFlips++;
                flips++;
            }
        }
        return "It took " + flips + " flips to get " + n + " heads in a row.";
    }

    public static void clock(){
        String time = "";
        int cycles = 0;
        while(true){
            LocalDateTime atThisMoment = LocalDateTime.now();
            String currentTime = atThisMoment.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(!time.equals(currentTime)){
                time = currentTime;
                System.out.println(time + " " + (cycles/1_000_000) + " " + "MHz");
                cycles = 0;
            } else {
                cycles++;
            }
        }
    };

    public static void main(String[] args) {
        System.out.println(pluralize("cat", 4));
        System.out.println(flipNHeads(4));
        clock();
    }
}
