package beans;

public class calbean {
	private String content,date;
	private String caldata="";
	/*public calbean(String dt,String con) {
		content=con;
		date=dt;
		caldata+=(dt+" "+con+"<br/>");
	}*/

	public void setContent(String con) {
		content=con;
		caldata+=(con+"<br/>");
	}

	public void setDate(String dt) {
		date=dt;
		caldata+=(dt+" ");
	}

	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
	public String getCaldata() {
		return caldata;
	}



}