package com.coforge.training.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

//@Mock is used for mock creation. It makes the test class more readable.
//@Spy is used to create a spy instance. We can use it instead spy(Object) method.
//@InjectMocks is used to instantiate the tested object automatically and inject all the @Mock or @Spy annotated field dependencies into it (if applicable).
// @Captor is used to create an argument captor



//Mockito needs to be initialized, to mock and inject objects marked by Annotations.
@RunWith(MockitoJUnitRunner.class)
public class RecordServiceTest {
	
     @InjectMocks
	RecordService recordService;
     
	@Mock
     DatabaseDAO databaseMock;
	
	@Mock
	NetworkDAO networkMock;
	
	
	@Test
	public void SaveTest()
	{
		boolean saved= recordService.save("hello.txt");
		assertEquals(true, saved);
		
		
		//verify that method in the mock object have been involved
		verify(databaseMock,times(1)).save("hello.txt");
		verify(networkMock,times(1)).save("hello.txt");
		
		
	}
}
