package wicka.coast.navigation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import wicka.coast.navigation.dto.User;

public interface IUserDAO extends JpaRepository<User, Long> {

}
