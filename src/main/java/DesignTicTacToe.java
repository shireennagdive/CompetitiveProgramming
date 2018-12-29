//Complexity - O(1)
public class DesignTicTacToe {
        int rows[],cols[];
        int diag,antiDia;
        int size;
        /** Initialize your data structure here. */
        public DesignTicTacToe(int n) {
            rows= new int[n];
            cols= new int[n];
            diag=0;
            antiDia=0;
            size=n;
        }

        /** Player {player} makes a move at ({row}, {col}).
         @param row The row of the board.
         @param col The column of the board.
         @param player The player, can be either 1 or 2.
         @return The current winning condition, can be either:
         0: No one wins.
         1: Player 1 wins.
         2: Player 2 wins. */
        public int move(int row, int col, int player) {
            int p =  (player==1) ? 1:-1;
            rows[row] += p;
            cols[col] += p;
            if(row==col){
                diag+= p;
            }
            if(col==(size-(row+1))){
                antiDia+= p;
            }
            if(Math.abs(rows[row])==size ||
                    Math.abs(cols[col])==size || Math.abs(diag)==size || Math.abs(antiDia)==size){
                return player;
            }
            return 0;
        }
    }

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */

