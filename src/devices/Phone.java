package devices;

public class Phone extends Device {
    public String model;
    public Double screenSize;
    Boolean isAndroid;

    public Phone(Integer id, String producer, String model, Double screenSize) {
        super(id, producer, model);
    }
}
