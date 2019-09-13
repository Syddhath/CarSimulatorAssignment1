import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightTest {
    @Test
    void testTrafficLight() {
        TrafficLight light = new TrafficLight();
        assertEquals(0, light.Change);
    }

}