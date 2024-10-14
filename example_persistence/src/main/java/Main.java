import dao.CityDao;
import dao.StudentDao;
import models.City;
import models.Student;

public class Main {
    public static void main(String[] args) {
        CityDao daoCity = new CityDao();
        StudentDao daoStudent = new StudentDao();
        City city = new City();
        Student student = new Student();

        city.setName("Managua");
        city.setName("Masaya");
        daoCity.save(city);

        student.setFirstName("Eduardo");
        student.setLastName("Mendoza");
        student.setEmail("eduardo@gmail.com");
        student.setCif("22020417");
        daoStudent.save(student);

    }
}
