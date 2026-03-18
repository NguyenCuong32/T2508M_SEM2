package org.fptaptch.t2508m.demo01.repository;

import org.fptaptch.t2508m.demo01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {

}
