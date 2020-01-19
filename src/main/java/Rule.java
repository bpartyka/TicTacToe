import java.util.Map;

public class Rule {

    static boolean isOver(Map<Integer, Boolean> map, int size, boolean player) {

        if (Rule.checkVertical(map, size, player)) {
            return true;
        }
        if (Rule.checkHorizontal(map, size, player)) {
            return true;
        }
        if (Rule.checkDiagonal1(map, size, player)) {
            return true;
        }
        if (Rule.checkDiagonal2(map, size, player)) {
            return true;
        }
        return false;
    }

    //pion
    static boolean checkVertical(Map<Integer, Boolean> map, int size, boolean player) {
        int win = 0;
        for (int j = 1; j <= size; j++) {
            for (int i = j; i <= size * size; i = i + size) {
                if (i <= size) {
                    win = 0;
                }
                if (map.containsKey(i)) {
                    if (map.get(i).equals(player)) {
                        win++;
                        if (win == size) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    //poziom
    static boolean checkHorizontal(Map<Integer, Boolean> map, int size, boolean player) {
        int win = 0;
        for (int i = 1; i <= size * size; i++) {
            if (i % size == 1) {
                win = 0;
            }
            if (map.containsKey(i)) {
                if (map.get(i).equals(player)) {
                    win++;
                    if (win == size) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //    przekatna 1
    static boolean checkDiagonal1(Map<Integer, Boolean> map, int size, boolean player) {
        int win = 0;
        for (int i = 1; i <= size * size; i = i + size + 1) {
            if (i <= size - (size - 1)) {
                win = 0;
            }
            if (map.containsKey(i)) {
                if (map.get(i).equals(player)) {
                    win++;
                    if (win == size) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //        przekatna 2
    static boolean checkDiagonal2(Map<Integer, Boolean> map, int size, boolean player) {
        int win = 0;
        for (int i = size; i < size * size; i = i + size - 1) {
            if (i == size) {
                win = 0;
            }
            if (map.containsKey(i)) {
                if (map.get(i).equals(player)) {
                    win++;
                    if (win == size) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean winnerChecker(Map<Integer, Boolean> map, int size, boolean player, int i, int win) {
        if (map.containsKey(i)) {
            if (map.get(i).equals(player)) {
                win++;
                if (win == size) {
                    return true;
                }
            }
        }
        return false;
    }
}
