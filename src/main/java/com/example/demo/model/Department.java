package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DEPARTMENTS database table.
 * 
 */
@Entity
@Table(name="DEPARTMENTS")
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DEPARTMENT_ID")
	private long departmentId;

	@Column(name="DEPARTMENT_NAME")
	private String departmentName;

	@Column(name="MANAGER_ID")
	private java.math.BigDecimal managerId;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private Location location;

	//bi-directional many-to-one association to JobHistory
	@OneToMany(mappedBy="department")
	private List<JobHistory> jobHistories;

	public Department() {
	}

	public long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public java.math.BigDecimal getManagerId() {
		return this.managerId;
	}

	public void setManagerId(java.math.BigDecimal managerId) {
		this.managerId = managerId;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(List<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

	public JobHistory addJobHistory(JobHistory jobHistory) {
		getJobHistories().add(jobHistory);
		jobHistory.setDepartment(this);

		return jobHistory;
	}

	public JobHistory removeJobHistory(JobHistory jobHistory) {
		getJobHistories().remove(jobHistory);
		jobHistory.setDepartment(null);

		return jobHistory;
	}

}