class Main37 {
    
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board){
        for(int row = 0;row<9;row++){
            for(int col = 0;col<9;col++){
                if(board[row][col] ==  '.'){
                    for(char i = '1';i<='9';i++){
                        board[row][col] = i;
                        if(isValid(board,row,col) && solve(board))
                            return true;
                        board[row][col] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] board,int row,int col){
        for(int i = 0;i<9;i++){
            if(i!=col && board[row][i] == board[row][col])
                return false;
        }
        for(int i = 0;i<9;i++){
            if(i!=row && board[i][col] == board[row][col])
                return false;
        }
        int beginRow = 3*(row/3);
        int beginCol = 3*(col/3);
        for(int i = beginRow;i<beginRow+3;i++){
            for(int j = beginCol;j<beginCol+3;j++){
                if(i!=row && j!=col && board[i][j] == board[row][col])
                    return false;
            }
        }
        return true;
    }
}

