package br.com.springboot.crud_test.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Name is Brandon Flores? " + name + "!";
    }
    
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/helloworld/{name2}", method = RequestMethod.GET)
    public String returnsHelloWorld(@PathVariable String name2) {
    	
    	return "Hello world " + name2;
    	
    }
}
