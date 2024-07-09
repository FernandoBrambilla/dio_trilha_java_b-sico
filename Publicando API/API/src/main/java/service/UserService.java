package service;

import com.fernando.API.domain.model.User;

public interface UserService {
	
	User findById (Long id);
	User create (User user);

}
