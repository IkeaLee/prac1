package entity;

public class FilesTab {
	private String f_id;
    private String f_subject;
    private String f_name;
    private String f_id1;
    private String f_address;
    private String f_category;
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	public String getF_subject() {
		return f_subject;
	}
	public void setF_subject(String f_subject) {
		this.f_subject = f_subject;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getF_id1() {
		return f_id1;
	}
	public void setF_id1(String f_id1) {
		this.f_id1 = f_id1;
	}
	public String getF_address() {
		return f_address;
	}
	public void setF_address(String f_address) {
		this.f_address = f_address;
	}
	public String getF_category() {
		return f_category;
	}
	public void setF_category(String f_category) {
		this.f_category = f_category;
	}
	@Override
	public String toString() {
		return "FilesTab [f_id=" + f_id + ", f_subject=" + f_subject
				+ ", f_name=" + f_name + ", f_id1=" + f_id1 + ", f_address="
				+ f_address + ", f_category=" + f_category + "]";
	}
	public FilesTab(String f_id, String f_subject, String f_name, String f_id1,
			String f_address, String f_category) {
		super();
		this.f_id = f_id;
		this.f_subject = f_subject;
		this.f_name = f_name;
		this.f_id1 = f_id1;
		this.f_address = f_address;
		this.f_category = f_category;
	}
	public FilesTab() {
		super();
	}
	
    
}
