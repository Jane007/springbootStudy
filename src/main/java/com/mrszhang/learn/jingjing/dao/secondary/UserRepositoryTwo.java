package com.mrszhang.learn.jingjing.dao.secondary;

import com.mrszhang.learn.jingjing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryTwo extends JpaRepository<User,Long> {
}
