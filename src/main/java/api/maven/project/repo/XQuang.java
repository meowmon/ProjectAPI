/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** @author: meepo
 */
@Entity 
public class XQuang {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String image;
	private String descrip;
	private String conclude;
	private long id_hoso;
	public long getId_hoso() {
		return id_hoso;
	}
	public void setId_hoso(long id_hoso) {
		this.id_hoso = id_hoso;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getConclude() {
		return conclude;
	}
	public void setConclude(String conclude) {
		this.conclude = conclude;
	}

}
