package PlayToys;

import java.util.ArrayList;
import java.util.Random;

public class ToyStore {
    private ArrayList<Toy> toys;
    private int totalProbability;

    public ToyStore() {
        toys = new ArrayList<>();
        totalProbability = 0;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
        totalProbability += toy.getProbability();
    }

    public void updateToyProbability(int id, int probability) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                totalProbability -= toy.getProbability();
                toy.setProbability(probability);
                totalProbability += probability;
                break;
            }
        }
    }

    public void showToys() {
        System.out.println("Список игрушек:");
        for (Toy toy : toys) {
            System.out.println(toy.getName() + " (id: " + toy.getId() + ", количество: " + toy.getQuantity() + ", вес: " + toy.getProbability() + ")");
        }
    }

    public void play() {
        Random random = new Random();
        int randomNumber = random.nextInt(totalProbability);
        int sum = 0;
        for (Toy toy : toys) {
            sum += toy.getProbability();
            if (sum > randomNumber) {
                System.out.println("Победила игрушка " + "\"" + toy.getName() + "\""+ "!");
                break;
            }
        }
    }
}
