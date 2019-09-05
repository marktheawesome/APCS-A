
/**
 * Write a description of class Rover here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rover
{
    // instance variables
    private String name;
    private int x;
    private int y;
    private int dir;

    /**
     * Constructor for objects of class Rover
     */
    public Rover(String name){
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }

    // methods
    public void move(int magnitude) {
        // if (dir == 0) {
        //     y = y + magnitude;
        // }
        // else if (dir == 1) {
        //     x = x  + magnitude;
        // }
        // else if (dir == 2) {
        //     y = y  - magnitude;
        // }
        // else if (dir == 3) {
        //     x = x  - magnitude;
        // }
            y =0;
        System.out.println(name + " moved forward " + magnitude + "  American Freedom units.");
    }

    // public void rotateRight() {
    //     dir = dir + 1;

    //     if(dir == 4){
    //         dir = 0;
    //     }

    //     System.out.println(name + " rotated to the right, and is facing " + getDirectionName());
    // }

    // public void rotateLeft() {
    //     dir = dir - 1;

    //     if(dir == -1){
    //         dir = 3;
    //     }
    //     System.out.println(name + " rotated to the left, and is facing " + getDirectionName());
    // }


    public void rotate(double deg){
        this.dir += deg;

        if (dir < 0){
            dir = 360 + dir;
        }
        System.out.println(this.name + " has the bearing " + dir + " deg");
    }

    private String getDirectionName(){
        if (this.dir == 0){
            return "North";
        }
        else if (this.dir == 1){
            return "East";
        }
        else if (this.dir == 2){
            return "South";
        }
        else if (this.dir == 3){
            return "West";
        }

        return "This shuld never be returned.";
    }
}

