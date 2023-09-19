import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private List<Toy> toys;

    public List<Toy> getToys() {
        return toys;
    }

    public Lottery() {
        toys = new ArrayList<>();
    }

    public void addToys(Toy toy) {
        toys.add(toy);
    }

    public Toy chooseGiftsToy() {
        List<Toy> toysInCar = new ArrayList<>();
        int allFreq = 0;
        for (Toy toy : toys) {
            if (toy.isOnTheList()) {
                toysInCar.add(toy);
                allFreq = allFreq + toy.getFreqToy();
            }

        }
        Random rmd = new Random();
        int rmdNumber = rmd.nextInt(allFreq) + 1;
        int freqForCompr = 0;
        for (Toy toy : toysInCar) {
            freqForCompr += toy.getFreqToy();
            if (rmdNumber <= freqForCompr) {
                return toy;
            }
            return null;
        }
        return null;
    }

    public void resultToy() throws IOException {
        Toy winnings = chooseGiftsToy();
        if (winnings != null) {
            winnings.ToyFallOut();
            winnings.saveToBase();
            System.out.println(winnings);
        }
    }

    public void deleteToy(int id) {
        toys.remove(id);
    }

}
