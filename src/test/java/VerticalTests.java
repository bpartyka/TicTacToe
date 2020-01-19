import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class VerticalTests {

    @org.junit.Test
    public void tets() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(1, true);
        map.put(4, true);
        map.put(7, true);

        Assert.assertEquals(true, Rule.checkVertical(map, 3, true));
    }
    @org.junit.Test
    public void tets2() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(2, true);
        map.put(5, true);
        map.put(8, true);

        Assert.assertEquals(true, Rule.checkVertical(map, 3, true));
    }
    @org.junit.Test
    public void tets3() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(3, true);
        map.put(6, true);
        map.put(9, true);

        Assert.assertEquals(true, Rule.checkVertical(map, 3, true));
    }
}
