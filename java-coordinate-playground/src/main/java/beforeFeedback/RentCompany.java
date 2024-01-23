package beforeFeedback;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        for (Car car : cars) {
            report.append(car.getName())
                    .append(" : ")
                    .append((int)Math.ceil(car.getChargeQuantity()))
                    .append("리터")
                    .append(System.getProperty("line.separator"));
        }
        return report.toString();
    }
}
