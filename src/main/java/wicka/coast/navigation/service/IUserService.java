package wicka.coast.navigation.service;

<<<<<<< HEAD
public interface IUserService {
=======
import java.util.List;

import wicka.coast.navigation.dto.User;



public interface IUserService {
	  // CRUD METHODS

    // GETS

	public User loginUser(User user);

	public List<User> showAllUsers();

	public User showUserById(Long id);

    // POSTS

	public User saveNewUser(User user);

	public User saveNewAdmin(User user);

    // PUTS

	public User modifyUserPass(Long id, User user);

	public User modifyTypeUser(Long id, User user);

    // DELETE

	public void deleteUser(Long id);
	
>>>>>>> B-01

}
