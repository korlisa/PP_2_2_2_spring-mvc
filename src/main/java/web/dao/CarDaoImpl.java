package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List <Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "model1", "black"));
        cars.add(new Car(2, "model2", "blue"));
        cars.add(new Car(3, "model3", "white"));
        cars.add(new Car(4, "model4", "red"));
        cars.add(new Car(5, "model5", "purple"));
    }
    @Override
    public List <Car> getCars (Integer count) {
        if (count == null || count <0 || count > cars.size()) {
            count = cars.size();
        }
        return cars.stream().limit(count).toList();
    }
}
