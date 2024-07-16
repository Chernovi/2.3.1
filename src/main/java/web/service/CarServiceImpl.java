package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    {   cars = new ArrayList<>();
        cars.add(new Car(1,"m1",123));
        cars.add(new Car(2,"m2",456));
        cars.add(new Car(3,"m3",789));
        cars.add(new Car(4,"m4",235));
        cars.add(new Car(5,"m5",134));
    }
    public List<Car> getCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
