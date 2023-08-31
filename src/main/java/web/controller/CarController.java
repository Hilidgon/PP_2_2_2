package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") Byte count, ModelMap model) {
        List<Car> cars = new ArrayList<>(List.of(
                new Car("Alfa Romeo", "Spider", "Silver"),
                new Car("Fiat", "Coupe", "Blue"),
                new Car("Skoda", "Favorit", "Red"),
                new Car("Porsche", "911", "Silver"),
                new Car("Citroen", "Saxo", "Blue")));
        CarService carService = new CarServiceImpl();

        model.addAttribute("cars", carService.printCar(cars, count));
        return "cars";
    }
}
