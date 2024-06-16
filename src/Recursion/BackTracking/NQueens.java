package Recursion.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n= 4;
        boolean[][] b = new boolean[n][n];
        System.out.println(findNQueens(b,0));
    }
    static int findNQueens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col=0;col<board[row].length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+=findNQueens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] b,int row,int col) {
        for (int i = 0; i < row; i++) {
            if(b[i][col]){
                return false;
            }
        }
        int maxLeftDiag = Math.min(row,col);
        for (int i = 1; i <= maxLeftDiag; i++) {
            if(b[row-i][col-i]){
                return false;
            }
        }
        int maxRightDiag = Math.min(row,b[row].length-col-1);
        for (int i = 1; i <= maxRightDiag; i++) {
            if(b[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean elem:row){
                if(elem){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
