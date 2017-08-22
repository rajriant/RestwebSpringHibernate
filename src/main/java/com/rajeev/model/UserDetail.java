package com.rajeev.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="UserDetailDtoForMobiles", namespace="com.rajeev" )

@XmlAccessorType(XmlAccessType.NONE)
public class UserDetail {
	@XmlAttribute(name="adminAsstName")
	private String adminAsstName;
	
	@XmlElement(name="adminName")
	
	private String adminName;
	
	//private Integer noEmp;

	public String getAdminAsstName() {
		return adminAsstName;
	}

	public void setAdminAsstName(String adminAsstName) {
		this.adminAsstName = adminAsstName;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
}  
