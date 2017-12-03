package com.rieckpil.service;

import org.springframework.stereotype.Service;

@Service
public class SomeDao {
  
  public void doBar() {
    System.out.println("DAO reaching database...");
  }
}
