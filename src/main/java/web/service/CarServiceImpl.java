package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Mazda", "6", 2011));
            carList.add(new Car("KIA", "Sorento", 2020));
            carList.add(new Car("Honda", "Accord", 2014));
            carList.add(new Car("BMW", "6", 2012));
            carList.add(new Car("Mazda", "3", 2011));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}