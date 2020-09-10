package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.EmpBusinessLogic;
import model.Employee;
/**
 * Unique assertion methods and second JUnit test case self created
 * @author Jason Shi
 *
 */
public class TestEmployeeLogic2 {

	EmpBusinessLogic empBL = new EmpBusinessLogic();
	Employee employee = new Employee("Mike");
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testNameInput() {
		employee.setName("Mike");
		assertEquals("Mike", employee.getName());
	}
	
	@Test
	public void testNameNull() {
		employee.setName(null);
		assertNull(employee.getName());
	}
	
	@Test
	public void testAgeNotNull() {
		employee.setAge(53);
		assertNotNull(employee.getAge());
	}
}
