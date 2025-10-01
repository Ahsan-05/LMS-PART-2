
public class Controller {
    public Controller() throws CloneNotSupportedException {
        run();
    }

    public void run() throws CloneNotSupportedException {
        Student s1 = new Student("Mohib", "B24110006146");
        Student s2 = new Student("Sheikh wajihuddin", "B24110006130");
        Student s3 = new Student("hasnain", "B24110006051");
        Student s4 = new Student();

       

        System.out.println();

        // CREATING OBJECT OF DATATYPE STUDENTLIST

        Studentlist dcs = new Studentlist();

        Studentlist clonearray=(Studentlist)dcs.clone();
       
       
       
       if (dcs.Addstudent(s1)) {
               System.out.println("STUDENT ENROLL"); 
       }

       
       
       
       
       
       
       
       
       
       
       
       
        System.out.println(dcs);
        


    }
}