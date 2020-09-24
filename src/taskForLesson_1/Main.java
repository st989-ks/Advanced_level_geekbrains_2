package taskForLesson_1;


public class Main {

    public static void main(String[] args) {
        Competitor[] competitors = {
                new Cat(),
                new Robot(),
                new Person()
        };
        ((competitors[0])).setPar( 5,20 );
        ((competitors[1])).setPar( 80,1000 );
        ((competitors[2])).setPar( 2,50 );

        for (Competitor j : competitors) {
            j.jump();
            j.run();
        }

        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        wall.setHeight( 4 );
        treadmill.setDistance( 30 );

        System.out.println("-----------------------------------");

        for (Competitor j : competitors) {
            if (wall.jump( j , j.getJump() )){
                System.out.println("Прыжок удачный\n");
                if (treadmill.run(j, j.getTrack())){
                    System.out.println("Дистанцию пробежал\n");
                }else {
                    System.out.println("Слишком далеко, упал и не поднялся!\n");
                }
            }else {
                System.out.println("Слишком высоко, не перепрыгнул! Бегать не будет!\n");

            }
        }

    }
}
