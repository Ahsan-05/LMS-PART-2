public class Courselist implements Cloneable {
    int capacity = 5;
    int size = 0;
    Course[] course = new Course[capacity];

    // CONSTRUCTOR
    public Courselist() {
        this.capacity = 5;
        this.size = 0;
        this.course = new Course[capacity];
    }

    public Courselist(int capacity, int size, Course[] course) {
        this.capacity = capacity;
        this.size = size;
        if (size > capacity) {
            System.out.println("size should be less than capacity");
        } else {
            this.course = new Course[capacity];
        }
    }

    public Courselist(Courselist other) {
        this.capacity = other.capacity;
        this.size = other.size;
        if (size > capacity) {
            System.out.println("size should be less than capacity");
        } else {
            this.course = new Course[capacity];
        }
    }

    // CHECK METHOD

    public boolean check(Course other) {
        for (int i = 0; i < size; i++) {
            if (course[i].compareToCoursename(other) == 0) {
                return true;
            }
        }
        return false;
    }

    // ADD COURSE METHOD

    public boolean Addcourse(Course other) {
        increased();
        if (!(check(other))) {
            course[size] = other;
            size++;
            return true;
        } else {
            return false;
        }
    }

    // INCREASED METHOD

    public void increased() {
        if (size >= capacity) {
            capacity *= 2;
            Course[] temp = new Course[capacity];
            for (int i = 0; i < size; i++) {
                temp[i] = course[i];
            }
            course = temp;
        }
    }

    // CLONED METHOD
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Courselist cloned = (Courselist) super.clone();
        cloned.course = new Course[capacity];
        for (int i = 0; i < size; i++) {
            cloned.course[i] = (Course) course[i].clone();

        }
        return cloned;
    }

    // REMOVE COURSE METHOD
    public boolean Removecourse(Course other) {
        if ((check(other))) {

            // THIS INDEX VARIABLE STORE THE SIZE NUMBER OF ARRAY OF COURSE
            int index = 0;

            for (int i = 0; i < size; i++) {
                if (course[i].compareToCoursename(other) == 0) {
                    index = i;
                    break;
                }
            }

            for (int ii = index; ii < size - 1; ii++) {
                course[ii] = course[ii + 1];

            }
            course[size - 1] = null;
            size--;
            return true;
        }
        return false;

    }

    // TO SEARCH FUNCTION
    public String TOsearchCourse(String course_code) {
        String name = "";

        for (int i = 0; i < size; i++) {
            if (course[i].getcoursecode().equals(course_code)) {
                name = course[i].getcoursename();
                return "YES " + name + " EXISTS WHOSE CODE IS " + course_code;

            }
        }
        return "NO " + name + " DOES'NOT EXISTS WHOSE CODE IS " + course_code;
    }

    // REPLACE COURSE NAME METHOD
    public boolean ToReplacecoursename(String name, String code, String credithour) {
        // THIS INDEX VARIABLE STORE THE SIZE NUMBER OF ARRAY OF STUDENT
        for (int i = 0; i < size; i++) {
            if (course[i].getcoursecode().equals(code)) {

                course[i].setCourse(name, code, credithour);
                return true;
            }
        }
        return false;
    }

    // Sort BY COURSE NAME METHOD
    public void Sortbycoursename() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (course[i].compareToCoursename(course[j]) > 0) {

                    Course temp = course[i];
                    course[i] = course[j];
                    course[j] = temp;
                }
            }
        }
    }

    // Sort BY COURSE CODE METHOD
    public void Sortbycoursecode() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (course[i].compareToCoursecode(course[j]) > 0) {

                    Course temp = course[i];
                    course[i] = course[j];
                    course[j] = temp;
                }
            }
        }
    }

    // TOSTRING METHOD
    @Override
    public String toString() {
        String output = "";
        for (int index = 0; index < size; index++) {
            output += "Course Name = " + course[index].getcoursename() + " , Cousre Code = "
                    + course[index].getcoursecode() + " , Credit hour = " + course[index].getCredithour() + "\n";
        }
        return output;
    }
}
