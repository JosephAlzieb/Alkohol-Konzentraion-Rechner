package de.hhu.alkohoomat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebConroller {

    @GetMapping("/alko")
    String getStartSeite(){
        return "index";
    }
}
