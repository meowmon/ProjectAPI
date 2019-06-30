/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.RequestDto;
import api.maven.project.repo.Request;
import api.maven.project.repo.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RequestService {
	@Autowired RequestRepository repository;
	
	public void add(RequestDto dto) {
			repository.save(toEntity(dto));
    }
    public List<Request> getRequest() {
        return (List<Request>) repository.findAll();
    }
    public Request getRequestById(long id) {
        Optional<Request> optionalRequest = repository.findById(id);
        return optionalRequest.orElseThrow(() -> new RequestNotFoundException("Couldn't find a Request with id: " + id));
    }
    private Request toEntity(RequestDto dto) {
        Request entity = new Request();
        entity.setDate(dto.getDate());
        entity.setDescrip(dto.getDescrip());
        entity.setFee(dto.getFee());
        entity.setIdHoso(dto.getIdHoso());
        entity.setIdUser(dto.getIdUser());
        entity.setSieuam(dto.isSieuam());
        entity.setTime(dto.getTime());
        entity.setXnghiem(dto.isXnghiem());
        entity.setStatus(dto.getStatus());
        entity.setXquang(dto.isXquang());
        return entity;
    }
    public void setRequestById(long id, RequestDto dto) {
    	Optional<Request> ou = repository.findById(id);
    	if(ou.isPresent()) {
    		Request nc = ou.get();
    		nc.setId(dto.getId());
    		nc.setDate(dto.getDate());
            nc.setDescrip(dto.getDescrip());
            nc.setFee(dto.getFee());
            nc.setIdHoso(dto.getIdHoso());
            nc.setIdUser(dto.getIdUser());
            nc.setSieuam(dto.isSieuam());
            nc.setTime(dto.getTime());
            nc.setStatus(dto.getStatus());
            nc.setXnghiem(dto.isXnghiem());
            nc.setXquang(dto.isXquang());
    		repository.save(nc);
    	}
    }
}
