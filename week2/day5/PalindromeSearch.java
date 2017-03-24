import java.util.ArrayList;

/**
 * Created by Gabor on 23/03/2017.
 */
public class PalindromeSearch {
    public static void main(String[] argc) {

        System.out.println(SearchPali("dog goat dad duck doodle"));
    }

    private static ArrayList<String> SearchPali(String sample) {

        ArrayList<String> filteredSample = new ArrayList<>();
        int left = 0;
        int right = 0;
        int placeOfFirstLetter = 0;
        int placeOfLastLetter = 0;

        for (int i = 0; i < sample.length() - 1; i++) {
            for (int j = i + 2; j < sample.length(); j++) {
                if (sample.charAt(i) == sample.charAt(j)) {
                    left = i;
                    right = j;
                    placeOfFirstLetter = i;
                    placeOfLastLetter = j;
                    while (sample.charAt(left) == sample.charAt(right) && right - left >= 1) {
                        left++;
                        right--;
                        }
                    if ((left - right) == -1 || (left - right) == 0 ) {
                        String pali = sample.substring(placeOfFirstLetter, placeOfLastLetter + 1);
                        filteredSample.add(pali);
                    }

                }
            }
        }

        return filteredSample;
    }
}



/*if (sample.charAt(i - 1) == sample.charAt(i) && i > 1) {
                int first = i - 2;
                int second = i + 1;
                while (sample.charAt(first) == sample.charAt(second)) {
                    first--;
                    second++;
                }

            }
        }
        for (int i = 2; i < sample.length(); i++) {
            if (sample.charAt(i - 2) == sample.charAt(i)){
                int first2 = i - 3;
                int second2 = i + 1;
                while (sample.charAt(first2) == sample.charAt(second2)) {
                    first2--;
                    second2++;
                }

                String paliOddLength = sample.substring(first2 + 1, second2);
                if (paliOddLength.length() >= 3)
                filteredSample.add(paliOddLength);
            }
        }
        return filteredSample;
    }
}








*/