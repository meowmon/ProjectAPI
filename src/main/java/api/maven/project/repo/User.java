/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.repo;

/** @author: meepo
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String name;
	private String gender;
	private String code;
	private long idBoMon;
	private String BoMon;
	private String email;
	private String phone;
	private String role;
	private String birthday;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getIdBoMon() {
		return idBoMon;
	}
	public void setIdBoMon(long idBoMon) {
		this.idBoMon = idBoMon;
	}
	public String getBoMon() {
		return BoMon;
	}
	public void setBoMon(String boMon) {
		BoMon = boMon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
