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
@Table(name = "receptionist")
public class Receptionist extends Person{
    
    
}
