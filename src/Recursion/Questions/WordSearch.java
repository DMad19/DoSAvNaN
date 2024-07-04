package Recursion.Questions;


public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String target = "SEE";
        for(int i=0;i<board.length;i++){
            for (int j = 0; j < board[i].length; j++) {
                if(searchWord("",board,i,j,target)){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
    static boolean searchWord(String p, char[][] board,int r,int c,String target){
        if(p.equals(target)){
            return true;
        }
        if(r> board.length-1 || c>board[r].length-1){
            return false;
        }
        p+=board[r][c];
        if(!p.equals(target.substring(0,p.length()))){
            return false;
        }
        board[r][c] = '*';
        if(r>0){
            if(searchWord(p,board,r-1,c,target)){
                return true;
            }
        }
        if(c>0){
            if(searchWord(p,board,r,c-1,target)){
                return true;
            }
        }
        if(r<board.length-1){
            if(searchWord(p,board,r+1,c,target)){
                return true;
            }
        }
        if(c<board[r].length-1){
            if(searchWord(p,board,r,c+1,target)){
                return true;
            }
        }
        board[r][c] = p.charAt(p.length()-1);
        p=p.substring(0,p.length()-1);
        return false;
    }
}
