package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    public void initializeCars() {
        cars.add(new Car("Nissan", "Skyline r34", 2000));
        cars.add(new Car("Toyota", "Supra a80", 1999));
        cars.add(new Car("Honda", "NSX r", 1998));
        cars.add(new Car("Mitsubishi", "Lancer Evolution VI", 2001));
        cars.add(new Car("Toyota", "Land Cruiser 80", 1993));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars;
    }
}
