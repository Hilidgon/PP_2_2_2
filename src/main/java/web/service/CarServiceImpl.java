package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> printCar(List<Car> cars, Byte count) {
        return (count >= 5 ? cars : cars.subList(0,count));
    }
}
