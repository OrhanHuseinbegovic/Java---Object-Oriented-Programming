package Week13.Lab.Task5;

public interface TrafficLightState {
    void transitionToRed(TrafficLightContext context);
    void transitionToGreen(TrafficLightContext context);
    void transitionToYellow(TrafficLightContext context);
}
