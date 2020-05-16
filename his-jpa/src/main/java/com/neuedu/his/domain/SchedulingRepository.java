package com.neuedu.his.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neuedu.his.pojo.Scheduling;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, String>{

}
