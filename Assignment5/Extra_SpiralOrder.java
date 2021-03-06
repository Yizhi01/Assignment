package assignment5;
import java.util.*;

public class Extra_SpiralOrder {
	public static void main(String[] args) {
		int [][] matrix = {
			{1, 2, 3},{4, 5, 6},{7, 8, 9}
		};
		Extra_SpiralOrder s = new Extra_SpiralOrder();
		List<Integer> arr = s.spiralOrder(matrix);
		for(Integer i:arr)
			System.out.print(i + " ");
	}
	
	public List<Integer> spiralOrder(int[][] matrix){
		List<Integer>result = new ArrayList<Integer>();
		if(matrix == null)
			return result;
		
		int j=0;
		int x = 0; //starting row index
		int y = 0; //starting column index
		int m = matrix.length;
		int n =matrix[0].length;
		while (x<m && y<n) {
			//add the first row from the remaining rows
			for(j = y;j<n;++j)
				result.add(matrix[x][j]);
			x++;
			
			//add the last column from the remaining columns
			for(j = x;j<m;++j)
				result.add(matrix[j][n-1]);
			n--;
			
			//add the last row from the remaining rows
			if(x<m) {
				for(j = n-1;j>=y;--j)
					result.add(matrix[m-1][j]);
				m--;
			}
			
			//add the first column from the remaining columns
			if(y<n) {
				for(j = m-1;j>=x;--j)
					result.add(matrix[j][y]);
				y++;
			}
		}
		return result;
	}
}
