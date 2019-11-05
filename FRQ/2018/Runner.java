
public class Runner
{
    public static void main(String[] args) {
        FrogSimulation frog1 = new FrogSimulation(25, 5);
        FrogSimulation frog2 = new FrogSimulation(25, 10);

        System.out.println(frog1.simulate());

        System.out.println(frog2.rumsimulation(1000));

    }
}