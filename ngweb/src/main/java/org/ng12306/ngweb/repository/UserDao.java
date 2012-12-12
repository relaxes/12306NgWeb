package org.ng12306.ngweb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.ng12306.ngweb.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
