package com.app.Composite.Repository;

import com.app.Composite.entity.HouseInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseInfoRepo extends JpaRepository<HouseInfo,Integer>{
    
}
