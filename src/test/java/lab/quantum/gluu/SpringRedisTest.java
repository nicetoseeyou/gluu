package lab.quantum.gluu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lab.quantum.gluu.model.User;
import lab.quantum.gluu.service.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:application-config.xml", "classpath*:spring-mvc.xml" })
@WebAppConfiguration
public class SpringRedisTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testRepositorySave() {
		// User u = new User(0L, "First", "first@gluu.com");
		// userRepository.save(u);
		List<User> users = new ArrayList<User>();
		users.add(new User(0L, "First", "first@gluu.com"));
		users.add(new User(1L, "Second", "second@gluu.com"));
		users.add(new User(2L, "Third", "third@gluu.com"));
		userRepository.saveAll(users);
	}

	@Test
	public void testRepositoryGet() {
		// User u = userRepository.findOne(0L);
		// System.out.println(u);
		Iterator<User> iterator = userRepository.findAll().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
