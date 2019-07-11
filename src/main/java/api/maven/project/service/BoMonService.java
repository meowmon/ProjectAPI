/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.BoMonDto;
import api.maven.project.repo.BoMon;
import api.maven.project.repo.BoMonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BoMonService {
	@Autowired BoMonRepository repository;
	
	
    public List<BoMon> getBoMon() {
        return (List<BoMon>) repository.findAll();
    }
    public String getKhoa(long id) {
        return repository.getKhoa(id);
    }
    
}
