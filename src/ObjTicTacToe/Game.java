package ObjTicTacToe;

public class Game {

    private Board board;
    private Player playerX;
    private Player playerO;
    private Player activePlayer;
    private ConsoleReader reader;
    private GameState gameState;
    private Field field;

    public Game(){
        gameState = GameState.IN_PROGRESS;
        board = new Board(3,3);
        reader = new ConsoleReader();
    }


    public void start(){

        initPlayers();
        gameState = GameState.IN_PROGRESS;
        activePlayer = playerX;

        while(gameState == GameState.IN_PROGRESS){

            System.out.println("Input coordinates of: " + activePlayer.getName());
            int coordinateX = reader.readCoordinate();
            int coordinateY = reader.readCoordinate();

            field = board.setMark(coordinateX, coordinateY, activePlayer.getMark());

            System.out.println(board.toString());

            gameState = board.getGameState();

        }




    }

    public void initPlayers(){

        System.out.println("Podaj imie gracza X: ");
        String playerXName = reader.readPlayerName();
        this.playerX = new Player(playerXName, Mark.X);

        System.out.println("Podaj imie gracza Y: ");
        String playerOName = reader.readPlayerName();
        this.playerO = new Player(playerOName, Mark.O);
    }

}
