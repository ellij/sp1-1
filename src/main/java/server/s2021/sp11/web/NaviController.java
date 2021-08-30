package server.s2021.sp11.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NaviController {
	@RequestMapping("index")
	@ResponseBody
	public String main() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		return "This is the contact page";
	}

}
