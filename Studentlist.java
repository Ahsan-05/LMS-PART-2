
public class Studentlist implements Cloneable {

  int size = 0;
  int capacity = 2;
  Student[] student = new Student[capacity];

  // CONSTRUCTOR
  public Studentlist() {
    this.size = 0;
    this.capacity = 2;
    this.student = new Student[capacity];
  }
  public Studentlist(int capacity, int size, Student[] student) {
    this.size = size;
    this.capacity = capacity;
    if (size > capacity) {
      System.out.println("size should be less than capacity");
    } else {
      this.student = new Student[capacity];
    }
  }

  public Studentlist(Studentlist other) {
    this.size = other.size;
    this.capacity = other.capacity;
    if (size > capacity) {
      System.out.println("size should be less than capacity");
    } else {
      this.student = new Student[capacity];
    }
  }

  // ADDSTUDENT METHODS
  public boolean Addstudent(Student other) {
    increased();
    if (!(check(other))) {
      student[size] = other;
      size++;
      return true;
    } else {
      return false;
    }
  }

  // CHECK METHOD

  public boolean check(Student other) {
    for (int i = 0; i < size; i++) {
      if (student[i].compareToSeatNumber(other) == 0) {
        return true;
      }
    }
    return false;
  }

  // INCREASED METHOD

  public void increased() {
    if (size >= capacity) {
      capacity *= 2;
      Student[] temp = new Student[capacity];
      for (int i = 0; i < size; i++) {
        temp[i] = student[i];
      }
      student = temp;
    }
  }

  // CLONED METHOD
  @Override
  protected Object clone() throws CloneNotSupportedException {
    Studentlist cloned = (Studentlist) super.clone();
    cloned.student = new Student[capacity];
    for (int i = 0; i < size; i++) {
      cloned.student[i] = (Student) student[i].clone();

    }
    return cloned;
  }

  // REMOVE STUDENT
  public boolean Removestudent(Student other) {
    if ((check(other))) {

      // THIS INDEX VARIABLE STORE THE SIZE NUMBER OF ARRAY OF STUDENT
      int index = 0;

      for (int i = 0; i < size; i++) {
        if (student[i].compareToName(other) == 0) {
          index = i;
          break;
        }
      }

      for (int ii = index; ii < size - 1; ii++) {
        student[ii] = student[ii + 1];

      }
      student[size - 1] = null;
      size--;
      return true;
    } else {
      return false;
    }
  }

  // TO SEARCH FUNCTION
  public String TOsearch(String seatnumber) {
    String name = "";

    for (int i = 0; i < size; i++) {
      if (student[i].getSeatnumber().equals(seatnumber)) {
        name = student[i].getName();
        return "YES " + name + " EXISTS WHOSE SEATNUMBER IS " + seatnumber;

      }
    }
    return "NO " + name + " DOES'NOT EXISTS WHOSE SEATNUMBER IS " + seatnumber;
  }

  // REPLACE NAME METHOD
  public boolean ToReplace(String seatnumber, String name) {
    // THIS INDEX VARIABLE STORE THE SIZE NUMBER OF ARRAY OF STUDENT
    for (int i = 0; i < size; i++) {
      if (student[i].getSeatnumber().equals(seatnumber)) {

        student[i].setStudent(name, seatnumber);
        return true;
      }
    }
    return false;
  }

  // Sort BY NAME METHOD
  public void Sortbyname() {
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (student[i].compareToName(student[j]) > 0) {

          Student temp = student[i];
          student[i] = student[j];
          student[j] = temp;
        }
      }
    }
  }

  // ADDSTUDENT STUDENT ANOTHER METHOD FOR THOSE WHO COME AT MID OF YEAR
  public boolean Parchi(int indx, Student other) {
    if ((indx < 0) || (indx > size)) {
      System.out.println("indx is invalid");
      return false;
    }
    if (check(other)) {
      System.out.println("Student Already Exists");
      return false;
    }
    increased();
    for (int i = size; i > indx; i--) {
      student[i] = student[i - 1];
    }
    student[indx] = other;
    size++;
    return true;
  }

  // SIZE METHOD
  public int Size() {
    return size;
  }

  // CAPACITY METHOD

  public int Capacity() {
    return capacity;
  }

  // SEAT AVIALABLE METHOD

  public int Seatavialable() {
    int a = capacity - size;
    return a;
  }

  // TOSTRING METHOD

  @Override
  public String toString() {
    String output = "";
    for (int index = 0; index < size; index++) {
      output += "Student = " + student[index].getName() + " , Seat number = " + student[index].getSeatnumber() + "\n";
    }
    return output;
  }

}