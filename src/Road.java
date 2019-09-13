public class Road {
    int road;
    int segment;
    int length;
    Road next;

    public Road(int road, int segment, int length) {
        this.road = road;
        this.segment = segment;
        this.length = length;
    }
    public void setNext(Road next) {
        this.next = next;
    }
    public int getRoad() {
        return road;
    }
}

