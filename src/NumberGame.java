import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
        int x = new Random().nextInt(11);
        int y;

        while (true) {
            System.out.println("Give me one number from 1 to 10");
            y = new Scanner(System.in).nextInt();

            if ( x == y) {
                System.out.println("Super!!!" + x);
                break;
            } else {
                System.out.println("Try Again!");
            }
        }


    }
}