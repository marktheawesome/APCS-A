
/**
 * Write a description of class Rover here.
 *
 * @author Mark Gyomory
 * @version (a version number or a date)
 */
public class Rover{
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

    /**
     * This just prtints the rover's current X, Y, Direction
     */
    private void position(){
        System.out.println(name + "," + " x = " + this.x + "," + " Y = " + this.y + "," + " Dir = " + this.dir);
    }

    /**
     * Moves the rover in a directon by a magnitide. 8 directional.
     * @param magnitude the sistant wished to traveled
     */
    public void move(int magnitude) {
        if (dir == 0) {
            y = y + magnitude;
        }

        else if (dir == 1){
            y = y + magnitude;
            x = x + magnitude;
        }

        else if (dir == 2){
            x = x  + magnitude;
        }

        else if (dir == 3){
            y = y - magnitude;
            x = x + magnitude;
        }

        else if (dir == 4){
            y = y  - magnitude;
        }

        else if (dir == 5){
            y = y - magnitude;
            x = x - magnitude;
        }

        else if (dir == 6) {
            x = x  - magnitude;
        }

        else if (dir == 7){
            y = y + magnitude;
            x = x - magnitude;
        }

        this. position();

    }

    /**
     * Rotates the rover by a certin number of 45 deg turns.
     * @param deg nuber of turns
     */
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

    /**
     * will automagically turn to certin direction
     * @param newDir desired new direction.
     */
    public void rotateTo(double newDir){
        double diff = newDir - dir;
        rotate(diff);
    }


    /**
     * returns the name of the rovers direction
     * @return direction name
     */
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

   /**
    * teleports the rover to new location
    * @param newX desired X
    * @param newY desired Y
    */
    public void teleport(int newX, int newY){
        this.x = newX;
        this.y = newY;
        this.position();
    }

    /**
     * like teleport but more confusing
     * @param newX desired X
     * @param newY desired Y
     */
    public void moveTo(int newX, int newY){
        double dx = newX - this.x;
        double dy = newY - this.y;

        if(dy == 0){

            //this.x = this.x + dx;
            if (dx > 0){
                rotateTo(2);
                this.move((int)Math.abs(dx));
            }
            else if (dx < 0){
                rotateTo(6);
                this.move((int)Math.abs(dx));
            }
            else{
                System.out.println("This should never happened.");
            }
        }

        else if (dx == 0){
            //this.y = this.y + dy;
            if (dy > 0){
                rotateTo(0);
                this.move((int)Math.abs(dy));
            }
            else if (dy < 0){
                rotateTo(4);
                this.move((int)Math.abs(dy));
            }
            else{
                System.out.println("This should never happened.");
            }
        }


        double slope = dy/dx;

        if (slope == 1 || slope == -1){
            if(dy > 0 && dx > 0){
                rotateTo(1);
                move((int) Math.abs(dy));
            }

            else if(dy < 0 && dx < 0){
                rotateTo(5);
                move((int) dy);
            }

            else if(dy < 0 && dx > 0){
                rotateTo(3);
                move((int) dx);
            }

            else if(dy > 0 && dx < 0){
                rotateTo(7);
                move((int) dy);
            }
            // this.x = this.x + dx;
            // this.y = this.y + dy;
        }


        while(this.x != newX && this.y != newY){
            if(dx != 0){

                //this.x = this.x + dx;
                if (dx > 0){
                    rotateTo(2);
                    this.move((int)Math.abs(dx));
                }
                else if (dx < 0){
                    rotateTo(6);
                    this.move((int)Math.abs(dx));
                }
                else{
                    System.out.println("This should never happened.");
                }
            }

            if (dy != 0){
                //this.y = this.y + dy;
                if (dy > 0){
                    rotateTo(0);
                    this.move((int)Math.abs(dy));
                }
                else if (dy < 0){
                    rotateTo(4);
                    this.move((int)Math.abs(dy));
                }
                else{
                    System.out.println("This should never happened.");
                }
            }

        }
    }

    /**
     * uses moveto to go back to origianl positon
     */
    public void goHome(){
        moveTo((int)this.x0, (int)this.y0);
    }
}

