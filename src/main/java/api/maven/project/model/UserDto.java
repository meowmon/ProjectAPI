/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.model;

/** @author: meepo
 */
public class UserDto {
	private long id;
	private String name;
	private String gender;
	private String code;
	private long id_bomon;
	private String bo_mon;
	private String email;
	private String phone;
	private String role;
	private String birthday;
	private String password;
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
	
	public long getId_bomon() {
		return id_bomon;
	}
	public void setId_bomon(long id_bomon) {
		this.id_bomon = id_bomon;
	}
	public String getBo_mon() {
		return bo_mon;
	}
	public void setBo_mon(String bo_mon) {
		this.bo_mon = bo_mon;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
