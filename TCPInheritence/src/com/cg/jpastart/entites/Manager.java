package com.cg.jpastart.entites;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "mgr")//only one column in sql----->dname varchar
//inheritance
public class Manager extends Employee {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}


