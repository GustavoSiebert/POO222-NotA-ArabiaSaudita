package module_arabiaSaudita;

public class TechCommittee extends Person{
    private String role;

    public TechCommittee(String name,int age,String role) {
        super(name,age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
