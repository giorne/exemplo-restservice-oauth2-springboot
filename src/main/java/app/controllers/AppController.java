package app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {

	return new ResponseEntity<String>("Ol�. Voc� est� acessando um servi�o p�blico.", HttpStatus.OK);

	}

}
