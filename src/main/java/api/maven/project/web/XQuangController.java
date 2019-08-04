/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.XQuangDto;
import api.maven.project.repo.XQuang;
import api.maven.project.repo.XQuangRepository;
import api.maven.project.service.XQuangService;
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
@RequestMapping("/XQuangs")
@CrossOrigin(origins="*")
public class XQuangController {
	 @Autowired XQuangService service;
	 @Autowired XQuangRepository repository;
	    
	    @PostMapping
	    public void postXQuang(@RequestBody XQuangDto dto) {
	        service.add(dto);
	    }
	    
	    
	    @GetMapping("/{id}")
	    public XQuang getById(@PathVariable(required = true) long id) {
	        return service.getXQuangById(id);
	    } 
	     
	    @PutMapping("/hasRecord/{id}")
	    public void hasRecored(@PathVariable(required = true) long id) {
	        repository.updateTitle(id);
	    } 
	    
	    @GetMapping("/record/{id}")
	    public XQuang recored(@PathVariable(required = true) long id) {
	        return repository.record(id);
	    } 
	    
}
