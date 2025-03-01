package com.example.FirstProject;


import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWebController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello from BridgeLabz";
    }


//    This method handles HTTP GET requests for the "/query" endpoint.
//    It expects a request parameter named "name" and returns a greeting message.
//    http://localhost:8080/hello/query?name=Abhishek
    @RequestMapping(value = {"hello/query"}, method = RequestMethod.GET)
    public String Hello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz ";
    }



//    This method handles HTTP GET requests for the "/hello/param/{name}" endpoint.
//    It takes a dynamic value from the URL path using @PathVariable and returns a greeting message.
//    http://localhost:8080/hello/param/Abhishek
    @GetMapping("/hello/param/{name}")
    public String HelloParam(@PathVariable String name){
        return "Hello " +name + " from BridgeLabz";
    }
}
