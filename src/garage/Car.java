package garage;
public class Car {
    String carName;
    String carModel;
    String status;
    String color;
    int value;
    boolean sold;

    /**
     * getters and setters for all the car attributes
     * @return
     */
    public boolean isSold() {
        return sold;//uri
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getValue() {
        return value;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }
    //eafh

    /**
     * constructor
     * @param carName
     * @param carModel
     * @param color
     * @param status
     * @param value
     * @param sold
     */
    public Car(String carName, String carModel, String color, String status, int value, boolean sold){
        this.carName = carName;
        this.carModel = carModel;
        this.color = color;
        this.status = status;
        this.value = value;
        this.sold = sold;
    }

}
