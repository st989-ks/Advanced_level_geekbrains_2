package taskForLesson_1;

public class Person implements Competitor {

    private int jumpMax;
    private int runMax;

    @Override
    public void setPar(int jumpMax, int runMax) {
        this.jumpMax = jumpMax;
        this.runMax = runMax;
    }

    @Override
    public int getJump() {
        return this.jumpMax;
    }

    @Override
    public int getTrack() {
        return this.runMax;
    }


    @Override
    public void jump() {

        System.out.println( "Человек прыгнул");
    }

    @Override
    public void run() {

        System.out.println( "Человек побежал");
    }
}