/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.UserDto;
import api.maven.project.repo.User;
import api.maven.project.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
	@Autowired UserRepository repository;
	
	public void add(UserDto dto) {
		Optional<User> optionalUser = repository.findById(dto.getId());
		if(optionalUser.isPresent())
			throw (new UserCodeDuplicateException("User code dupplicate"));
		else
			repository.save(toEntity(dto));
    }
    public List<User> getUser() {
        return (List<User>) repository.findAll();
    }
    public User getUserById(long id) {
        Optional<User> optionalUser = repository.findById(id);
        return optionalUser.orElseThrow(() -> new UserNotFoundException("Couldn't find a User with id: " + id));
    }
    private User toEntity(UserDto dto) {
        User entity = new User();
        entity.setName(dto.getName());
        entity.setGender(dto.getGender());
        entity.setCode(dto.getCode());
        entity.setId_bomon(dto.getId_bomon());
//        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setBo_mon(dto.getBo_mon());
        entity.setBirthday(dto.getBirthday());
        entity.setRole(dto.getRole());
        entity.setPassword("123456");
        return entity;
    }
    public void setUserById(long id, UserDto dto) {
    	Optional<User> ou = repository.findById(id);
    	if(ou.isPresent()) {
    		User nc = ou.get();
    		nc.setName(dto.getName());
//    		nc.setId(dto.getId());
    		nc.setGender(dto.getGender());
//    		nc.setCode(dto.getCode());
//    		nc.setId_bomon(dto.getId_bomon());
    		nc.setEmail(dto.getEmail());
    		nc.setPhone(dto.getPhone());
    		repository.save(nc);
    	}
    }
}
