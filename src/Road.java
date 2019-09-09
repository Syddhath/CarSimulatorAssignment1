// The length of the road is 40;

import java.util.Random;

public class Road {
    final int Red = 0;
    final int Green = 1;
    public String[] roadSegment = {"Segment1", "Segment2", "Segment3", "Segment4"};
    public int[] roadLen = {0, 10, 20, 30, 40};
    Random rand = new Random();
    int lightChange = this.rand.nextInt(2);

    //There are two traffic light: Red and Green;
    public String trafficLight() {
        if (lightChange == Red) {
            return "Sid's car stopped";
        } else if (lightChange == Green) {
            return "Sid's car is in Road 5";
        } else {
            return "Car Disappear";
        }
    }
//    public void carPosition(){
//        if (roadLen[0] < roadLen[1]){
//            vehicle.setCar("Car is in Segment1");
//            carPosition();

    public String[] getRoadSegment() {
        return roadSegment;
    }

    public int[] getRoadLen() {
        return roadLen;
    }
}