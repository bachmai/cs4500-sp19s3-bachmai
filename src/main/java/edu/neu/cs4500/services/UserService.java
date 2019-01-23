package edu.neu.cs4500.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.neu.cs4500.models.User;

/**
 * A REST Controller which: 1) retrieves the list of all users. 2) retrieving a
 * particular user by id.
 * 
 * Created on Jan 22, 2019
 * 
 * @author bachm
 *
 */
@RestController
public class UserService {
	static List<User> users = new ArrayList<User>();
	static User alice = new User(123, "alice", "password", "Alice", "Wonderland");
	static User bach = new User(100, "bach", "1to8", "Bach", "Mai");
	static {
		users.add(alice);
		users.add(bach);
	}

	/**
	 * Retrieves the list of all users
	 * 
	 * @return list of all users
	 */
	@GetMapping("/api/users")
	public List<User> getAllUsers() {
		return users;
	}

	/**
	 * Retrieves a particular user by id.
	 * 
	 * @param id the id of the user to be retrieved
	 * @return the user with the given id
	 */
	@GetMapping("/api/user/{userId}")
	public User findUserById(@PathVariable("userId") Integer id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
