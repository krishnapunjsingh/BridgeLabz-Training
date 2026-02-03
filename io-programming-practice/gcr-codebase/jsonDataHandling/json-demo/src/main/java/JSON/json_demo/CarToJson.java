package JSON.json_demo;

import com.fasterxml.jackson.databind.ObjectMapper;
class Car {

    private String brand;
    private String model;
    private int year;

    public Car() {}

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // ✅ Getters (REQUIRED)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}


public class CarToJson {
	public static void main(String[] args) throws Exception {

        // Create Car object
        Car car = new Car("Toyota", "Fortuner", 2023);

        // Convert to JSON
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter()
                            .writeValueAsString(car);

        // Print JSON
        System.out.println(json);
    }
}
