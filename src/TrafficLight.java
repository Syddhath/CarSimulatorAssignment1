import java.util.Random;

public class TrafficLight {
    final int Red = 0;
    final int Green = 1;
    Random rand = new Random();
    int Change;
    //There are two traffic light: Red and Green;
    public void colorChange() {

        Change = this.rand.nextInt(2);
        if (Change == Red) {
            System.out.println("RED LIGHT");
            System.out.println();
        } else
            //if (lightChange == Green) {
            System.out.println("Light is green");
        //else {
        //   System.out.println("Car Disappear");
    }
}


//color change