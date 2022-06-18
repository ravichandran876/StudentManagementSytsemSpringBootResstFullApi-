package com.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Entity.Userlog;

public interface UserloginReposirory extends JpaRepository<Userlog,Long> {

}
