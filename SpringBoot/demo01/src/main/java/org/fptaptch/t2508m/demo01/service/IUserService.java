package org.fptaptch.t2508m.demo01.service;

import org.fptaptch.t2508m.demo01.entity.User;

public interface IUserService {
    public User login(String username, String password);
}
