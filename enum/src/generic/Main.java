package generic;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();

        Head head = new Head(){};

        SmallHead smallhead = new SmallHead();
        BigHead bighead = new BigHead();

        Leg leg = new Leg();

        Robot<SmallHead> robot = new Robot<SmallHead>(body, smallhead);

        Robot<BigHead> robot1 = new Robot<BigHead>(body,bighead);


        Robot<BigHead> robot2 = new Robot(body,bighead);

        Robot<Head> robot3 = new Robot<>(body,head);

        robot.getHead().born();
        robot1.getHead().turn();

        robot2.getHead().turn();















    }
}