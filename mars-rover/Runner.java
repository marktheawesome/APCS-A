
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args) {
        Rover r1 = new Rover("Aryan");
        Rover r2 = new Rover("Craig");

        r1.move(10);
        //r2.rotateRight();
        r2.rotate(91);
        r2.move(2);
        //r1.rotateRight();
        r1.rotate(-91);
        r1.move(4);
        //r2.rotateLeft();
    }
}
