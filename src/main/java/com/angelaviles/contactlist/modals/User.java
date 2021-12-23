package com.angelaviles.contactlist.modals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User {
	
	@Id
	private String nickname;
	
	@Column
	private String password;
	
	@Column
	private String name;
	
	@Column
	private Integer age;
	
	@Column
	private String phones;
	
	@Column
	private Boolean enabled;
	
	public User() {
		this.enabled = true;
		this.password = "$10$6B41jKmyUxA9JHVq0e4KTu7catYL4rrfQpOtyxyez3iOp5c53d/C2";
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhones() {
		return phones;
	}
	public void setPhones(String phones) {
		this.phones = phones;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	

}
