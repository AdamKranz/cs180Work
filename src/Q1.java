/**
 * Question 1 -- Complete the method isSkewSymmetric
 */
public class Q1 {
    /**
     * Checks if the argument is a skew-symmetric matrix. A skew-symmetric
     * matrix is a square matrix with zeros along the main diagonal and
     * whose opposing entries sum to zero, i.e., (i,j)th element is -(j,i)th
     * element.
     *
     * @param mat is a 2-dimensional matrix (array) that is not ragged.
     * @return
     * 		"TRUE" if mat is skew-symmetric.
     * 		"FALSE" if mat is not skew-symmetric.
     * 		"NULL" if mat is null or empty.
     * 		"RECTANGULAR" if mat is not square.
     */
    public String isSkewSymmetric(int[][] mat) {
        if (mat == null)
            return "NULL";
        if (mat.length == 0 || mat[0].length == 0)
            return "NULL";
        if (mat.length != mat[0].length)
            return "RECTANGULAR";
        for (int i = 0; i<mat.length;i++)
        {
            for(int j = 0;j<mat[0].length;j++)
            {
                if (mat[i][j]+mat[j][i]!=0)
                    return "FALSE";
            }
        }
        return "TRUE";
    }

}
