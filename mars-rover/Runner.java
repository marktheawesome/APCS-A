
/**
 * Write a description of class Runner here.
 *
 * @author Mark Gyomory
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
        Rover r6 = new Rover("Brian");
        Rover r7 = new Rover("Noelle");
        Rover r8 = new Rover("Brendan");


        // r1.teleport(2,2);
        r1.moveTo(10,0); // Aryan X
        r2.moveTo(0,10); // Craig X

        r3.moveTo(10, 10); // Mark X
        r4.moveTo(-10,-10); // Cole X

        r5.moveTo(-10,10); // Sky
        r6.moveTo(10,-10); // Brian

        r7.moveTo(1, 10); //Noelle
        r8.moveTo(-10, 1); //Brendan

        r1.goHome();
    }
}
