package gr.upatras.project.e1;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	import io.swagger.annotations.*;
	
	@RestController
	public class Controller {
		@Autowired
		private MyService service = new MyService();
		
		
		private static final Logger log =
	LoggerFactory.getLogger(Controller.class);
	 
	 
	 	@ApiOperation(value = "Retrieves all Categorys", notes = "This operation retrieves all Category entities. ", response =
	 			Message.class)
	 	@ApiResponses(value = {
	 			@ApiResponse(code = 201, message = "Success", response =
	Message.class),
	 			@ApiResponse(code = 400, message = "Bad Request", response =
	Error.class),
	 			@ApiResponse(code = 401, message = "Unauthorized", response =
	Error.class),
	 			@ApiResponse(code = 403, message = "Forbidden", response =
	Error.class),
	 			@ApiResponse(code = 405, message = "Not Found", response =
	Error.class),
	 			@ApiResponse(code = 409, message = "Conflict", response =
	Error.class),
	 			@ApiResponse(code = 500, message = "Internal Server Error", response
	= Error.class)
	 })
	 	@RequestMapping(value = "/message", produces = {"application/json;charset=utf-8" }, consumes = { "application/json" }, method = RequestMethod.POST)
	 public ResponseEntity<Message> printMessage(@ApiParam(value = "The text that is going to be posted", required = true) @RequestBody String myString) {
	 log.info("Will post a new message");
	 Message message = service.printMessage(myString);
	 message.publish();
	 return new ResponseEntity<Message>(message, HttpStatus.OK);
	 	}
	
	}
