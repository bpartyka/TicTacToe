import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Diagonal2Tests {
    @org.junit.Test
    public void tets() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(3, true);
        map.put(5, true);
        map.put(7, true);

        Assert.assertEquals(true, Rule.checkDiagonal2(map, 3, true));
    }
    @org.junit.Test
    public void tets2() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(3, false);
        map.put(5, false);
        map.put(7, false);

        Assert.assertEquals(true, Rule.checkDiagonal2(map, 3, false));
    }

}
