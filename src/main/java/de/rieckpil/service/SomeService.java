package de.rieckpil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

  @Autowired
  private SomeDao dao;
  
  public int doFoo(int x) {
    
    dao.doBar();
    
    if(x > 10) {
      throw new RuntimeException();
    }else {
      return x + 1;
    }
  }
}