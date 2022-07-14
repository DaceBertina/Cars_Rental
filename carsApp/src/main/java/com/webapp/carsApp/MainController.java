package com.webapp.carsApp;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CarsRepository carsRepo;

    @GetMapping("/allCars")
    public String getCars(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> allCars = carsRepo.findAll();
        model.addAttribute("allCars",allCars);
        return "allCars";
    }

}
