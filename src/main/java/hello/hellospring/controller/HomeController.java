package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // controller 가 정적 컨텐츠보다 우선도가 높음, 따라서 static/index.html 가 아니라 template/home.html 가 호출됨
    public String home() {
        return "home";
    }
}
