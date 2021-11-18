package School;

public class Lecturer {
    private String name;
    private String course;
    

    public Lecturer() {
    }

    public Lecturer(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Lecturer name(String name) {
        setName(name);
        return this;
    }

    public Lecturer course(String course) {
        setCourse(course);
        return this;
    }

 
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", course='" + getCourse() + "'" +
            "}";
    }

}
