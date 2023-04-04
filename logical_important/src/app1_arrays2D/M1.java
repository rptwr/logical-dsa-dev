package app1_arrays2D;

public class M1 {
public static void main(String[] args) {
		
		int[][] elements = {
								{11,12,13,14,15,16,17,18,19},     
								{21,22,23,24,25,26,27,28,29},     
								{31,32,33,34,35,36,37,38,39},
								{41,42,43,44,45,46,47,48,49},
								{51,52,53,54,55,56,57,58,59},
								{61,62,63,64,65,66,67,68,69},
								{71,72,73,74,75,76,77,78,79},
								{81,82,83,84,85,86,87,88,89},
								{91,92,93,94,95,96,97,98,99}
							};
//		readRow(elements, 0);
//		readRow(elements, elements.length-1);
//		readColumn(elements , 0);
//		readColumn(elements , elements.length-1);
//		readGrid(elements,8,8);
//		readAllGrids(elements);
//		readDaigonal(elements);
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i==j)
				{
					readBox(elements, i , j) ;
				}
			}
		}
	}
	
	static void readRow(int[][] elements , int row)
	{	
		for (int j = 0; j < elements[row].length; j++) {
			System.out.print( elements[row][j] +" ");
		}
		System.out.println();
	}
	
	static void readColumn(int[][] elements , int column)
	{
		for (int j = 0; j < elements.length; j++) 
		{
			System.out.print( elements[j][column] +" ");
		}
		System.out.println();
	}
	
	static void readGrid(int[][] elements , int row , int column)
	{
		int fromRow = row - (row%3);
		int fromColumn = column - (column%3);
		
		for (int i = fromRow; i < fromRow + 3; i++) {
			for (int j = fromColumn; j < fromColumn + 3; j++) {
				System.out.print(elements[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	static void readAllGrids(int[][] elements)
	{
		for (int i = 0; i < elements.length; i++) 
		{
			if(i != 0 && i%3==0)
			{
				System.out.println("-----------------------------");
			}
			for (int j = 0; j < elements.length; j++) 
			{
				if(j!=0 && j%3 == 0)
				{
					System.out.print("|");
				}
				System.out.print(elements[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void readDaigonal(int[][] elements)
	{
		for (int i = 0; i < elements.length; i++) 
		{
			if(i != 0 && i%3 == 0)
			{
				System.out.println("-----------------------------");
			}
			for (int j = 0; j < elements.length; j++) 
			{
				if(j!=0 && j%3 == 0)
				{
					System.out.print("|");
				}
			
				if(i == j || (i+j) == 8)
				{
					System.out.print(elements[i][j]+" ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
	static void readBox(int[][] elements , int row, int column)
	{
		for (int i = 0; i < elements.length; i++) {
			if(i != 0 && i%3 == 0)
			{
				System.out.println("-----------------------------");
			}
			for (int j = 0; j < elements.length; j++) {
				if(j!=0 && j%3 == 0)
				{
					System.out.print("|");
				}
				if(((i == row || i == elements.length -1-row) && (j >= column && j <= elements.length-1-column))
						|| ((j == column|| j == elements.length-1-column) && (i >= row && i <= elements.length-1-row)))
				{
					System.out.print(elements[i][j] + " ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
}
