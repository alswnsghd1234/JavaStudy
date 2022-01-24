package ch05;

public class Phone {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String userNumber;
	
	public Phone() {}
	
	public Phone(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	public String showUserInfo() {
		return "∞Ì∞¥¥‘¿«" + userId;
	}
	}

