/**
 * Created by adam on 11/6/15.
 */
public class OutputTest {
    public static void main(String[] args) {
        int[][] test = new int[8][9];
        System.out.println(test.length);

        Matrix m = new Matrix();
        m.writeMatrix("test", new int[][]{{1, 2, 3}, {4, 5, 6}});
    }
}
