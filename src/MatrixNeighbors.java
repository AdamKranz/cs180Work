public class MatrixNeighbors 
{
	private int rows;
	private int columns;
	private int[][] matrix;
	
	public MatrixNeighbors(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
		matrix = new int[rows][columns];
	}
	
	public String neighbors(int row, int column)
	{
		String output = "";
		boolean top = false;
		boolean right = false;
		boolean bottom = false;
		boolean left = false;
		if (row >= rows || column >= columns || (row < 0 || column < 0))
		{
			return "cell does not exist";
		}
		if (row > 0 && row < rows)
		{
			output += (row - 1) + "," + column + ";";
			top = true;
		}
		if (top == true && column < (columns - 1) && column >= 0)
		{
			output += (row - 1) + "," + (column + 1) + ";";
		}
		if (column < columns - 1 && column >= 0)
		{
			output += row + "," + (column + 1) + ";";
			right = true;
		}
		if (right == true && row < (rows - 1) && row >= 0)
		{
			output += (row + 1) + "," + (column + 1) + ";";
		}
		if (row < rows - 1 && row >= 0)
		{
			output += (row + 1) + "," + column + ";";
			bottom = true;
		}
		if (bottom == true && column > 0 && column < columns)
		{
			output += (row + 1) + "," + (column - 1) + ";";
		}
		if (column > 0 && column < columns)
		{
			output += row + "," + (column - 1) + ";";
			left = true;
		}
		if (left == true && top == true)
		{
			output += (row - 1) + "," + (column - 1) + ";";
		}
		
		return output;
		
		
	}
	
	public static void main(String[] args)
	{
		/*MatrixNeighbors mn = new MatrixNeighbors(3,3);
		System.out.println(mn.neighbors(0, 0));
		System.out.println(mn.neighbors(1, 0));
		System.out.println(mn.neighbors(2, 0));
		System.out.println(mn.neighbors(0, 1));
		System.out.println(mn.neighbors(0, 2));
		System.out.println(mn.neighbors(1, 1));
		System.out.println(mn.neighbors(1, 2));
		System.out.println(mn.neighbors(2, 1));
		System.out.println(mn.neighbors(2, 2));
		System.out.println(mn.neighbors(3, 0));
		/*MatrixNeighbors m = new MatrixNeighbors(3, 3);
		System.out.println(m.neighbors(0, 0)); //prints "0,1;1,1;1,0;"
		System.out.println(m.neighbors(2, 2)); //prints "1,2;2,1;1,1;"
		System.out.println(m.neighbors(1, 1)); //prints "0,1;0,2;1,2;2,2;2,1;2,0;1,0;0,0;"
		System.out.println(m.neighbors(3, 0)); //prints "cell does not exist"*/
		
	}

}
