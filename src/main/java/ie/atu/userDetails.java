package ie.atu;

public class userDetails {
    private String name;
    private String email;
    private String course;

    public userDetails() {
        this.name = "";
        this.email = "";
        this.course = "";
    }
    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return this.email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getCourse() {

        return this.course;
    }

    public void setCourse(String course) {

        this.course = course;
    }
}