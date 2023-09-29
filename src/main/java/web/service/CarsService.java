package web.service;


import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Cars;

import java.util.List;

@Service
public interface CarsService {
    List<Cars> getCars(String count);

}
