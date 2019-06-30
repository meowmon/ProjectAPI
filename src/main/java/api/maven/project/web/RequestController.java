/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.RequestDto;
import api.maven.project.repo.Request;
import api.maven.project.repo.RequestRepository;
import api.maven.project.service.RequestService;
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
@RequestMapping("/Requests")
@CrossOrigin(origins="*")
public class RequestController {
	 @Autowired RequestService service;
	 @Autowired RequestRepository repository;
	    @GetMapping
	    public List<Request> getRequest() {
	        return service.getRequest();
	    }
	    @PostMapping
	    public void postRequest(@RequestBody RequestDto dto) {
	        service.add(dto);
	    }
	    @PutMapping("/{id}")
	    public void putRequest(@PathVariable(required = true) long id, @RequestBody RequestDto dto) {
	    	service.setRequestById(id, dto);
	    } 
	    
	    @GetMapping("/{id}")
	    public Request getById(@PathVariable(required = true) long id) {
	        return service.getRequestById(id);
	    } 
	    
	    @GetMapping("/userid/{userId}")
	    public List<Request> getByUserId(@PathVariable(required = true) long userId) {
	        return repository.getRequestByUserId(userId);
	    } 
}
