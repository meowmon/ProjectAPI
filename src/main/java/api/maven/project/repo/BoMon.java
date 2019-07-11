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
public class BoMon {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private long id_khoa;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId_khoa() {
		return id_khoa;
	}
	public void setId_khoa(long id_khoa) {
		this.id_khoa = id_khoa;
	}
	
}
