package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Cars;

import java.util.List;
import web.dao.CarsDao;

@Service
public class CarsServiceImpl implements CarsService {

    @Autowired
    private CarsDao carsDao;

    @Override
    public List<Cars> getCars(String count) {
        return carsDao.getCountCars(count);
    }
}
