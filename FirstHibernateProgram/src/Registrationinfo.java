// default package
// Generated Dec 12, 2016 2:08:48 PM by Hibernate Tools 3.4.0.CR1

/**
 * Registrationinfo generated by hbm2java
 */
public class Registrationinfo implements java.io.Serializable {

	private Integer id;
	private String name;
	private String password;
	private String rePass;
	private Integer phoneNum;
	private String email;
	private String address;
	private String regCode;
	private String country;
	private String sex;

	public Registrationinfo() {
	}

	public Registrationinfo(String name, String password, String rePass,
			Integer phoneNum, String email, String address, String regCode,
			String country, String sex) {
		this.name = name;
		this.password = password;
		this.rePass = rePass;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.regCode = regCode;
		this.country = country;
		this.sex = sex;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePass() {
		return this.rePass;
	}

	public void setRePass(String rePass) {
		this.rePass = rePass;
	}

	public Integer getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegCode() {
		return this.regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}