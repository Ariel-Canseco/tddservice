package edu.ito.tecnm.oaxaca.tddservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jester
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(){
    
        return "<h1>Server Running</h1>";
    }
}
