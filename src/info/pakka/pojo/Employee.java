package info.pakka.pojo;

public class Employee {
	private Integer emp_No;
	private String emp_Name;
	private Double emp_Salary;
	private Long emp_Mobile_No;

	public Integer getEmp_No() {
		return emp_No;
	}

	public void setEmp_No(Integer emp_No) {
		this.emp_No = emp_No;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public Double getEmp_Salary() {
		return emp_Salary;
	}

	public void setEmp_Salary(Double emp_Salary) {
		this.emp_Salary = emp_Salary;
	}

	public Long getEmp_Mobile_No() {
		return emp_Mobile_No;
	}

	public void setEmp_Mobile_No(Long emp_Mobile_No) {
		this.emp_Mobile_No = emp_Mobile_No;
	}

	@Override
	public String toString() {
		return "Employee [emp_No=" + emp_No + ", emp_Name=" + emp_Name + ", emp_Salary=" + emp_Salary
				+ ", emp_Mobile_No=" + emp_Mobile_No + "]";
	}

}
