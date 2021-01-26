/**
 * 
 */
package com.service.resource.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.service.resource.transfer.Userdata;

/**
 * @author danielf
 *
 */
@FeignClient(name = "user-service")
public interface UserServiceFeign {

	@PostMapping("/save")
	public Userdata saveOrUpdate(@RequestBody Userdata user);

	@GetMapping("/get/{username}")
	public Userdata getById(@PathVariable String username);

	@GetMapping("/all")
	public List<Userdata> getAll();

}
