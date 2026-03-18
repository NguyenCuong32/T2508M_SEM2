package org.fptaptch.t2508m.demo01.service;

import org.fptaptch.t2508m.demo01.entity.User;
import org.fptaptch.t2508m.demo01.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements org.fptaptch.t2508m.demo01.service.IUserService {

    private IUserRepository userRepository;
    public UserService() {

    }
    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User login(String username, String password) {
        return this.userRepository.findAll().getFirst();
    }
}
