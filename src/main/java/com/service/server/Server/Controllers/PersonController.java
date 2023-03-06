package com.service.server.Server.Controllers;

import com.service.server.Server.Entity.Person;
import com.service.server.Server.Service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RestController
public class PersonController {
    @Autowired
    private IPersonService personService;

    @GetMapping(path = "/listar")
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Person>listar(){
        return  personService.findAll();
    }

    @PostMapping("/add")
    public void save(@RequestParam Person person ){
        personService.save(person);
    }

}
