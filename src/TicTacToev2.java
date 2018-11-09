public class TicTacToev2 {

    public static void main(String[] args) {

        int x = 7;
        int y = 12;

        char [][] board = createBoard(x, y);
        showBoard(x, y, board);

    }

    static char[][] createBoard(int x, int y) {
        char [][] board = new char[x][y];
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                //top empty's
                if((i==0)&&(j!=4)||(j!=7)){
                    board[i][j] = ' ';
                }

                //bottom empty's
                if((i>=5)&&(j<=2||j>=8)){
                    board[i][j] = ' ';
                }


                //bottom |
                if ((i >= 6) && (j == 3 || j == 7)) {
                    board[i][j] = '|';
                }
                //top, bottom _
                if ((i == 1 || i == 4)&&(j!=4||j!=6)) {
                    board[i][j] = '_';
                }

                //middle |
                if ((i >= 2 && i <= 5)&&(j==3||j==7)) {

                    board[i][j] = '|';
                }

                //top |
                if ((i <= 1) && (j == 3 || j == 7)) {
                    board[i][j] = '|';
                }

            }

        }

    return board;
    }

    static void showBoard(int x, int y, char[][] board){

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }


}
