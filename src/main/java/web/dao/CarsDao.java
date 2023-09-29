package web.dao;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public interface CarsDao {

    List<Cars> getCarsList();

   List<Cars> getCountCars(String count);
}
