package gtalent.dev.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/")
    public String HomePage() {
        return "home";
    }

    @GetMapping("/edward")
    public String EdPage() {
        return "edward";
    }
    @GetMapping("/Peter")
    public String PeterPage() {
        return "Peter";
    }
}
