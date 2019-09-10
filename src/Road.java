// The length of the road is 40;
public class Road {
    int[] roads = {1, 2};
    int[] segment = {0, 1, 2};
    Vehicle vehicle = new Vehicle();


    private trafficLight tl;
    private String name;

    public void carArrive() {
        for (int i = 0; i < segment.length; i++) {
            System.out.println("road1 seg " + segment[i]);
        }

    }
}