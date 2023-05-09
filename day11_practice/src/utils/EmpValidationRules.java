package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.core.Department;
import com.core.Employee;
import com.core.exception.EmpHandlingException;

public interface EmpValidationRules{
	static Employee validAllInputs(String eid, String fname, String lname, double salary,String jdate ,String dept,Map<String,Employee>emps) throws EmpHandlingException {
	Department deptname=	validateDepartment( dept);
	LocalDate date=checkForDate( jdate);
	checkForDuplicate(eid,emps);
		return new Employee(eid,fname,lname,salary,date,deptname);
		
	}
	
	
static Department validateDepartment(String dept) throws EmpHandlingException {
	return Department.valueOf(dept.toUpperCase());
	
}
static LocalDate checkForDate(String date) throws EmpHandlingException {
	LocalDate date1=LocalDate.parse(date);
	int years=Period.between(date1, LocalDate.now()).getYears();
	if(years>3)
		throw new EmpHandlingException("Date must be before 3 year....");
	return date1;
	
}
static String checkForDuplicate(String eid,Map<String,Employee>emps) throws EmpHandlingException {
if(emps.containsKey(eid))
 throw new EmpHandlingException("Duplicate Employe found....");
return eid;
}
}
