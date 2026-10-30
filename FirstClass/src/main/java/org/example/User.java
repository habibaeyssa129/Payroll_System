package org.example;

public abstract class User {
    //  (Attributes)
    private String username;
    private String password;
    private String role;
    private boolean isActive;

    //  (Constructor)
    public User(String username, String password, String role, boolean isActive) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
    }

    // (Behavior / Methods)
    public boolean authenticate(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass) && this.isActive;
    }

    public void changePassword(String newPass) {
        this.password = newPass;
    }

    // (Getters and Setters)
    public String getRole() { return this.role; }
    public String getUsername() { return username; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) {
        isActive = active; }
}
