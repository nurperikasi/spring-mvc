package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.sevice.CarService;


@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping( "/cars")
    public String CarsCount(ModelMap model,
                            @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", carService.getCarCount(count));
        return "Cars";
    }
}
