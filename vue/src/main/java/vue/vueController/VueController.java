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
<<<<<<< HEAD
		//2444444444444444
=======
		//2444444444444444
>>>>>>> branch 'master' of https://github.com/18758084564/vue_test
		return "index";
	}
}
