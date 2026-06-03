class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0;i<9;i++){
            Set<Character> rows = new HashSet<>();
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(rows.contains(board[i][j])) return false;
                rows.add(board[i][j]);
            }
        }
        for(int i = 0;i<9;i++){
            Set<Character> cols = new HashSet<>();
            for(int j = 0;j<9;j++){
                if(board[j][i] == '.') continue;
                if(cols.contains(board[j][i])) return false;
                cols.add(board[j][i]);
            }
        }

        for(int i = 0;i<9;i++){
            Set<Character> col = new HashSet<>();
            for(int j = 0;j<3;j++){
                for(int k = 0;k<3;k++){
                    int row = (i / 3) * 3 + j;
                    int cols = (i % 3) * 3 + k;
                    if(board[row][cols] == '.') continue;
                    if(col.contains(board[row][cols])) return false;
                    col.add(board[row][cols]);           
                }
            }
        }
        return true;
    }
}
