package web.dao;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarsDao {
    private static int Cars_count;
    private List<Cars> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Cars(++Cars_count, "Lada", 1000));
        carsList.add(new Cars(++Cars_count, "Niva", 1200));
        carsList.add(new Cars(++Cars_count, "Mercedes", 1300));
        carsList.add(new Cars(++Cars_count, "UAZ", 2000));
        carsList.add(new Cars(++Cars_count, "Gazel", 2500));
    }

    public List<Cars> getCarsList() {
        return carsList;
    }
    public List<Cars> getCountCars(String count){
        int cc ;
        if (count == null){
            cc= carsList.size();
        } else {
            cc = Integer.parseInt(count);
        }
        List <Cars> countCars = new ArrayList<>();
        for(int i = 0; i<cc; i++){
            countCars.add(carsList.get(i));
        }
return countCars;
        }
    }


