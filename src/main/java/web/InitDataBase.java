package web;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitDataBase {


    private static final List<Car> carList = new ArrayList<>();

    private CarService carService;

    public InitDataBase(CarService carService) {

        this.carService = carService;
        carList.add(new Car("Mercedes-Benz M-Класс II (W164) 350", "чёрный", 2007, 650_000.00));
        carList.add(new Car("Hyundai ix35 I Рестайлинг", "белый", 2015, 945_000));
        carList.add(new Car("Land Rover Range Rover Evoque I 6-speed", "белый", 2012, 1_490_000));
        carList.add(new Car("Peugeot 408 I Рестайлинг", "чёрный", 2017, 984_000.00));
        carList.add(new Car("Volkswagen Touareg II", "серебристый", 2013, 1_797_000));

        carList.forEach(this.carService::add);
    }
}
