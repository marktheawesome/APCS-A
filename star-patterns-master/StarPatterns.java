/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  [Mark Gyomory] <-- you
 * @version [          ] <-- today
 */


class StarPatterns
{
    public static void starGrid(int h, int w)
    {
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }
    }

    public static void starBox(int h, int w)
    {
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==0 || row==h-1 || col==0 || col==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }
    }

    public static void starX(int h)
    {
        int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==col || row+col==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }
    }

    public static void starZ(int h)
    {
        int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row == 0 || row == w-1 || row+col==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }

    }

    public static void starXBox(int h)
    {
        int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row == 0 || col == 0 || row == w-1 ||
                col == h -1  || row+col==h-1 || row == col)
                {System.out.print("*");}

                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }

    }

    public static void twoStarBoxes(int w, int h){
        int halfh = h/2;
        int halfw = w/2;

        for (int row=0; row<h; row++){
            for (int col=0; col<w; col++){
                if((row < halfh && col < halfw) || (row >= halfh && col > halfw)){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.print("\n");
        }
    }

    public static void starTriangle(int h){
        for(int row = 0; row < h; row ++){
            for(int col = 0; col <= row; col ++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void emptyTriangle(int h){
        for(int row = 0; row < h; row ++){
            for(int col = 0; col <= row; col ++){
                if(col == 0 || col == row || row == h -1 ){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.print("\n");
        }
    }

    public static void starTriangleUR(int h){

        for(int row = h; row > 0; row --){
            for(int col = 0; col <= h; col ++){

                if(col < row){System.out.print(" ");}
                if(col >= row)System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void isoscelesStarTriangle(int h){
        int w = h;

        for(int row = 0; row < h; row ++){
            for(int col = 0; col <= w; col ++){


            }
        }
    }


    public static void main(String[] args)
    {
        // starGrid(5, 5);
        // System.out.println();

        // starBox(7, 9);
        // System.out.println();

        // starX(7);
        // System.out.println();

        // starZ(7);
        // System.out.println();

        // starXBox(7);
        // System.out.println();

        // twoStarBoxes(12, 8);
        // System.out.println();

        // starTriangle(8);
        // System.out.println();

        // emptyTriangle(8);
        // System.out.println();

        // starTriangleUR(8);
        // System.out.println();



	}

}