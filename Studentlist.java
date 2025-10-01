
public class Studentlist implements Cloneable {

  int size = 0;
  int capacity = 2;

  Student[] student = new Student[capacity];

  // METHODS
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
      if (student[i].compareToName(other) == 0) {
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
      Studentlist cloned=(Studentlist) super.clone();
      cloned.student= new Student[capacity];
      for (int i = 0; i < size; i++) {
        cloned.student[i]= (Student) student[i].clone();

      }
      return cloned;
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