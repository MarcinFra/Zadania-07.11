public class TicTacToe {

    public static void main(String[] args) {

        String board = showBoard();
        System.out.println(board);

    }

    static String showBoard(){
        String board = " ";
        for(int i = 0; i<=3; i++){
            if(i!=0) {
                board = board.concat("|");
            }
            for(int j = 0; j<=5; j++) {
                if((i==0)&&(j%2==0)){
                    board = board.concat("_ ");
                }else {
                    if (j % 2 == 0) {
                        board = board.concat("_");
                    } else if(i!=0){
                        board = board.concat("|");
                    }
                }
            }
            board = board.concat("\n");
        }
        return board;
    }

}
