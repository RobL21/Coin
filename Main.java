public class Main {
    public static void main(String[] args){
        Coin penny = new Coin();
        //System.out.println(penny);
        //System.out.println(penny.getState());
        //penny.flip();
        //System.out.println(penny.getState());
        //System.out.println(penny.getHeads());
        //System.out.println(penny.getTails());
        //Coin nickel = new Coin(0.9);
        //nickel.flip(100);
        //System.out.println(nickel.getHeads());
        //System.out.println(nickel.getTails());
        //nickel.setPTails(0.5);
        //nickel.flip(100);
        //System.out.println(nickel.getHeads());
        //System.out.println(nickel.getTails());
        Player rob = new Player(100);
        rob.flip(penny, "tails", 50);
        System.out.println(rob.getBalance());
    }
}