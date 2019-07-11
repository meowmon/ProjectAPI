/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.XNghiemDto;
import api.maven.project.repo.XNghiem;
import api.maven.project.repo.XNghiemRepository;
import api.maven.project.service.XNghiemService;
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
@RequestMapping("/XNghiems")
@CrossOrigin(origins="*")
public class XNghiemController {
	 @Autowired XNghiemService service;
	 @Autowired XNghiemRepository repository;
	    
	    @PostMapping
	    public void postXNghiem(@RequestBody XNghiemDto dto) {
	        service.add(dto);
	    }
	    
	    
	    @GetMapping("/{id}")
	    public XNghiem getById(@PathVariable(required = true) long id) {
	        return service.getXNghiemById(id);
	    } 
	    
	    
}
