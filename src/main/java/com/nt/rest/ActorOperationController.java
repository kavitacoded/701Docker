package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorOperationController {

	@GetMapping("/wish/{name}")
	public ResponseEntity<String> showActor(@PathVariable String name){
		return new ResponseEntity<String>("<h1>hello actor</h1>",HttpStatus.OK);
	}
	
	
}
