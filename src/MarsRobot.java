public class MarsRobot {
    String status;
    int speed;
    int power;

    MarsRobot(String status, int sped, int power) {
        this.status = status;
        this.speed = sped;
        this.power = power;
    }

    MarsRobot(){}//nie zostanie dostarczony automatycznie gdy istnieje juz inny konstruktor

    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot();
       marsRobot.status = "w bazie";
        marsRobot.speed = 0;
        marsRobot.power = 4;

        MarsRobot marsRobot1 = new MarsRobot("w bazie", 0, 4);
        System.out.println(marsRobot.status);
        System.out.println(marsRobot1.status);
    }
}
