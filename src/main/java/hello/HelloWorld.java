package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
		@RequestMapping("/")
		public String message(){
			return "KAKA NAMSTHERY NU KERAKU";
		}
}
