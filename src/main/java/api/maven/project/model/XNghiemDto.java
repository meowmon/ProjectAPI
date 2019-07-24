/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.model;

/** @author: meepo
 */
public class XNghiemDto {
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
