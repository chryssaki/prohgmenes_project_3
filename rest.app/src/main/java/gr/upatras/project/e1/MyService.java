package gr.upatras.project.e1;

import org.springframework.stereotype.Service; 

@Service
public class MyService { 

	
public Message printMessage(String myString) { 
		Message message = new Message(myString); 
		return message; }
}
