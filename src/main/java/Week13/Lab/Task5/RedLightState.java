package Week13.Lab.Task5;

public class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Already in Red state.");
    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Switching to Green state.");
        context.setState(new GreenLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Switching to Yellow state.");
        context.setState(new YellowLightState());
    }
}
