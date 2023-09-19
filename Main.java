import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Lottery lottery = new Lottery();
        Toy toy1 = new Toy(1, "doll", 0, 20);
        Toy toy2 = new Toy(2, "ball", 0, 10);
        Toy toy3 = new Toy(3, "constructor", 15, 20);
        Toy toy4 = new Toy(4, "lego", 20, 40);
        Toy toy5 = new Toy(3, "constructor2", 15, 40);
        lottery.addToys(toy1);
        lottery.addToys(toy2);
        lottery.addToys(toy3);
        lottery.addToys(toy4);
        lottery.addToys(toy5);

        lottery.resultToy();
        System.out.println();
        lottery.resultToy();
        
        

    }
}
