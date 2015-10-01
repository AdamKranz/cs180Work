/**
 * Created by akranz on 10/1/15.
 */
public class Matrix {
    boolean isReshapable(int length, int row, int col) {
        if (length < 0 || row < 0 || col < 0)
            return false;
        if (length == 0 && row == 0 && col == 0)
            return true;
        if (length == 0 && (row != 0 || col != 0))
            return false;
        if (length == row * col)
            return true;
        else
            return false;
    }
    int[][] reshape(int[] vector, int row, int col) {
        Matrix m = new Matrix();
        if (col == 0 || row == 0 || vector == null)
            return null;
        if (m.isReshapable(vector.length, row, col) == false)
            return null;
        int[][] output = new int[row][col];
        for (int i = 0; i < vector.length; i++)
        {
            int rowNum = i;
            int colNum = 0;
            if (i >= col && col != 0)
                colNum = i % (col);
            if (i > output[0].length - 1 && colNum != 0)
            {
                rowNum = i - ((col - 1) / colNum);
            }
            output[rowNum][colNum] = vector[i];
        }
        return output;
    }
}
