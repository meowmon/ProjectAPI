/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.XQuangDto;
import api.maven.project.repo.XQuang;
import api.maven.project.repo.XQuangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class XQuangService {
	@Autowired XQuangRepository repository;
	
	public void add(XQuangDto dto) {
			repository.save(toEntity(dto));
    }
    public XQuang getXQuangById(long id) {
        Optional<XQuang> optionalXQuang = repository.findById(id);
        return optionalXQuang.orElseThrow(() -> new XQuangNotFoundException("Couldn't find a XQuang with id: " + id));
    }
    private XQuang toEntity(XQuangDto dto) {
        XQuang entity = new XQuang();
        entity.setDescrip(dto.getDescrip());
        entity.setConclude(dto.getConclude());
        entity.setImage(dto.getImage());
        return entity;
    }
}
