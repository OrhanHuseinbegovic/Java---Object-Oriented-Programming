package Week13.Lab.Task5;

public class TrafficLightController{
    public static void main(String[] args) {
        // Instantiate TrafficLightContext named context
        TrafficLightContext context = new TrafficLightContext();

        // Demonstrate traffic light state transitions
        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToGreen();
    }
}
