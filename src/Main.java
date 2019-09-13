public class Main {

    public static void main(String[] args) {
        Road road1 = new Road(1, 0, 10);
        Road road2 = new Road(2, 0, 10);
        road1.setNext(road2);


        Vehicle vehicle = new Vehicle(0, 0);
        TrafficLight light = new TrafficLight();
        Road current = road1;
        current.segment = 0;

        while (current != null) {
            System.out.println("Car Move to Road:" + current.road);
            if (current.road == 1) {
                while (current.segment <= current.length) {
                    if (current.segment == current.length) {
                        System.out.println("car is moving in Road" + current.getRoad() + " Segment " + current.segment);
                        if (light.colorChange() == 1) {
                            System.out.println("RED LIGHT: Car has stopped");
                        } else {
                            System.out.println("GREEN LIGHT: Car is moving");
                            current.segment += 1;
                        }
                    } else {
                        System.out.println("Car is moving in Road" + current.road + " segment" + current.segment);
                        current.segment += 1;
                    }
                }
            } else {
                current.segment = 0;
                while (current.segment <= current.length) {
//                     (current.getRoad() == 1 && current.segment < 10) {
                    System.out.println("car is moving in Road" + current.getRoad() + " Segment " + current.segment);
                    current.segment++;


                }
            }
            current = current.next;
        }
    }
}
//        while (vehicle.startpoint <= road2.getEndofroad()){
//            if (road2.getRoad() == 2  &&  road2.segment<20){
//                System.out.println("car is moving in Road" + road2.getRoad() + " Segment " + road2.segment);
//                road2.segment++;
//            }if (road2.segment == 20);
//            System.out.println("END  OF THE  ROAD");
//            break;


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


