package de.rieckpil.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.rieckpil.controller.model.PersonDto;

@RestController
public class HomeController {

  private Logger log = LoggerFactory.getLogger(getClass());

  @RequestMapping(path = "/persons", method = RequestMethod.GET)
  public ResponseEntity<List<PersonDto>> getAllPersons() {

    List<PersonDto> personList = new ArrayList<PersonDto>();
    personList.add(new PersonDto("Max", "Mustermann", new Date()));
    personList.add(new PersonDto("Andrea", "Paulsen", new Date()));
    personList.add(new PersonDto("Foo", "Bar", new Date()));

    int random = (int) Math.round(Math.random() * 100);

    ResponseEntity<List<PersonDto>> response;

    if (random < 33) {

      log.debug("HttpStatus = OK, response incoming ...");
      response = new ResponseEntity<List<PersonDto>>(personList, HttpStatus.OK);

    } else if (33 < random && random < 66) {

      log.debug("HttpStatus = BAD_REQUEST, response incoming ...");
      response = new ResponseEntity<List<PersonDto>>(personList, HttpStatus.BAD_REQUEST);

    } else {

      log.debug("HttpStatus = NOT_FOUND, response incoming ...");
      response = new ResponseEntity<List<PersonDto>>(personList, HttpStatus.NOT_FOUND);

    }

    return response;

  }

}
