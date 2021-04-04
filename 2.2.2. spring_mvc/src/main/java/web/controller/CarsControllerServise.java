package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsControllerServise {

    @GetMapping( "/cars")
    public String CarsCount(ModelMap model,
                            @RequestParam(value = "count", required = false) Integer count) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car(1, "model1", "green"));
        carList.add(new Car(2, "model2", "black"));
        carList.add(new Car(3, "model3", "yellow"));
        carList.add(new Car(4, "model4", "white"));
        carList.add(new Car(5, "model5", "purple"));

        if (count != null) {
            switch (count) {
                case 1:
                    carList = carList.subList(0, 1);
                    break;
                case 2:
                    carList = carList.subList(0, 2);
                    break;
                case 3:
                    carList = carList.subList(0, 3);
                    break;
                case 4:
                    carList = carList.subList(0, 4);
                    break;
                default:
                    break;
            }
        }
        model.addAttribute("cars", carList);
        return "Cars";
    }
}
