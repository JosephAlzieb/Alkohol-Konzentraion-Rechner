package de.hhu.alkohoomat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebConroller {

    @GetMapping("/alko")
    String getStartSeite(Model model){
        Form form = new Form(65,0,0,0,0);
        model.addAttribute("form", form);
        return "index";
    }

    @PostMapping("/alko")
    String berechnekoholkonz (Model model, @ModelAttribute("form") Form form){
        String reult = form.getBlutalkohol();
        model.addAttribute("result", reult);
        return"index";
    }
}
