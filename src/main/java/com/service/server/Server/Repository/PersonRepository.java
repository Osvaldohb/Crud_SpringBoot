package com.service.server.Server.Repository;

import com.service.server.Server.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {
}
