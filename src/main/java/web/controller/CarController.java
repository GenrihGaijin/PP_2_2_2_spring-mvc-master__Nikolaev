package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;
import web.service.CarsService;

@Controller
public class CarController {
    @Autowired
    private CarsService carsService;

    @GetMapping("/cars")
    public String carsViews (@RequestParam(value = "count", required = false) String count
            , Model model){
    model.addAttribute("cars",carsService.getCars(count));
        return "cars";
    }

}
