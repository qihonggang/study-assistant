package com.example.repository;

import com.example.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yonyou on 4/06/2017.
 */

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {

}
