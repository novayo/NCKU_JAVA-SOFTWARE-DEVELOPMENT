package test;

import java.util.Date;
public class Employee {
	public String name;
public Date hireDate;
public Employee(){}
public Employee(String theName, Date theDate){ name = theName;
    hireDate = theDate;
}
public Date getHireDate(){
    return hireDate;}
public String getName(){
    return name;
}
public boolean equals(Employee otherone){
if(otherone.getName().equals(this.name) && otherone.getHireDate().equals(this.hireDate)){
return true; }else{
return false; }
}}