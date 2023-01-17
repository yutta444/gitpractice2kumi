package dto;

public class Kadai {
	private int id;
	private String mail;
	private String pw;
	private String name;
	private int grade;
	private String division;
	private String salt;
	private String hashedPassword;
	public Kadai(int id, String mail, String pw, String name, int grade, String division, String salt,
			String hashedPassword) {
		super();
		this.id = id;
		this.mail = mail;
		this.pw = pw;
		this.name = name;
		this.grade = grade;
		this.division = division;
		this.salt = salt;
		this.hashedPassword = hashedPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	
	
}
