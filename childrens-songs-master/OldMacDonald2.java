/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 *
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2
{

    public static void eieio()
    {
        /**
         * This will song the first and 5th lines
         */
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    public static void hadA(String animal)
    {
        /**
         * this sings the 2nd line
         * @param animal the animal of the verse
         */
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }


    public static void withA(String sound)
    {
        /**
         * sings the 3-4th lines.
         * @param sound the sound the animal makes
         */
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");
    }


    public static void singIt(String animal, String sound)
    {
        /**
         * This orginizes the other functions.
         * @param animal the animal of the verse
         * @param sound the sound the animal makes
         */
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }


    public static void main(String[] args)
    {
        /**
         * this is where the magic happens.
         *
         */
        System.out.println("Old MacDonald Had A Farm\n"); // Give our song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");

        // now see how easy it is to add some more animals


        // modify the methods above to get quotation marks around the animal sounds
    }

}
