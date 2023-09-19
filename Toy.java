import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Toy {
    private int id;
    private String nameToy;
    private int countToy;
    private int freqToy;

    public Toy() {

    }

    public Toy(int id, String nameToy, int countToy, int freqToy) {
        this.id = id;
        this.nameToy = nameToy;
        this.countToy = countToy;
        this.freqToy = freqToy;
    }

    public int getId() {
        return id;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public int getCountToy() {
        return countToy;
    }

    public int getFreqToy() {
        return freqToy;
    }

    public void setFreqToy(int freqToy) {
        this.freqToy = freqToy;
    }
    public void saveToBase() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("toys.txt"))) {
            bw.write("ID: " + id + "; name: " + nameToy + ", Count: " + countToy + ", Frequency: " + freqToy);
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean isOnTheList() {
        return countToy > 0;
    }
    public void ToyFallOut() {
        this.countToy--;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", nameToy=" + nameToy + ", countToy=" + countToy + ", freqToy=" + freqToy + "]";
    }


}