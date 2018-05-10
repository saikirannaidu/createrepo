package demogit;

public class student {
	private int sid;
	private String ename;
	public student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", ename=" + ename + "]";
	}
	
	

}
