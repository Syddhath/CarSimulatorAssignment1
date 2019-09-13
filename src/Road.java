// The length of the road is 40;
public class Road {
    int road;
    int segment = 0;
    int startofRaod;
    int endofroad1;
    int endofroad2;

    public Road(int road, int segment, int startofRaod, int endofroad1, int endofroad2) {
        this.road = road;
        this.segment = segment;
        this.startofRaod = startofRaod;
        this.endofroad1 = endofroad1;
        this.endofroad2 = endofroad2;
    }

    public int getEndofroad2() {
        return endofroad2;
    }

    public void setEndofroad2(int endofroad2) {
        this.endofroad2 = endofroad2;
    }

    public int getSegment() {
        return segment;
    }

    public void setSegment(int segment) {
        this.segment = segment;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public int getEndofroad1() {
        return endofroad1;
    }

    public void setEndofroad1(int endofroad1) {
        this.endofroad1 = endofroad1;
    }

    public int getStartofRaod() {
        return startofRaod;
    }

    public void setStartofRaod(int startofRaod) {
        this.startofRaod = startofRaod;
    }


}

