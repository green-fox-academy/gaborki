/**
 * Created by Gabor on 22/03/2017.
 */
public class Matrix {

    public static void main(String[] argc) {

        String[][] matrix = new String[4][4];

        for ( int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                if (j == i) {
                    matrix[i][j] = "1 ";
                    System.out.print(matrix[i][j]);

                } else {
                    matrix[i][j] = "0 ";
                    System.out.print(matrix[i][j]);
                }

            }

            System.out.println();
        }




    }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output