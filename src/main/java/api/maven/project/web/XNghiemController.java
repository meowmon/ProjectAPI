/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.XNghiemDto;
import api.maven.project.repo.XNghiem;
import api.maven.project.repo.XNghiemRepository;
import api.maven.project.repo.XQuang;
import api.maven.project.service.XNghiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	    
	    @PutMapping("/hasRecord/{id}")
	    public void hasRecored(@PathVariable(required = true) long id) {
	        repository.updateTitle(id);
	    } 
	    
	    @GetMapping("/record/{id}")
	    public XNghiem recored(@PathVariable(required = true) long id) {
	        return repository.record(id);
	    } 
	    
}
