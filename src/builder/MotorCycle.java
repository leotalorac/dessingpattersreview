package builder;

public class MotorCycle implements Builder{
    private String brandName;
    private Product product;
    public MotorCycle(String brand){
        product = new Product();
        this.brandName = brand;
    }

    @Override
    public void startUpOperations() {
        product.add(String.format("MotorCycle model is: %s", this.brandName));
        
    }

    @Override
    public void buildBody() {
        product.add("This is a body of the MotorCycle");
        
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
        
    }

    @Override
    public void addHeadlights() {
        product.add("1 Headlights are added");
        
    }

    @Override
    public void endOperations() {
        
    }

    @Override
    public Product getVehicle() {
        return product;
    }
     
}
