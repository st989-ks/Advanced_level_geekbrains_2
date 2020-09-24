package taskForLesson_1;

public class Wall {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    boolean jump(Competitor j, int jump) {

        j.jump();
        if (getHeight() <= jump) {
            return true;
        } else {
            return false;
        }


    }
}
