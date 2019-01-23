package edu.neu.cs4500.models;

/**
 * Represents a user profile.
 * 
 * Created on Jan 22, 2019.
 * @author bachm
 *
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	/**
	 * Constructs a User object, representing a user's profile.
	 * @param id the id of the user
	 * @param username the user name of the user
	 * @param password the password of the user
	 * @param firstName the first name of the user
	 * @param lastName the last name of the user
	 */
	public User(Integer id, String username, String password, String firstName, String lastName) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}


