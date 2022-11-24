package module_arabiaSaudita;

public class SportDirector  extends Person{
    private String contact1;
    private String ContactEmail;

    public SportDirector(String name,int age, String contact1, String contactEmail) {
        super(name,age);
        this.contact1 = contact1;
        ContactEmail = contactEmail;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }
}
