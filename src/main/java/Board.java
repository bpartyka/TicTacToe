import java.util.Map;

public class Board {

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    private int dimension;

    public Board(int dimension) {
        this.dimension = dimension;
    }

    public void createBoard(Board board, Map<Integer, Boolean> map) {
        System.out.println();
        int size = board.getDimension();
        for (int j = 1; j <= size * size; j++) {
            if (map.containsKey(j)) {
                System.out.print(map.get(j) + " " + j + ",");
            } else {
                System.out.print("pusto " + j + ",");
            }
            if (j % size == 0) {
                System.out.println();
            }
        }

    }

    public boolean checkBoardAfterMove(Board board, Game game, Map<Integer, Boolean> map, int newMove) throws Exception {
        if (map.containsKey(newMove)) {
            throw new Exception();
        }

        if (map.size() >= board.getDimension()) {
            throw new Exception();
        }

        return true;
    }

}
