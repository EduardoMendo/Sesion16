import dao.CityDao;
import models.City;

public class Main {
    public static void main(String[] args) {
        CityDao daoCity = new CityDao();
        City city = new City();

        city.setName("Managua");
        daoCity.save(city);
    }
}
