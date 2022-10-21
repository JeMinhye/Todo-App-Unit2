package codestates.TodoAppUnit2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class TodoAppController {

    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }
}
