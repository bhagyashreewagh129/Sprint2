package pojo;

public class P1 {

	String email;
	String name;
	String password;
	int id;
	long mobno;
	
	
	public P1(String email, String name, String password, int id, long mobno) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.id = id;
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
	
}
