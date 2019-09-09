public class Vehicle {
    private final static int carLen = 5;
    private final static double carWidht = 2.5;
    Road road = new Road();
    Vehicle vehicle = new Vehicle();
    private String car;

    public int getCarLen() {
        return carLen;
    }

    public double getCarWidht() {
        return getCarWidht();
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
//    public void carPosition() {
//
//        if (road.roadLen[0] < road.roadLen[1]++){
//            vehicle.setCar("Car is in Segment1");
//            carPosition();
