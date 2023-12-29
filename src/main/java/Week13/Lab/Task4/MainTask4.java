package Week13.Lab.Task4;

public class MainTask4 {
    /*
    Write a client code that demonstrates the usage of the NewDevice interface.
    Utilize the DeviceAdapter to interact with an instance of OldDeviceImpl seamlessly.
     */
    public static void main(String[] args) {
        // Using the new device directly
        NewDevice newDevice = new NewDeviceImpl();
        newDevice.operateNewFunction();

        // Using the old device through the adapter
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice adaptedDevice = new DeviceAdapter(oldDevice);
        adaptedDevice.operateNewFunction();
    }
}
