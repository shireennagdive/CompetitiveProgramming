public class BattleShipsInBoard {
        public int countBattleships(char[][] board) {
            int count=0;
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]=='X') {
                        dfs(board,i,j);
                        count++;
                    }

                }
            }
            return count;
        }
        public void dfs(char[][] board,int row,int col){
            if(row<0 || row>board.length-1 ||
                    col<0 || col>board[0].length-1 || board[row][col]=='.' || board[row][col]=='0') return;
            board[row][col]='0';
            dfs(board,row-1,col);
            dfs(board,row+1,col);
            dfs(board,row,col-1);
            dfs(board,row,col+1);
    }
}
