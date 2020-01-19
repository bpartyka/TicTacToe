import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wymiar");
        Integer dimension = scan.nextInt();

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        Game game = new Game();
        Board board = new Board(dimension);


        game.game(board, game, map);

    }
}
