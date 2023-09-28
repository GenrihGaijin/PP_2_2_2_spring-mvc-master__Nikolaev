package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;

@Controller
public class CarController {
    @Autowired
    private CarsDao  carsDao;

    @GetMapping("/cars")
    public String carsViews (@RequestParam(value = "count", required = false) String count
            , Model model){
    model.addAttribute("cars",carsDao.getCountCars(count));
        return "cars";
    }

}
