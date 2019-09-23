
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
    private double x;
    private double y;
    private double dir;
    private double x0;
    private double y0;

    /**
     * Constructor for objects of class Rover
     */
    public Rover(String name){
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }

    public Rover(String name, int x, int y){
        this.name = name;
        this.x0 = x;
        this.y0 = y;
        this.x = x;
        this.y = y;
        this.dir = 0;
    }

    // methods
    private void position(){
        System.out.println(name + "," + " x = " + this.x + "," + " Y = " + this.y + "," + " Dir = " + this.dir);
    }

    public void move(int magnitude) {
        if (dir % 2 == 1){
            y = y + magnitude;
            x = x + magnitude;
        }
        if (dir == 0) {
            y = y + magnitude;
        }
        else if (dir == 2) {
            x = x  + magnitude;
        }
        else if (dir == 4) {
            y = y  - magnitude;
        }
        else if (dir == 6) {
            x = x  - magnitude;
        }
        this. position();

    }

    public void rotate(double deg){
        dir = dir + deg;

        while(dir < 0)
        {
            dir = dir + 8;
        }
        while(dir > 7)
        {
            dir = dir - 8;
        }

        System.out.println(name + " is facing " + getDirectionName());
    }

    public void rotateTo(double newDir){
        double diff = dir - newDir;
        rotate(diff);
    }

    private String getDirectionName(){
        if (this.dir == 0){
            return "North";
        }
        else if(this.dir == 1){
            return "Northeast";
        }
        else if (this.dir == 2){
            return "East";
        }
        else if (this.dir == 3){
            return "Southeast";
        }
        else if (this.dir == 4){
            return "South";
        }
        else if (this.dir == 5){
            return "Southwest";
        }
        else if (this.dir == 6){
            return "West";
        }
        else if (this.dir == 7){
            return "Northwest";
        }

        return "This shuld never be returned.";
    }

    public void teleport(int newX, int newY){
        this.x = newX;
        this.y = newY;
        this.position();
    }

    public void moveTo(int newX, int newY){
        double dx = newX - this.x;
        double dy = newY - this.y;

        if(dy == 0){

            this.x = this.x + dx;
        }

        else if (dx == 0){
            this.y = this.y + dy;
        }

        double slope = dy/dx;

        if (slope == 1 || slope ==-1){
            this.x = this.x + dx;
            this.y = this.y + dy;
        }


        position();
    }

    public void goHome(){
        this.x = this.x0;
        this.y = this.x0;
    }
}

