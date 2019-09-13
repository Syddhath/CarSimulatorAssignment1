import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadTest {
    @Test
    public void testRoad() {
        Road road = new Road(0, 0, 10);
        assertEquals(0, road.getRoad());
    }
}