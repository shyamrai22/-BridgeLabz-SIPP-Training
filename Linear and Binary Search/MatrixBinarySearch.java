import java.util.Scanner;

public class MatrixBinarySearch {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements in sorted 2D format : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value to search : ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + (found ? " found in matrix." : " not found in matrix."));
	}
}
