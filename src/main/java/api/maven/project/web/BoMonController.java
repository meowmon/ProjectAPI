/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.BoMonDto;
import api.maven.project.repo.BoMon;
import api.maven.project.repo.BoMonRepository;
import api.maven.project.repo.BoMon;
import api.maven.project.repo.BoMon;
import api.maven.project.service.BoMonService;
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
@RequestMapping("/BoMons")
@CrossOrigin(origins="*")
public class BoMonController {
	 @Autowired BoMonService service;
	 @Autowired BoMonRepository repository;
	    
	    @GetMapping
	    public List<BoMon> getBoMon() {
	        return service.getBoMon();
	    }
	    
	    @GetMapping("/{id}")
	    public String getKhoa(@PathVariable(required = true) long id) {
	        return service.getKhoa(id);
	    } 
	    
	    
}
