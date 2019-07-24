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
public class Request {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    private long idUser;
    private long idHoso;
    private String date;
    private String time;
    private String fee;
    private boolean xnghiem;
    private boolean sieuam;
    private boolean xquang;
    private String name;
	private String code;
	private String phone;
    private String descrip;
    private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
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
	public long getIdHoso() {
		return idHoso;
	}
	public void setIdHoso(long idHoso) {
		this.idHoso = idHoso;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public boolean isXnghiem() {
		return xnghiem;
	}
	public void setXnghiem(boolean xnghiem) {
		this.xnghiem = xnghiem;
	}
	public boolean isSieuam() {
		return sieuam;
	}
	public void setSieuam(boolean sieuam) {
		this.sieuam = sieuam;
	}
	public boolean isXquang() {
		return xquang;
	}
	public void setXquang(boolean xquang) {
		this.xquang = xquang;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
