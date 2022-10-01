package lehzo.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping // method di bawah akan dieksekusi jika ada request GET pada url
    public String welcome(){
        return "Welcome to Spring boot";
    }

    // @PostMapping // Method di bawah akan dieksekusi jika ada request POST pada url
    // public String other(){
    //     return "Data lain"; 
    // }


}
