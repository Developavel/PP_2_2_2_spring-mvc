package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Nissan", "Skyline r34", 2000));
        cars.add(new Car("Toyota", "Supra a80", 1999));
        cars.add(new Car("Honda", "NSX r", 1998));
        cars.add(new Car("Mitsubishi", "Lancer Evolution VI", 2001));
        cars.add(new Car("Toyota", "Land Cruiser 80", 1993));
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(cars.subList(0, Math.min(count, cars.size())));
    }
}
