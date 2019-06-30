/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.UserDto;
import api.maven.project.repo.User;
import api.maven.project.repo.UserRepository;
import api.maven.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*")
public class UserController {
	 @Autowired UserService service;
	 @Autowired UserRepository repository;
	    @GetMapping
	    public List<User> getUser() {
	        return service.getUser();
	    }
	    @PostMapping
	    public void postUser(@RequestBody UserDto dto) {
	        service.add(dto);
	    }
	    @PutMapping("/{id}")
	    public void putUser(@PathVariable(required = true) long id, @RequestBody UserDto dto) {
	    	service.setUserById(id, dto);
	    } 
	    
	    @GetMapping("/{id}")
	    public User getById(@PathVariable(required = true) long id) {
	        return service.getUserById(id);
	    } 
}
