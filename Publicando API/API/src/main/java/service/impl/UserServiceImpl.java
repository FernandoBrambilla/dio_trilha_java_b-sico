package service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.fernando.API.domain.model.User;
import com.fernando.API.domain.repository.UserRepository;

import service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRespository;
	
	public UserServiceImpl (UserRepository repository) {
		this.userRespository = repository;
	}
	
	@Override
	public User findById(Long id) {
		return userRespository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {
		if(userRespository.existsByAccountNumber(user.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account Number already exist!");
		}
		return userRespository.save(user);
	}

}
