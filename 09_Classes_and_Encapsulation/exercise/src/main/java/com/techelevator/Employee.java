package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private double annualSalary;

        //constructor
    public Employee( int employeeId, String firstName, String lastName,double annualSalary){
            this.employeeId = employeeId;
            this.firstName = firstName;
            this.lastName = lastName;
           this.annualSalary = annualSalary;
        }
        //raise salary method
        public void raiseSalary ( double percent) {
            double raiseAmount = (annualSalary * percent / 100);
            annualSalary = this.annualSalary + raiseAmount;
            System.out.println(String.format("%.2f", annualSalary));
            System.out.println("Raised salary by" + percent + "%" + "Expected to go from" +
                    String.format("%.2f", annualSalary) + "to" + String.format("%.2f", annualSalary));
        }
        //getters and setters
        public int getEmployeeId(){

        return employeeId;
        }
        public String getFirstName(){

        return firstName;
        }
        public String getLastName(){

        return lastName;
        }
        public String getFullName () {
            return this.lastName + ", " + this.firstName;
        }
        public void setLastName(String lastName){
            this.lastName=lastName;
        }
        public String getDepartment(){

        return department;
        }
        public void setDepartment(String department){

        this.department=department;
        }
        public double getAnnualSalary(){

        return annualSalary;
        }
}



