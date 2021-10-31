package com.api.demo.restapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api")
public class HelloWorldController {

    @GetMapping(path = "/sayHello")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping(path = "/sayHelloWithParam")
    public String helloWithParams(@RequestParam String name){
        return "Hello "+name+"!!";
    }

    @GetMapping(path = "/sayHelloWithPath/{name}")
    public String helloWithPathVariable(@PathVariable String name){
        return "Hello With Path variable "+name;
    }

    @PostMapping(path = "/createName")
    public String postName(@RequestBody String name) {
        System.out.println("Name received : " + name);
        return name + "1";
    }

    @PutMapping(path = "/putName")
    public String putName(@RequestBody String name) {
        System.out.println("Name received and updated : " + name);
        return name + "1";
    }

    @DeleteMapping(path = "/deleteName")
    public String deleteName(@RequestBody String name) {
        System.out.println("Name received and Deleted : " + name);
        return name + "1";
    }


}
