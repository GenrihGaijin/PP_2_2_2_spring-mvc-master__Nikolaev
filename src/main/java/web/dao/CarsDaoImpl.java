package web.dao;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDaoImpl implements CarsDao {
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

    @Override
    public List<Cars> getCarsList() {
        return carsList;
    }

    @Override
    public List<Cars> getCountCars(String count) {
        int cc;
        if (count == null || Integer.parseInt(count) > 5) {
            cc = carsList.size();
        } else {
            cc = Integer.parseInt(count);
        }
        List<Cars> countCars = new ArrayList<>();
        for (int i = 0; i < cc; i++) {
            countCars.add(carsList.get(i));
        }
        return countCars;
    }
}


