package edu.wofford;


public class TicTacToeModel {

    /* I have not done anything with tie*/

    public enum Mark { EMPTY, XMARK, OMARK };
    public enum Result { XWIN, OWIN, TIE, NONE };
    private char[][] board;
    private char currentPlayerMark;
    private boolean gameover = false;


    public TicTacToeModel() {
        board = new char[3][3];
        currentPlayerMark = 'X';

        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    
    public boolean setMarkAt(int row, int col) {
        if (!gameover) {
            if (currentPlayerMark == 'X') {
                if (getMarkAt(row, col) == Mark.EMPTY) {
                    board[row][col] = currentPlayerMark;
                    currentPlayerMark = 'O';
                    return true;
                }
                return false;
            } else {
                if (getMarkAt(row, col) == Mark.EMPTY) {
                    board[row][col] = currentPlayerMark;
                    currentPlayerMark = 'X';
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    
    public Mark getMarkAt(int row, int col) {
        if (board[row][col] == 'X') {
            return Mark.XMARK;
        } else if (board[row][col] == 'O') {
            return Mark.OMARK;
        }
        return Mark.EMPTY;
    }

    public Result getResult() {
        String Vertical0 = "" + board[0][0] + board[1][0] + board[2][0];
        String Vertical1 = "" + board[0][1] + board[1][1] + board[2][1];
        String Vertical2 = "" + board[0][2] + board[1][2] + board[2][2];
        String horizontal0 = "" + board[0][0] + board[0][1] + board[0][2];
        String horizontal1 = "" + board[1][0] + board[1][1] + board[1][2];
        String horizontal2 = "" + board[2][0] + board[2][1] + board[2][2];
        String Diagonal0 = "" + board[0][0] + board[1][1] + board[2][2];
        String Diagonal1 = "" + board[0][2] + board[1][1] + board[2][0];
        if (!full_board()) {
            if (Vertical0.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (Vertical0.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            } else if (Vertical1.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (Vertical1.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            }else if (Vertical2.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (Vertical2.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            }else if (horizontal0.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (horizontal0.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            }else if (horizontal1.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (horizontal1.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            } else if (horizontal2.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (horizontal2.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            }else if (Diagonal0.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (Diagonal0.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            }else if (Diagonal1.equals("XXX")) {
                gameover = true;
                return Result.XWIN;
            } else if (Diagonal1.equals("OOO")) {
                gameover = true;
                return Result.OWIN;
            }
            return Result.NONE;
        } else {
            return Result.TIE;
        }


    }

    public boolean full_board() {
        int counter = 0;
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3;j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        String row1 = "" + board[0][0] + '|' + board[0][1] + '|' + board[0][2] + "\n";
        String row2 = "" + board[1][0] + '|' + board[1][1] + '|' + board[1][2] + "\n";
        String row3 = "" + board[2][0] + '|' + board[2][1] + '|' + board[2][2];
        String Line = "-----" + "\n";
        String Result = "" + row1 + Line + row2 + Line + row3;
        //System.out.print("Result = \n" + Result);
        return Result;
    }    

}