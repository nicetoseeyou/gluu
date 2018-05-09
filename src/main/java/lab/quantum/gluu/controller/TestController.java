package lab.quantum.gluu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lab.quantum.gluu.model.User;
import lab.quantum.gluu.service.UserRepository;

@RestController
@RequestMapping(value="/test")
public class TestController {
	/*@Autowired
    private UserRepository userRepository;
	
	@GetMapping(value="/users")
	@ResponseBody
	public List<User> getUser() {
		return (List<User>) userRepository.findAll();
	}*/
}
