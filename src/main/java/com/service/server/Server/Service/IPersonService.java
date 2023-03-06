package com.service.server.Server.Service;

import com.service.server.Server.Entity.Person;

import java.util.List;

public interface IPersonService {

    public List<Person> findAll();

    public Person findById(Long id);

    public void save(Person person);
}
