package users.dto;

import java.io.Serializable;



public class User implements Serializable{
	private String login;
	private String password;
	
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void print(){
		System.out.println(login + " " + password);
	}
	public String toString(){
		return "Саша";
	}
}