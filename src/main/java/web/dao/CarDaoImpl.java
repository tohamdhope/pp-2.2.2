package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("BMW", "Black", 2012));
        list.add(new Car("Dodge", "Red", 2003));
        list.add(new Car("Cadillac", "Grey", 2019));
        list.add(new Car("Belarus", "Blue", 1999));
        list.add(new Car("Audi", "White", 2017));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
