package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
            // You have the list of Dominoes
            // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
            // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> snakeDominoes = new ArrayList<>();

        for (Domino domino1: dominoes){
            for (Domino domino2: dominoes){
                if (domino1.getRightSide() == domino2.getLeftSide()) {
                    if (!snakeDominoes.contains(domino1)
                            && !snakeDominoes.contains(domino2)) {
                        snakeDominoes.add(domino1);
                        snakeDominoes.add(domino2);
                    }
                }
            }
        }

        System.out.println(dominoes);
        System.out.println(snakeDominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}