package Week13.Lab.Task5;

public class GreenLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Switching to Red state.");
        context.setState(new RedLightState());
    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Already in Green state.");
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Switching to Yellow state.");
        context.setState(new YellowLightState());
    }
}
