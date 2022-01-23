package Encapsulation;

public class privateInstance {

	private String username;
	private int password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
     if(username.equals("Dilip")) {
	 this.username = "Java Selenium";	}
     else if(username.equals("Siva")) {
    	 this.username="Eclipse";
     }
     else {
    	 this.username="Invalid username";
     }
		
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		if(password==123)
		this.password = 456;
		else if(password==789)
		this.password=123;
		else {
			this.password=0;
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
