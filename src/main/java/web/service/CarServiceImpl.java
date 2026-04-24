package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>(List.of(
            new Car("Nissan", "Skyline r34", 2000),
            new Car("Toyota", "Supra a80", 1999),
            new Car("Honda", "NSX r", 1998),
            new Car("Mitsubishi", "Lancer Evolution VI", 2001),
            new Car("Toyota", "Land Cruiser 80", 1993)));

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
