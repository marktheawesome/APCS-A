
public class FrogSimulation{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        this.goalDistance = dist;
        this.maxHops = numHops;
    }

    private int hopDistance(){
        int dis =  ((int)(Math.random() * 10));

        if (Math.random() < 0.15){dis*=-1;}

        return dis;



    }

    public boolean simulate(){
        int count = 0;
        int position = 0;

        while(count < maxHops && position >= 0){
            if(position >= this.goalDistance){
                return true;
            }
            position += hopDistance();
            count++;
        }
        return false;
    }

    public double rumsimulation(int num){
        double good = 0;
        for(int i = 0; i <= num; i++){
            boolean outcome = simulate();
            System.out.println(outcome);
            if(outcome){good++;}
        }
        return (good/num);
    }
}