package by.marketplace.logic;

import org.springframework.validation.annotation.Validated;

import by.marketplace.repository.vo.UserVO;

@Validated
public interface UserService extends Service<User, UserVO> {	
	
}
