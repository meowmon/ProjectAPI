/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.service;
import api.maven.project.model.HoSoDto;
import api.maven.project.repo.HoSo;
import api.maven.project.repo.HoSoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class HoSoService {
	@Autowired HoSoRepository repository;
	
	public void add(HoSoDto dto) {
			repository.save(toEntity(dto));
    }
    public List<HoSo> getHoSo() {
        return (List<HoSo>) repository.findAll();
    }
    public HoSo getHoSoById(long id) {
        Optional<HoSo> optionalHoSo = repository.findById(id);
        return optionalHoSo.orElseThrow(() -> new HoSoNotFoundException("Couldn't find a HoSo with id: " + id));
    }
    private HoSo toEntity(HoSoDto dto) {
        HoSo entity = new HoSo();
        entity.setDate(dto.getDate());
        entity.setDescrip(dto.getDescrip());
        entity.setBlood_pressure(dto.getBlood_pressure());
        entity.setIdUser(dto.getIdUser());
        entity.setDate(dto.getDate());
        entity.setHeart_rate(dto.getHeart_rate());
        entity.setConclude(dto.getConclude());
        entity.setHeath_class(dto.getHeath_class());
        entity.setHeight(dto.getHeight());
        entity.setLeftEyeIndex(dto.getLeftEyeIndex());
        entity.setRightEyeIndex(dto.getRightEyeIndex());
        entity.setWeight(dto.getWeight());
        entity.setReason(dto.getReason());
        entity.setCode(dto.getCode());
        entity.setName(dto.getName());
        entity.setPhone(dto.getPhone());
        return entity;
    }
    public void setHoSoById(long id, HoSoDto dto) {
    	Optional<HoSo> ou = repository.findById(id);
    	if(ou.isPresent()) {
    		HoSo nc = ou.get();
    		nc.setId(dto.getId());
    		nc.setDate(dto.getDate());
            nc.setDescrip(dto.getDescrip());
            nc.setBlood_pressure(dto.getBlood_pressure());
            nc.setIdUser(dto.getIdUser());
            nc.setDate(dto.getDate());
            nc.setHeart_rate(dto.getHeart_rate());
            nc.setConclude(dto.getConclude());
            nc.setHeath_class(dto.getHeath_class());
            nc.setHeight(dto.getHeight());
            nc.setLeftEyeIndex(dto.getLeftEyeIndex());
            nc.setRightEyeIndex(dto.getRightEyeIndex());
            nc.setWeight(dto.getWeight());
            nc.setReason(dto.getReason());
    		repository.save(nc);
    	}
    }
}
