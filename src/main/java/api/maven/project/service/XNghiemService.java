/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.XNghiemDto;
import api.maven.project.repo.XNghiem;
import api.maven.project.repo.XNghiemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class XNghiemService {
	@Autowired XNghiemRepository repository;
	
	public void add(XNghiemDto dto) {
			repository.save(toEntity(dto));
    }
    public XNghiem getXNghiemById(long id) {
        Optional<XNghiem> optionalXNghiem = repository.findById(id);
        return optionalXNghiem.orElseThrow(() -> new XNghiemNotFoundException("Couldn't find a XNghiem with id: " + id));
    }
    private XNghiem toEntity(XNghiemDto dto) {
        XNghiem entity = new XNghiem();
        entity.setDescrip(dto.getDescrip());
        entity.setConclude(dto.getConclude());
        entity.setBlood_class(dto.getBlood_class());
        entity.setHb(dto.getHb());
        entity.setHct(dto.getHct());
        entity.setMch(dto.getMch());
        entity.setMcv(dto.getMcv());
        entity.setRbc(dto.getRbc());
        entity.setWbc(dto.getWbc());
        entity.setId_hoso(dto.getId_hoso());
        return entity;
    }
}
