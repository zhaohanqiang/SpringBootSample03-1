package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);

	//利用@Query注解可以自定义一个方法
	//这个地方User是指那个实体类User，不是表名!
	//?1是指第一个参数


	@Query("SELECT p FROM User p WHERE name LIKE ?1")
	 List<User> withUsernameQuery(String name);
;
	@Query("SELECT p FROM User p WHERE phone =?1")
	List<User> withUserphoneQuery(String phone);
	@Query("SELECT p FROM User p WHERE password =?1")
	List<User> withUserpasswordQuery(String password);




}

