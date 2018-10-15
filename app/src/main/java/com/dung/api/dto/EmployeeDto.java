package com.dung.api.dto;

import com.google.gson.annotations.SerializedName;

public class EmployeeDto {
    //tat ca nhung doi tuong lam viec voi server  dau dat o dto
    //dung du lieu
    //bat boc phai co contructor k tham so, va get set de thang retrofit tao obj

    private String id;
    @SerializedName("employee_name")
    private String employeeName;
    @SerializedName("employee_age")
    private String employeeAge;

    public EmployeeDto() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id='" + id + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge='" + employeeAge + '\'' +
                '}';
    }
}
