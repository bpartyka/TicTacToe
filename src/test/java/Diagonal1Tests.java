import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Diagonal1Tests {

    @org.junit.Test
    public void shouldReturnTrueIfGiveValuesAreSameOnDiagonal() {
        //Given
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        map.put(1, true);
        map.put(5, true);
        map.put(9, true);
        //When
        boolean result = Rule.checkDiagonal1(map, 3, true);

        //Then
        Assert.assertEquals(true, result);
    }
    @org.junit.Test
    public void tets2() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        map.put(1, false);
        map.put(5, false);
        map.put(9, false);

        Assert.assertEquals(true, Rule.checkDiagonal1(map, 3, false));
    }
}
