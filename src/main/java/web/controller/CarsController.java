package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarsController {
    @Qualifier("CarServiceImpl2")
    @Autowired
    private CarService carService;

//    public CarsController(CarService carService) {
//        this.carService = carService;
//    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
//        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> qtyCars = carService.carList(count);

        model.addAttribute("cars", qtyCars);
        return "cars";
    }
}