package com.service.server.Server.Service;

import com.service.server.Server.Entity.Person;
import com.service.server.Server.Repository.PersonRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService{
    @Autowired
    private PersonRepository personRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Person findById(Long id) {
        return null;
    }

    @Override
    public void save(Person person) {

        personRepository.save(person);
    }

}
