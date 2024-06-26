package Recursion.BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if(solve(sudoku)){
            display(sudoku);
        }
        else{
            System.out.println(false);
        }
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty==false){
                break;
            }
        }
        if(isEmpty==true){
            return true;
        }
        for(int i=1;i<=9;i++){
            if(isSafe(board,row,col,i)){
                board[row][col] = i;
                if(solve(board)){
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] puzzle,int row,int col,int num){
        for (int i = 0; i < puzzle.length; i++) {
            if(puzzle[i][col]==num){
                return false;
            }
        }

        for(int i=0;i<puzzle.length;i++){
            if(puzzle[row][i]==num){
                return false;
            }
        }
        int sqrt = (int)(Math.sqrt(puzzle.length));
        int rowStart = row - row% sqrt;
        int colStart = col - col%sqrt;
        for(int i=rowStart;i<rowStart+sqrt;i++){
            for (int j = colStart; j < colStart+sqrt; j++) {
                if(puzzle[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    static void display(int[][] board){
        for(int[] row: board){
            for(int i:row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
