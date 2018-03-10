package entity;

public class ContactUsTab {
	private int id;
	private String name;
    private String email;
    private String telno;
    private String advice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	@Override
	public String toString() {
		return "ContactUsTab [id=" + id + ", name=" + name + ", email=" + email
				+ ", telno=" + telno + ", advice=" + advice + "]";
	}
	public ContactUsTab() {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telno = telno;
		this.advice = advice;
	}
	
}
