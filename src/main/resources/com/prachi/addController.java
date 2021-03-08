package com.prachi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/add")
public class addController {
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public void add() {
		System.out.println("I'm here");
	}
}
