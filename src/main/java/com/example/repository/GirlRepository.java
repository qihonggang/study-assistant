package com.example.repository;

import com.example.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Yonyou on 2/06/2017.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
