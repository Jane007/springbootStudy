package com.mrszhang.learn.jingjing.dao.primary;

import com.mrszhang.learn.jingjing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
