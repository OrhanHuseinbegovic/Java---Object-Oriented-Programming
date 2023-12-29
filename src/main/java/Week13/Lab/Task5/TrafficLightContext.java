package Week13.Lab.Task5;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        // Set the initial state to RedLightState
        this.currentState = new RedLightState();
    }

    // Setter method to change the current state
    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    // Delegating state-specific actions to the current state
    public void transitionToRed() {
        currentState.transitionToRed(this);
    }

    public void transitionToGreen() {
        currentState.transitionToGreen(this);
    }

    public void transitionToYellow() {
        currentState.transitionToYellow(this);
    }
}
