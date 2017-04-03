import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 03/04/2017.
 */
public class Dominoes {
    public static void main(String[] args) {
      List<Domino> dominoes = initializeDominoes();
      List<Domino> sortedDominoes = new ArrayList<>();
      sortedDominoes.add(dominoes.get(0));
      int length = dominoes.size();
      for (int i = 0; i < length; i++) {
        for (int j = 1; j < length; j++) {
          int[] nextDomino = dominoes.get(j).getValues();
          int[] thisDomino = sortedDominoes.get(i).getValues();
          if (thisDomino[1] == nextDomino[0]) {
            sortedDominoes.add(dominoes.get(j));
          }
        }
      }
      System.out.println(sortedDominoes);
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

