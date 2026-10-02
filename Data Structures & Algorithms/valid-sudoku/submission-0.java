class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            int[] freq = new int[10];
            for(int j = 0; j<9; j++){
                if(board[i][j]!='.') freq[(board[i][j])-'0']++;
            }
            for(int j = 0; j<9; j++){
                if(freq[j]>1) return false; 
            }
        }
        for(int i = 0; i<9; i++){
            int[] freq = new int[10];
            for(int j = 0; j<9; j++){
                if(board[j][i]!='.') freq[(board[j][i])-'0']++;
            }
            for(int j = 0; j<9; j++){
                if(freq[j]>1) return false; 
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                int[] freq = new int[10];

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {

                        if (board[x][y] != '.') {
                            freq[board[x][y] - '0']++;

                            if (freq[board[x][y] - '0'] > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
