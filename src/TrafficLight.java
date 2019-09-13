/**
 * @author Siddharth Parmar
 * The TrafficLight class include the behavior of the lights.
 * Field includes lights Red and Green.
 */

import java.util.Random;

public class TrafficLight {
    final int Red = 0;
    final int Green = 1;
    int Change;
    Random rand = new Random();

    //There are two traffic light: Red and Green which will change randomly.

    public int colorChange() {
        Change = this.rand.nextInt(2);
        if (Change == 0) {
            return Green;
        } else {
            return Red;
        }
    }
}
