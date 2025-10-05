public class Course implements Cloneable {
    private String name;
    private String code;
    private String credithour;

    // CONSTRUCTOR
    public Course() {
        name = "Mathematics - I (Calculus)";
        code = "BSCS-303";
        credithour = "3+0";

    }

    public Course(String name, String code, String credithour) {
        this.name = name;
        this.code = code;
        this.credithour = credithour;
    }

    public Course(Course other) {
        this.name = other.name;
        this.code = other.code;
        this.credithour = other.credithour;
    }

    // SETTER
    public void setCourse(String name, String code, String credithour) {
        this.name = name;
        this.code = code;
        this.credithour = credithour;
    }

    // GETTER
    public String getcoursename() {
        return name;
    }

    public String getcoursecode() {
        return code;
    }

    public String getCredithour() {
        return credithour;
    }

    // CLONED METHOD
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    // COMPARE METHOD FOR SORTING PURPOSE
    public int compareToCoursename(Course other) {
        return this.name.compareTo(other.name);
    }

    public int compareToCoursecode(Course other) {
        return this.code.compareTo(other.code);
    }

    // TO PRINT
    @Override
    public String toString() {
        return "Course Name = " + name + "Cousre Code = " + code + "Credit hour = " + credithour;
    }

}
