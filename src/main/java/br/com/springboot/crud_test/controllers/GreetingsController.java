package br.com.springboot.crud_test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.crud_test.model.UserClass;
import br.com.springboot.crud_test.repository.UserRepository;

@RestController
public class GreetingsController {

    @Autowired
    private UserRepository userRepository;
  

    @GetMapping(value="listall")
    @ResponseBody
    public ResponseEntity <List<UserClass>> listUsers() {

        List<UserClass> users = userRepository.findAll();
        return new ResponseEntity<List<UserClass>>(users, HttpStatus.OK);
    }
}
