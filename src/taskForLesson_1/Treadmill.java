package taskForLesson_1;

public class Treadmill {
    private int distance;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    Boolean run(Competitor j, int track) {

        j.run();
        if (getDistance() <= track){
            return true;
        } else {
            return false;
        }
    }
}
