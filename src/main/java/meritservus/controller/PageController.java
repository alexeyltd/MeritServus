package meritservus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class PageController {


	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String getMainPage(Model model) {



		return "main";

	}

}
