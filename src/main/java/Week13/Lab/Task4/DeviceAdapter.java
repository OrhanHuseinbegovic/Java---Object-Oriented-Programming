package Week13.Lab.Task4;

public class DeviceAdapter implements NewDevice{
    //The adapter should wrap an instance of OldDeviceImpl
    // and provide a translation mechanism to make it compatible
    // with the NewDevice interface.
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        // Implement the translation mechanism to make OldDevice compatible with NewDevice
        System.out.println("Adapter is translating the old function to the new function...");
        oldDevice.operateOldFunction();
    }
}
