package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
		//@RequestMapping("/")
		@RequestMapping(value = "/", method=RequestMethod.GET)
		public String message(){
			return "KAKA NAMSTHERY NU KERAKU new message";
		}
}
