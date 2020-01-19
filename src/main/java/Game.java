import java.util.Map;
import java.util.Scanner;

public class Game {

    public int getMove() {
        System.out.println("Podaj ruch");
        Scanner scanner = new Scanner(System.in);
        int move = scanner.nextInt();
        System.out.println("Ruch: " + move);

        return move;
    }

    public void game(Board board, Game game, Map<Integer, Boolean> map) throws Exception {
        int size = board.getDimension();

        for (int i = 0; i < size * size; i++) {


            int move = game.getMove();
            try {
                while (!board.checkBoardAfterMove(board, game, map, move)) {
                    move = game.getMove();
                }
            } catch (Exception e) {

            }


            if (i % 2 == 1) {
                map.put(move, true);
                if (Rule.isOver(map, size, true)) {
                    System.out.println("wygrana true");
                    break;
                }
            } else {
                map.put(move, false);
                if (Rule.isOver(map, size, false)) {
                    System.out.println("wygrana false");
                    break;
                }
            }
            board.createBoard(board, map);
        }
    }


}
