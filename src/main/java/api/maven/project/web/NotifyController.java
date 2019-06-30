/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.NotifyDto;
import api.maven.project.repo.Notify;
import api.maven.project.repo.NotifyRepository;
import api.maven.project.service.NotifyService;
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
@RequestMapping("/Notifys")
@CrossOrigin(origins="*")
public class NotifyController {
	 @Autowired NotifyService service;
	 @Autowired NotifyRepository repository;
	    @PostMapping
	    public void postNotify(@RequestBody NotifyDto dto) {
	        service.add(dto);
	    }
	    @PutMapping("/{id}")
	    public void putReadNotify(@PathVariable(required = true) long id) {
	    	service.setReadNotify(id);
	    } 
	    
	    @GetMapping("/user/{id}")
	    public Notify getNotifyByUserId(@PathVariable(required = true) long id) {
	        return service.getNotifyByUserId(id);
	    }
	    
	    @GetMapping("/unread/{id}")
	    public Notify getUnreadNotifyByUserId(@PathVariable(required = true) long id) {
	        return service.getUnreadByUserId(id);
	    }
	    
}
