/**
 * @author Siddharth Parmar
 * The Road class include the objects and how it behaves.
 * Field includes road, segment, length.
 */


public class Road {
    int road;
    int segment;
    int length;
    Road next;

    // Giving Road Number, Segment and length.

    public Road(int road, int segment, int length) {
        this.road = road;
        this.segment = segment;
        this.length = length;
    }

    //setNext will link road1 and road2

    public void setNext(Road next) {
        this.next = next;

    }

    public int getRoad() {
        return road;
    }
}

