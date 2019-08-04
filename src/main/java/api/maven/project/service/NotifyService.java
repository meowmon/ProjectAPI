/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.NotifyDto;
import api.maven.project.repo.Notify;
import api.maven.project.repo.NotifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class NotifyService {
	@Autowired NotifyRepository repository;
	
	public void add(NotifyDto dto) {
			repository.save(toEntity(dto));
    }
    public List<Notify> getNotifyByUserId(long id) {
        List<Notify> optionalNotify = repository.findByUserId(id);
        return optionalNotify;
    }
    private Notify toEntity(NotifyDto dto) {
        Notify entity = new Notify();
        entity.setContent(dto.getContent());
        entity.setIdUser(dto.getIdUser());
        entity.setStatus("unread");
        entity.setTarget(dto.getTarget());
        return entity;
    }
    public void setReadNotify(long id) {
    	Optional<Notify> ou = repository.findById(id);
    	if(ou.isPresent()) {
    		Notify nc = ou.get();
    		nc.setId(id);
    		nc.setStatus("read");
    		repository.save(nc);
    	}
    }
}
