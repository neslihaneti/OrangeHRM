package com.orangehrm.stepdefinitions;
import com.orangehrm.base.BasePAge;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
 @Before
    public void setup(){
     BasePAge.initializeDriver();
 }

 @After
 public void teardown(){
     BasePAge.tearDown();
 }



}
