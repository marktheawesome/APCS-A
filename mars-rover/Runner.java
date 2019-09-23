
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
        Rover r3 = new Rover("Mark");
        Rover r4 = new Rover("Cole");
        Rover r5 = new Rover("Sky");

        // r1.move(10);
        // r2.rotate(91);
        // r2.move(2);
        // r1.rotate(-91);
        // r1.move(4);
        // r1.rotate(280);
        // r1.rotate(-1);
        // r1.move(2);

        // r1.teleport(2,2);
        r1.moveTo(10,0);
        r2.moveTo(0,10);
        r3.moveTo(10, 10);
        r4.moveTo(-10,-10);
        r5.moveTo(-10,10);
    }
}
