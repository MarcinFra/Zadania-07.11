package ObjTicTacToe;

public class Board {

    private Mark[][] board;
    private Field field;
    private Mark mark;

    public Board(int width, int height){

        board = new Mark[width][height];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Mark.EMPTY;
            }
        }
    }

    public Field setMark(int x,int y,Mark mark){

        field = new Field(x, y, mark);

        return field;
    }

    public boolean isEmpty(int x,int y){


        return true;
    }

    public GameState getGameState(){


        return GameState.IN_PROGRESS;
    }

    public boolean isWin(){
        int row = 0;
        int x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(field.mark==board[x][j]){
                    row++;
                }
            }
        }
        return true;
    }

}
