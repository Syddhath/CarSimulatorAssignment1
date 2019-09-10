// The length of the road is 40;
public class Road {
    int[] roads = {1, 2};
    int[] segment = {1, 2, 3, 4};
    Vehicle vehicle = new Vehicle();
    trafficLight


    private trafficLight tl;
    private String name;

    public void carArrive() {
        for (int i = 0; i < segment.length; i++) {
            //System.out.println("road1 seg " + segment[i]);
            System.out.println("Car is in Road " + roads[0] + " Segment " + (segment[0] + i));
            //" position " + (vehicle.car + i) );
        }
    }
}