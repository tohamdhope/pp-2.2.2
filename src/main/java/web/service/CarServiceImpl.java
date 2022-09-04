package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final CarDao cars;

    @Autowired
    public CarServiceImpl(CarDao cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> carsList(int count) {
        return cars.getLimitList(count);
    }
}
