/**
 * 
 */
package com.service.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.user.entity.Useraccount;

/**
 * @author danielf
 *
 */
public interface UserRepository extends JpaRepository<Useraccount, String> {

}
