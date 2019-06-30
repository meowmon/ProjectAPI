/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.web;

import api.maven.project.model.HoSoDto;
import api.maven.project.repo.HoSo;
import api.maven.project.repo.HoSoRepository;
import api.maven.project.service.HoSoService;
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
@RequestMapping("/HoSos")
@CrossOrigin(origins="*")
public class HoSoController {
	 @Autowired HoSoService service;
	 @Autowired HoSoRepository repository;
	    @GetMapping
	    public List<HoSo> getHoSo() {
	        return service.getHoSo();
	    }
	    @PostMapping
	    public void postHoSo(@RequestBody HoSoDto dto) {
	        service.add(dto);
	    }
	    @PutMapping("/{id}")
	    public void putHoSo(@PathVariable(required = true) long id, @RequestBody HoSoDto dto) {
	    	service.setHoSoById(id, dto);
	    } 
	    
	    @GetMapping("/{id}")
	    public HoSo getById(@PathVariable(required = true) long id) {
	        return service.getHoSoById(id);
	    } 
	    
	    @GetMapping("/userid/{userId}")
	    public List<HoSo> getByUserId(@PathVariable(required = true) long userId) {
	        return repository.getHoSoByUserId(userId);
	    } 
}
