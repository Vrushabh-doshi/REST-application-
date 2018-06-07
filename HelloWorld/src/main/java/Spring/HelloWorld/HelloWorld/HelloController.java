package Spring.HelloWorld.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @RequestMapping("/")
    public String Index()
    {
        return "Hello World. I am Vrushabh";
    }
}
