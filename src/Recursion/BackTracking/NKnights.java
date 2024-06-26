package Recursion.BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n= 3;
        boolean[][] b = new boolean[n][n];
        NKnights(b,0,0,4);
    }
    static void NKnights(boolean[][] board, int row, int column, int target){
        if(target==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && column==board[0].length){
            return;
        }
        if(column==board[0].length){
            NKnights(board,row+1,0,target);
            return;
        }
        if(isSafe(board,row,column)){
            board[row][column] = true;
            NKnights(board,row,column+1,target-1);
            board[row][column] = false;
        }
        NKnights(board,row,column+1,target);
    }

    static boolean isSafe(boolean[][] board,int row, int column){
        if(isValid(board,row-2,column-1)){
            if(board[row-2][column-1]){
                return false;
            }
        }
        if(isValid(board,row-1,column-2)){
            if(board[row-1][column-2]){
                return false;
            }
        }
        if(isValid(board,row-1,column+2)){
            if(board[row-1][column+2]){
                return false;
            }
        }
        if(isValid(board,row-2,column+1)){
            if(board[row-2][column+1]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board,int row,int column){
        if(row>=0 && row<board.length && column>=0 && column<board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean elem:row){
                if(elem){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
