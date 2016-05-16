package com.mum.edu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class EmployeeBean{
	
	private Employee employee=new Employee(1432, "Frank Brown", "625-345-2635", "45089.50");
	private List employees = new ArrayList();
        Iterator iter;
	
	public EmployeeBean(){
		employees.add(new Employee(1432, "Frank Brown", "625-345-2635", "45089.50"));
		employees.add(new Employee(1321, "John Doe", "625-345-3321", "56003.00"));
                employees.add(new Employee(1634, "Mary Jones", "625-345-3421", "73998.30"));
    	}
  
	public void getEmployees(ActionEvent event)
	{
		UIParameter component = (UIParameter) event.getComponent().findComponent("id");
		int id = Integer.parseInt(component.getValue().toString());
		
		Iterator iter = employees.iterator();
        while (iter.hasNext()) {
            Employee emp = (Employee) iter.next();
            if (emp.getId()==id) {
            	employee = emp;
              }
        }
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public List getEmployees() {
		return employees;
	}

	public void setEmployeeList(List employees) {
		this.employees = employees;
	}
        
        public String getAllEmployees(){
            return "allemployeetemplate";
        }
        
        public String goToMianPage(){
            return "index";
        }
}
