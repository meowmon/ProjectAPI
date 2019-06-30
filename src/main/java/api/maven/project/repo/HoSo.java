/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
/** @author: meepo
 */
public class HoSo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long idUser;
	private long idXQuang;
	private long idXNghiem;
	private long idSieuam;
	private String reason;
	private String date;
	private int leftEyeIndex;
	private int rightEyeIndex;
	private int height;
	private int weight;
	private int blood_pressure;
	private int heart_rate;
	private String conclude;
	private String descrip;
	private String heath_class;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public long getIdXQuang() {
		return idXQuang;
	}
	public void setIdXQuang(long idXQuang) {
		this.idXQuang = idXQuang;
	}
	public long getIdXNghiem() {
		return idXNghiem;
	}
	public void setIdXNghiem(long idXNghiem) {
		this.idXNghiem = idXNghiem;
	}
	public long getIdSieuam() {
		return idSieuam;
	}
	public void setIdSieuam(long idSieuam) {
		this.idSieuam = idSieuam;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getLeftEyeIndex() {
		return leftEyeIndex;
	}
	public void setLeftEyeIndex(int leftEyeIndex) {
		this.leftEyeIndex = leftEyeIndex;
	}
	public int getRightEyeIndex() {
		return rightEyeIndex;
	}
	public void setRightEyeIndex(int rightEyeIndex) {
		this.rightEyeIndex = rightEyeIndex;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBlood_pressure() {
		return blood_pressure;
	}
	public void setBlood_pressure(int blood_pressure) {
		this.blood_pressure = blood_pressure;
	}
	public int getHeart_rate() {
		return heart_rate;
	}
	public void setHeart_rate(int heart_rate) {
		this.heart_rate = heart_rate;
	}
	public String getConclude() {
		return conclude;
	}
	public void setConclude(String conclude) {
		this.conclude = conclude;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getHeath_class() {
		return heath_class;
	}
	public void setHeath_class(String heath_class) {
		this.heath_class = heath_class;
	}
}
