package hello.controllers;

import hello.models.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@Autowired
	private TodoRepository todoRepository;
	
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return String.format("Hello World, %s Todo(s) saved",todoRepository.count());
    }

}
