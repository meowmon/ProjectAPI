/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.SieuamDto;
import api.maven.project.repo.Sieuam;
import api.maven.project.repo.SieuamRepository;
import api.maven.project.repo.XQuang;
import api.maven.project.service.SieuamService;
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
@RequestMapping("/Sieuams")
@CrossOrigin(origins="*")
public class SieuamController {
	 @Autowired SieuamService service;
	 @Autowired SieuamRepository repository;
	    
	    @PostMapping
	    public void postSieuam(@RequestBody SieuamDto dto) {
	        service.add(dto);
	    }
	    
	    
	    @GetMapping("/{id}")
	    public Sieuam getById(@PathVariable(required = true) long id) {
	        return service.getSieuamById(id);
	    } 
	    
	    @GetMapping("/record/{id}")
	    public Sieuam recored(@PathVariable(required = true) long id) {
	        return repository.record(id);
	    } 
}
