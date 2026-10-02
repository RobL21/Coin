import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // System.out.println(penny);
        // System.out.println(penny.getState());
        // penny.flip();
        // System.out.println(penny.getState());
        // System.out.println(penny.getHeads());
        // System.out.println(penny.getTails());
        // Coin nickel = new Coin(0.9);
        // nickel.flip(100);
        // System.out.println(nickel.getHeads());
        // System.out.println(nickel.getTails());
        // nickel.setPTails(0.5);
        // nickel.flip(100);
        // System.out.println(nickel.getHeads());
        // System.out.println(nickel.getTails());
        // Game g = new Game();
        // g.play();
        File file = new File("flips(1).txt");
        Scanner s = new Scanner(file);
        int heads = 0;
        int tails = 0;
        while (s.hasNext()) {
            if (s.next().equals("heads"))
                heads++;
            else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println(heads + tails);
        double se = standardError(0.5, 97);
        System.out.println(se);
        double pHat = (double) tails / (heads + tails);
        System.out.println(pHat);
        double z = (pHat - 0.5) / se;
        System.out.println(z);
    }

    public static double standardError(double p, int sample) {
        return Math.sqrt(p * (1 - p) / sample);

    }
}