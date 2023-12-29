package Week13.Lab.Task5;

public class YellowLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Switching to Red state.");
        context.setState(new RedLightState());
    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Switching to Green state.");
        context.setState(new GreenLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Already in Yellow state.");
    }
}
