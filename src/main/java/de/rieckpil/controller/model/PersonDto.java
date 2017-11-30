package de.rieckpil.controller.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PersonDto{
  
  private String lastname;
  private String firstname;
  private Date dayOfBirth;

}
