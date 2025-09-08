public class BatteryEngineStrategy implements EngineStrategy{
    @Override
    public String getEngineType() {
        return "Battery";
    }

    public String getFuel() {
        return "30%";
    }
}
