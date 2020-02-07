package vue.vueController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class VueController {
	
	@RequestMapping("/index")
	public String getindex() {
		System.out.println("+++++++++++++++++++");
		log.info("+++++++++++++++++");
		//2222222222222222
		return "index";
	}
}
