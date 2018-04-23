package com.mrszhang.learn.jingjing.service;

import com.mrszhang.learn.jingjing.dao.primary.UserRepository;
import com.mrszhang.learn.jingjing.dao.secondary.UserRepositoryTwo;
import com.mrszhang.learn.jingjing.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRepositoryTwo UserRepositoryTwo;
    @Override
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        if(users==null){
            users = UserRepositoryTwo.findAll();
        }
        return users;
    }

    @Override
    public Page<User> getPageUserList(Integer page , Integer pageSize) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");

        Pageable pageable = new PageRequest(page, pageSize,sort);

        return userRepository.findAll(pageable);
    }
}
