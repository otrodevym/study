package com.otrodevym.test.jpa.vo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "career")
public class CareerVO {

	@Id
	private int career_id;
	@Column
	private String company_name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date start_date;
	@Temporal(TemporalType.TIMESTAMP)
	private Date finish_date;
	@Column
	private int position;
//		10 : 사원, 20 : 주임, 30 : 대리, 40 : 과장, 50 : 차장, 60 : 부장, 70 : 사장, 80 : 회장, 00 : 인턴
//	2자리인 이유는 수습 사원이나 특정 기간이 있으면 확장을 고려하기 위해.
	@Column
	private int department;
//	10 : 경영 지원, 20 : 기술, 30 : 영업, 40 : 디자인, 50 : 마케팅, 60 : 연구, 70 : 생산, 80 : 기타, 00 : 경영 
//	2자리인 이유는 기술부에서 세부사항이 존재 할 수 있으므로 확장을 고려하기 위해.
	@Column
	private String task;
	@Column
	private int resume_id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date write_date;
	public int getCareer_id() {
		return career_id;
	}
	public void setCareer_id(int career_id) {
		this.career_id = career_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getFinish_date() {
		return finish_date;
	}
	public void setFinish_date(Date finish_date) {
		this.finish_date = finish_date;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getResume_id() {
		return resume_id;
	}
	public void setResume_id(int resume_id) {
		this.resume_id = resume_id;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	
	
	

}

