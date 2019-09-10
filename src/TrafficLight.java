import java.util.Random;

public class TrafficLight {
    final int Red = 0;
    final int Green = 1;
    Random rand = new Random();
    int lightChange = this.rand.nextInt(2);


    //There are two traffic light: Red and Green;
    public String trafficLightChange() {
        if (lightChange == Red) {
            return "Sid's car stopped";
        } else if (lightChange == Green) {
            return "Sid's car is in Road 5";
        } else {
            return "Car Disappear";
        }
    }
}




