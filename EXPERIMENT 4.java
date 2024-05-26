//PROGRAM TO IMPLEMENT N-QUEENS PROBLEM  

public class NQueensProblem {
    private static int[] result;

    public static void main(String[] args) {
        int n = 8; 
    //  int n = 4;
        result = new int[n];
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        if (placeQueen(0, n)) {
            System.out.println("Solution exists. The queens are placed as follows:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (result[i] == j) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Solution does not exist for the given board size.");
        }
    }

    public static boolean placeQueen(int row, int n) {
        if (row == n) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(row, i)) {
                result[row] = i;
                if (placeQueen(row + 1, n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (result[i] == col || Math.abs(result[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}

// OUTPUT :
// Solution exists. The queens are placed as follows:
// _ Q _ _ _ _ _ _ 
// _ _ _ _ _ _ Q _ 
// Q _ _ _ _ _ _ _ 
// _ _ _ _ Q _ _ _ 
// _ _ _ _ _ _ _ Q 
// _ _ Q _ _ _ _ _ 
// _ _ _ _ _ Q _ _ 
// _ _ _ Q _ _ _ _
