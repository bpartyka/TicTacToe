import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class HorizontalTests {
    @org.junit.Test
    public void tets() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(1, true);
        map.put(2, true);
        map.put(3, true);

        Assert.assertEquals(true, Rule.checkHorizontal(map, 3, true));
    }

    @org.junit.Test
    public void tets2() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(1, true);
        map.put(2, true);
        map.put(4, true);

        Assert.assertEquals(false, Rule.checkHorizontal(map, 3, true));
    }

    @org.junit.Test
    public void tets3() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(4, true);
        map.put(5, true);
        map.put(6, true);

        Assert.assertEquals(true, Rule.checkHorizontal(map, 3, true));
    }

    @org.junit.Test
    public void tets4() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(7, true);
        map.put(8, true);
        map.put(9, true);

        Assert.assertEquals(true, Rule.checkHorizontal(map, 3, true));
    }

    @org.junit.Test
    public void tets5() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(1, true);
        map.put(4, true);
        map.put(7, true);

        Assert.assertEquals(false, Rule.checkHorizontal(map, 3, true));
    }

    @org.junit.Test
    public void tets6() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        map.put(1, true);
        map.put(9, true);
        map.put(3, true);
        map.put(4, false);
        map.put(5, false);
        map.put(6, false);

        Assert.assertEquals(true, Rule.checkHorizontal(map, 3, false));
    }
}
