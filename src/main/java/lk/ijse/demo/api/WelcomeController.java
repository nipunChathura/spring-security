package lk.ijse.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 5/5/2021
 **/

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome(){
        return "welcome N99CH.lk";
    }

}
