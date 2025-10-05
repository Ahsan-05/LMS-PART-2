
public class Controller {
    public Controller() throws CloneNotSupportedException {
        run();
    }

    public void run() throws CloneNotSupportedException {

        // CREATING OBJECT OF STUDENTLIST
        Studentlist dcs = new Studentlist();

        // CREATING OBJECT OF STUDENT
        Student s1 = new Student("Mohib", "B24110006146");
        Student s2 = new Student("Sheikh wajihuddin", "B24110006130");
        Student s3 = new Student("hasnain", "B24110006051");
        Student s4 = new Student();

        // ADDING STUDENTS
        if (dcs.Addstudent(s1)) {
            System.out.println("STUDENT ENROLL");
        }
        if (dcs.Addstudent(s2)) {
            System.out.println("STUDENT ENROLL");
        }
        if (dcs.Addstudent(s3)) {
            System.out.println("STUDENT ENROLL");
        }

        // COPY OF DCS BY CLONE METHOD

        Studentlist clonearray = (Studentlist) dcs.clone();

        // CHECKING DEEP COPY BY ADDING NEW STUDENT
        if (dcs.Addstudent(s4)) {
            System.out.println("STUDENT ENROLL");
        }
        System.out.println(dcs);
        System.out.println(".............CLONED ARRAY......................");
        System.out.println(clonearray);

        // CALL REMOVE STUDENT METHOD
        if (dcs.Removestudent(s3)) {
            System.out.println("Student removed");
        }

        System.out.println("................................................");

        // ENSURING THAT REMOVE FUNCTION IS WORKING PROPERLY
        System.out.println(dcs);

        // CALL TOSEARCH METHOD
        System.out.println(dcs.TOsearch("B24110006082"));

        // CALLING TOREPLACE METHOD
        if (dcs.ToReplace("B24110006146", "Syed Mohib Farooq")) {
            System.out.println("NAME REPLACE SUCCESSFULLY");
        }

        // CALLING SORTBY NAME METHOD
        dcs.Sortbyname();
        // CHECKING THAT STUDENTS ARE SORTED A/C TO NAME
        System.out.println(dcs);

        // CALLING ADDSTUDENT METHOD
        if (dcs.Parchi(1, s3)) {
            System.out.println("STUDENT ENROLL");
        }

        System.out.println(dcs);

        System.out.println("\n" + "NUMBER OF STUDENTS ENROLL IN DCS ARE :" + dcs.Size());
        System.out.println("\n" + "TOTAL NUMBER OF SEATS OF DCS ARE :" + dcs.Capacity());
        System.out.println("\n" + "THE NUMBER OF SEATS AVIALABLE IN DCS ARE : " + dcs.Seatavialable());

        // CREATING OBJECT OF COURSE
        Course c1 = new Course("Discrete Mathematics", "BSCS-411", "3+0");
        Course c2 = new Course("Object Oriented Programming", "BSCS-413", "2+1");
        Course c3 = new Course("Digital Computer Design Fundamentals", "BSCS-401", "2+1");
        Course c4 = new Course();

        // CREATING OBJECT OF COURSE LIST
        Courselist semester2 = new Courselist();

        System.out.println(".........COURSE ARRAY..............................");

        // ADDING COURSES
        if (semester2.Addcourse(c1)) {
            System.out.println("Course added");
        }
        if (semester2.Addcourse(c2)) {
            System.out.println("Course added");
        }
        if (semester2.Addcourse(c3)) {
            System.out.println("Course added");
        }

        // COPY OF SEMESTER2 ARRAY BY CLONE METHOD

        Courselist clonedarray = (Courselist) semester2.clone();

        // CHECKING DEEP COPY BY ADDING NEW COURSE
        if (semester2.Addcourse(c4)) {
            System.out.println("Course added");
        }
        System.out.println(semester2);
        System.out.println(".............CLONED ARRAY......................");
        System.out.println(clonedarray);

        System.out.println("..................................................");

        // CALL REMOVE COURSE METHOD
        if (semester2.Removecourse(c3)) {
            System.out.println("Course removed");
        }

        // ENSURING THAT REMOVE FUNCTION IS WORKING PROPERLY
        System.out.println(semester2);

        // CALL TOSEARCH METHOD
        System.out.println(semester2.TOsearchCourse("BSCS-411"));

        // CALLING TOREPLACE COURSE METHOD
        if (semester2.ToReplacecoursename("DISCRETE MATHEMATICS", "BSCS-411", "3+0")) {
            System.out.println("COURSE NAME REPLACE SUCCESSFULLY");
        }

        // CALLING SORT BY COURSENAME METHOD
        semester2.Sortbycoursename();
        // CHECKING THAT COURSES ARE SORTED A/C TO NAME
        System.out.println(semester2);

        // CALLING SORT BY COURSECODE METHOD
        semester2.Sortbycoursecode();
        // CHECKING THAT COURSES ARE SORTED A/C TO CODE
        System.out.println(semester2);

    }
}