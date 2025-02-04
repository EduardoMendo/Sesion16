package dao;

import interfaces.ICity;
import jakarta.persistence.EntityManager;
import models.City;

import java.util.List;

public class CityDao implements ICity {


    @Override
    public void save(City city) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(city);
        em.getTransaction().commit();
    }

    @Override
    public City getCity(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(City.class, id);
    }

    @Override
    public void update(City city) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(city);
        em.getTransaction().commit();
    }

    @Override
    public void delete(City city) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(city);
        em.getTransaction().commit();
    }

    @Override
    public List<City> getAllCity() {
        return List.of();
    }
}
