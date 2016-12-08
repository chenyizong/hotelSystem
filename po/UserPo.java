package po;

public class UserPo {
	
	private int id;
	
	private String username;
	
	private String phone;
	
	private int credit;

	public UserPo(int id, String username, String phone, int credit) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.credit = credit;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	

}
