package de.rieckpil.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.rieckpil.controller.model.PersonDto;

@RestController
public class HomeController {
  
  @RequestMapping(path="/persons", method=RequestMethod.GET)
  public ResponseEntity<List<PersonDto>> getAllPersons(){
    
    List<PersonDto> personList = new ArrayList<PersonDto>();
    personList.add(new PersonDto("Max", "Mustermann", new Date()));
    personList.add(new PersonDto("Andrea", "Paulsen", new Date()));
    personList.add(new PersonDto("Foo", "Bar", new Date()));
    
    ResponseEntity<List<PersonDto>> response = new ResponseEntity<List<PersonDto>>(personList, HttpStatus.OK);
    return response;
    
  }

}