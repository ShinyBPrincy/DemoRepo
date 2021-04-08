package org.project;

import org.client.Employee;
import org.client1.Client;
import org.company.Company;

public class Project {
	public void projectName() {
		System.out.println("project name is stock details");

}
	public static void main(String[] args) {
		Project p= new Project();
		Company c= new Company();
		Client c2= new Client();
		Employee e1= new Employee();
		p.projectName();
		c.companyName();
		c2.clientName();
		e1.empName();
	}
}

