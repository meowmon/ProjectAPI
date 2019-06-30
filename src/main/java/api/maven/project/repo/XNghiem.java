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
public class XNghiem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int wbc;
	private int rbc;
	private int hb;
	private int hct;
	private int mcv;
	private int mch;
	private char blood_class;
	private String descrip;
	private String conclude;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getWbc() {
		return wbc;
	}
	public void setWbc(int wbc) {
		this.wbc = wbc;
	}
	public int getRbc() {
		return rbc;
	}
	public void setRbc(int rbc) {
		this.rbc = rbc;
	}
	public int getHb() {
		return hb;
	}
	public void setHb(int hb) {
		this.hb = hb;
	}
	public int getHct() {
		return hct;
	}
	public void setHct(int hct) {
		this.hct = hct;
	}
	public int getMcv() {
		return mcv;
	}
	public void setMcv(int mcv) {
		this.mcv = mcv;
	}
	public int getMch() {
		return mch;
	}
	public void setMch(int mch) {
		this.mch = mch;
	}
	public char getBlood_class() {
		return blood_class;
	}
	public void setBlood_class(char blood_class) {
		this.blood_class = blood_class;
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
