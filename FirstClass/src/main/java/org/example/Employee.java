package org.example;
import java.util.ArrayList;
import java.util.List;

public class Employee extends User {
    private int employeeId;
    private String name;
    private int age;
    private final int RETIREMENT_AGE = 60;
    //  (Composition)
    private JobPosition assignedPosition;
    // Temp
    private List<WorkRecord> workHistory;
    private List<Payroll> payrollHistory;


    public Employee(String username, String password, String role, boolean isActive,
                    int employeeId, String name, int age, JobPosition assignedPosition) {
        //  (User)
        super(username, password, role, isActive);

        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.assignedPosition = assignedPosition;
        this.workHistory = new ArrayList<>();
        this.payrollHistory = new ArrayList<>();
    }

    public boolean isRetired() {
        return this.age >= RETIREMENT_AGE;
    }

    public void promoteTo(JobPosition newPosition) {
        this.assignedPosition = newPosition;
    }

    // Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public JobPosition getAssignedPosition() { return assignedPosition; }

    public void setAge(int age) { this.age = age; }
}