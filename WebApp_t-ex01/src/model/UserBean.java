package model;
import java.io.Serializable;

public class UserBean implements Serializable{
private String name;
private String pass;
private String id;
private String age;
public UserBean() {}
public UserBean(String name,String pass ,String id,String age) {
	this.name=name;
	this.pass=pass;
	this.id=id;
	this.age=age;
	
	
}
public UserBean(String name,String pass) {
	this.name=name;
	this.pass=pass;
}
public String getName() {return name;}
public String getPass() {return pass;}
public String getId() {return id;}
public String getAge() {return age;}
}
