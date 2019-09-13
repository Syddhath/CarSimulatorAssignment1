public class Main {

    public static void main(String[] args) {
        Road road = new Road(1, 0, 10);
        Road road2 = new Road(20);
        Vehicle vehicle = new Vehicle(0, 0);
        TrafficLight light = new TrafficLight();

        while (vehicle.startpoint <= road.getEndofroad1()) {
            if (road.getRoad() == 1 && road.segment < 10) {
                System.out.println("car is moving in Road" + road.getRoad() + " Segment " + road.segment);
                road.segment++;
            }
            if (road.segment == 10) {
                light.colorChange();
                break;
            }
        }
    }
}

//        road.carArrive();
//
//
//        for (int i = 0; i < segment.length; i++) {
//            //System.out.println("road1 seg " + segment[i]);
//            System.out.println("Car is in Road " + roads[0] + " Segment " + (segment[0] + i));
//            //" position " + (vehicle.car + i) );
//        }trafficLight.colorChange();
//        if (trafficLight.lightChange==0){
//
//        }else
//    }


