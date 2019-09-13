public class Road {
    int road;
    int road2;
    int segment = 0;
    int endofroad1;
    int endofroad2;


    public Road(int road, int segment, int endofroad1) {
        this.road = road;
        this.segment = segment;
        this.endofroad1 = endofroad1;
    }

    public Road(int endofroad2) {
        this.endofroad2 = endofroad2;
    }


    public int getRoad() {
        return road;
    }


    public int getEndofroad1() {
        return endofroad1;
    }



}

