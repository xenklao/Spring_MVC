package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    @Autowired
    SessionFactory sessionFactory;


//    static {
//        carList.add(new Car("Mercedes-Benz M-Класс II (W164) 350", "чёрный", 2007, 650_000.00));
//        carList.add(new Car("Hyundai ix35 I Рестайлинг", "белый", 2015, 945_000));
//        carList.add(new Car("Land Rover Range Rover Evoque I 6-speed", "белый", 2012, 1_490_000));
//        carList.add(new Car("Peugeot 408 I Рестайлинг", "чёрный", 2017, 984_000.00));
//        carList.add(new Car("Volkswagen Touareg II", "серебристый", 2013, 1_797_000));
//    }
    @Transactional
    @Override
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);

    }




    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
