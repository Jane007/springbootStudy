package com.mrszhang.learn.jingjing.service;

import com.mrszhang.learn.jingjing.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> findAll();
    Page<User> getPageUserList(Integer page , Integer pageSize);
}
