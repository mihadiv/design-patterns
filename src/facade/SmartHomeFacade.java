package src.facade;

public class SmartHomeFacade {

    private DoorLockSystem doors = new DoorLockSystem();
    private AlarmSystem alarm = new AlarmSystem();
    private LightSystem lights = new LightSystem();
    private Thermostat thermostat = new Thermostat();

    public void leaveHome() {
        System.out.println("\nLeaving...");
        lights.turnOffLights();
        doors.lookDoors();
        thermostat.setThermostat(18);
        alarm.activateAlarm();
    }

    public void arriveHome() {
        System.out.println("\nArriving...");
        doors.unlookDoors();
        alarm.deactivateAlarm();
        lights.turnOnLights();
        thermostat.setThermostat(22);
    }

    public void goodNight() {
        System.out.println("\nGood night time...");
        lights.turnOffLights();
        doors.lookDoors();
        thermostat.setThermostat(19);
    }
}
