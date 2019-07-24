/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.SieuamDto;
import api.maven.project.repo.Sieuam;
import api.maven.project.repo.SieuamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SieuamService {
	@Autowired SieuamRepository repository;
	
	public void add(SieuamDto dto) {
			repository.save(toEntity(dto));
    }
    public Sieuam getSieuamById(long id) {
        Optional<Sieuam> optionalSieuam = repository.findById(id);
        return optionalSieuam.orElseThrow(() -> new SieuamNotFoundException("Couldn't find a Sieuam with id: " + id));
    }
    private Sieuam toEntity(SieuamDto dto) {
        Sieuam entity = new Sieuam();
        entity.setDescrip(dto.getDescrip());
        entity.setConclude(dto.getConclude());
        entity.setImage(dto.getImage());
        entity.setId_hoso(dto.getId_hoso());
        return entity;
    }
}
