package model;
/**
 * 9/9/2020
 * @author Jason Shi
 *
 */
public class EmpBusinessLogic {
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;

	}
	
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;

		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}

		return appraisal;
	}
	
	/**
	 * isRetirementAge() method
	 * @param employee
	 * @return
	 */
	public boolean isRetirementAge(Employee employee) {
		boolean retire = true;
		
		if(employee.getAge() > 65) {
			return retire = true;
		}else {
			return retire = false;
		}
	}
}
