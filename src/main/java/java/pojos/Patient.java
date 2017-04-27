/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.pojos;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author karanjaeric
 */
@Entity
@NamedQueries({@NamedQuery(name="patient.retrievePatient",query="SELECT P FROM Patient p"),
               @NamedQuery(name="patient.retrievePatientById",query="SELECT P FROM Patient p WHERE p.Id=:patientId")
})
@Inheritance(strategy =InheritanceType.JOINED )
@Table(name = "patient")
public class Patient extends Person {
    
    	private String patientNumber;
	private float height;
	private float weight;
	private String timeIn;
	private String timeOut;

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
    
}
