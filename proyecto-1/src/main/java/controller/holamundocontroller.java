package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class holamundocontroller {
    
    @GetMapping("/HolaMundo")
    public String test(){
        return "Hola Mundo";
    }

}
