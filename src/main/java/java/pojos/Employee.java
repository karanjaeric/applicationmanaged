/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.pojos;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author karanjaeric
 */
@Entity
@Inheritance(strategy =InheritanceType.JOINED )
@Table(name = "employees")
public class Employee extends Person {
    
    	//class fields
	private String employeeNumber;
	private String dateOfEmployment;
	private Double salary;
	private String qualification;

            //getters and setters
        public String getEmployeeNumber() {
            return employeeNumber;
        }

        public void setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
        }

        public String getDateOfEmployment() {
            return dateOfEmployment;
        }

        public void setDateOfEmployment(String dateOfEmployment) {
            this.dateOfEmployment = dateOfEmployment;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public String getQualification() {
            return qualification;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
        }
    
}
