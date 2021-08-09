package com.app.Assessment.Repository;

import org.springframework.stereotype.Repository;

import com.app.Assessment.Entity.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepo extends JpaRepository<UserInfo,Integer>{

}
