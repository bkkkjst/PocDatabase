package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the emp_details_view database table.
 * 
 */
@Entity
@Table(name="emp_details_view")
@NamedQuery(name="EmpDetailsView.findAll", query="SELECT e FROM EmpDetailsView e")
public class EmpDetailsView implements Serializable {
	private static final long serialVersionUID = 1L;

	private String city;

	@Column(name="commission_pct")
	private float commissionPct;

	@Column(name="country_id")
	private String countryId;

	@Column(name="country_name")
	private String countryName;

	@Column(name="department_id")
	private Integer departmentId;

	@Column(name="department_name")
	private String departmentName;

	@Column(name="employee_id")
	private Integer employeeId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="job_id")
	private String jobId;

	@Column(name="job_title")
	private String jobTitle;

	@Column(name="last_name")
	private String lastName;

	@Column(name="location_id")
	private Integer locationId;

	@Column(name="manager_id")
	private Integer managerId;

	@Column(name="region_name")
	private String regionName;

	private double salary;

	@Column(name="state_province")
	private String stateProvince;

	public EmpDetailsView() {
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(float commissionPct) {
		this.commissionPct = commissionPct;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

}