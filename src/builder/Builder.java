package builder;

public interface Builder {
    public void startUpOperations();
    public void buildBody();
    public void insertWheels();
    public void addHeadlights();
    public void endOperations();
    public Product getVehicle();
}
