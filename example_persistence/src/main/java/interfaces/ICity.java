package interfaces;

import models.City;
import java.util.List;

public interface ICity {

    public void save(City city);
    public void update(City city);
    public void delete(City city);
    public List<City> getAllCity();

}
