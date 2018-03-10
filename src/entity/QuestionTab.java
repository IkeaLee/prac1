package entity;

public class QuestionTab {
	private String q_id;
    private String q_subject;
    private String q_id1;
    private String q_id2;
    private String q_answer;
    private String q_content;
	public String getQ_id() {
		return q_id;
	}
	public void setQ_id(String q_id) {
		this.q_id = q_id;
	}
	public String getQ_subject() {
		return q_subject;
	}
	public void setQ_subject(String q_subject) {
		this.q_subject = q_subject;
	}
	public String getQ_id1() {
		return q_id1;
	}
	public void setQ_id1(String q_id1) {
		this.q_id1 = q_id1;
	}
	public String getQ_id2() {
		return q_id2;
	}
	public void setQ_id2(String q_id2) {
		this.q_id2 = q_id2;
	}
	public String getQ_answer() {
		return q_answer;
	}
	public void setQ_answer(String q_answer) {
		this.q_answer = q_answer;
	}
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
	public QuestionTab(String q_id, String q_subject, String q_id1,
			String q_id2, String q_answer, String q_content) {
		super();
		this.q_id = q_id;
		this.q_subject = q_subject;
		this.q_id1 = q_id1;
		this.q_id2 = q_id2;
		this.q_answer = q_answer;
		this.q_content = q_content;
	}
	public QuestionTab() {
		super();
	}
	@Override
	public String toString() {
		return "QuestionTab [q_id=" + q_id + ", q_subject=" + q_subject
				+ ", q_id1=" + q_id1 + ", q_id2=" + q_id2 + ", q_answer="
				+ q_answer + ", q_content=" + q_content + "]";
	}
	
    
}
