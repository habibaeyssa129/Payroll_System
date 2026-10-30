package org.example;

public class Department {
    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName) {
        setDeptId(deptId);
        setDeptName(deptName);
    }

    public String getDeptName() {return deptName;}
    public int getDeptId() {return deptId;}


    private void setDeptId(int deptId) {
        if (deptId < 0) {
            throw new IllegalArgumentException("DepartmentID cannot be negative");
        }
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        if (deptName==null||deptName.isBlank()) {throw new IllegalArgumentException("Department cannot be empty");}

        this.deptName = deptName;
    }
}
