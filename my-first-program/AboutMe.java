/**
 * This program tells a little more about me.
 *
 * @author Dr.Mark Gyomory
 * @version August 20, 2019
 */
public class AboutMe
{
    public static void main(String[] args)
    {
        // Here are some facts about me.
        System.out.println("I was born in Detroit, but mostly grew up in Simpsonville, SC");
        System.out.println("I'm going to Embry–Riddle");
        System.out.println("My Sister, Claire, is a Senor at USC");
        System.out.println("In my free time i fix my computer");

        // Create variables and store values in them.
        String name = "mark";
        int birthYear = 2002;
        int currentYear = 2019;

        // What happens here?
        System.out.println("currentYear - birthYear");
        System.out.println(currentYear - birthYear);

        // Do some artithmetic
        int age = currentYear - birthYear;

        // concatenate literal strings with variables.
        System.out.println("My naem is " + name + ", and I am " + age + " years old.");

        /* you may notice that the age calculation is only corrent is you already had
        * your birthday this year. We can fix using a boolean variable and sme
        *conditional logic.
        */
        // Change this vakue to false if you haven't had your birthday yet this year
        boolean hadBirthday = true;

        // conditional, subtract one from the age if you haven't had your birthday hasn't occurred yet.
        if (hadBirthday == false){
            age -=1;
        }

        // This output should always be correct.
        System.out.println("My name is " + name + ", and I am " + age + " years old.");

    }
}