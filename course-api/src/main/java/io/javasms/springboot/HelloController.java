/**
 * 
 */
package io.javasms.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ThinkPad T540p
 *
 */
@RestController
public class HelloController {
   
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	
}
