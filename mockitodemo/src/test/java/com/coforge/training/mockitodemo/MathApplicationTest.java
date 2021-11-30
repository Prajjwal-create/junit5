package com.coforge.training.mockitodemo;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import junit.framework.Assert;



class MathApplicationTest {




     @InjectMocks // its use to create and Inject
    MathApplication mathApplication;

      @Mock // -- create a mock object
      CalculatorService calcService;

      @BeforeEach
     void setUp() throws Exception {

     mathApplication=new MathApplication(calcService);
     MockitoAnnotations.initMocks(this);

     
}



         @Test
         void testAdd() {

//add the behavior of calc service to add two numbers
       when(calcService.add(10.0, 20.0)).thenReturn(30.0);

//test the add functionality
        assertEquals(calcService.add(10.0, 20.0),30.0,0);

//verify the behavior
        verify(calcService).add(10.0, 20.0);

  }



@Test
void testSubtract() {
	//sub the behavior of calc service to add two numbers
    when(calcService.subtract(90.0, 20.0)).thenReturn(70.0);

//test the add functionality
     assertEquals(calcService.subtract(90.0, 20.0),70.0,0);

//verify the behavior
     verify(calcService).subtract(90.0, 20.0);
   }



@Test
void testMultiply() {
	//add the behavior of calc service to add two numbers
    when(calcService.multiply(10.0, 20.0)).thenReturn(200.0);

//test the add functionality
     assertEquals(calcService.multiply(10.0, 20.0),200.0,0);

//verify the behavior
     verify(calcService).multiply(10.0, 20.0);
}





@Test
void testDivide() {
	//add the behavior of calc service to add two numbers
    when(calcService.divide(20.0, 10.0)).thenReturn(2.0);

//test the add functionality
     assertEquals(calcService.divide(20.0, 10.0),2.0,0);

//verify the behavior
     verify(calcService).divide(20.0, 10.0);
}



}