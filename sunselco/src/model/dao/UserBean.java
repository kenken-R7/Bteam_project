package model.dao;

import java.io.Serializable;

public class UserBean implements Serializable{
private String id;
private String password;
private String name;
private int level;

public UserBean() {}

public UserBean(String id,String password,String name,int level) {
	this.id=id;
	this.password=password;
	this.name=name;
	this.level=level;
}

public String getId() {
	return this.id;
}
public void setId(String id) {
	this.id=id;
}
public String getPassWord() {
	return this.password;
}
public void setPassWord(String pas) {
	this.password=pas;
}
public String getName() {
return this.name;
}
public void setName(String name) {
	this.name=name;
}
public int getLevel() {
	return this.level;
}
public void setLevel(int lev) {
	this.level=lev;
}
}
