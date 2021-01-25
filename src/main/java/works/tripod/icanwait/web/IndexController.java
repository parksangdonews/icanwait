package works.tripod.icanwait.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/regist")
    public String regist() {
        return "regist";
    }

    @GetMapping(path = "/api")
    public String api() {
        return "api";
    }

    @GetMapping(path = "/contact")
    public String contact() {
        return "contact";
    }
}
