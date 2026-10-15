package gtalent.dev.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String HomePage() {
        return "home";
    }

    @GetMapping("/yuhan")
    public String yuhanPage() {
        return "yuhan";
    }

  
    @GetMapping("/CYL")
    public String CylPage() {
        return "CYL";
    }
  
    @GetMapping("/eager")
    public String EagerPage() {
        return "eager";
    }

    @GetMapping("/edward1")
    public String Ed1Page() {
        return "edward1";
    }
  
    @GetMapping("/peter")
    public String PeterPage() {
        return "peter";
    }
    
    @GetMapping("/charlie")
    public String ChPage() {
        return "charlie";
    }
    
    @GetMapping("/Jia")
    public String JiaPage() {
        return "jia";
    }
    
    @GetMapping("/WWJ")
    public String WWJPage() {
        return "WWJ";
    }

}
