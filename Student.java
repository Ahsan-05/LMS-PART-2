
public class Student {
    private String name;
    private String Seatnumber;
    
    //  CONSTRUCTOR
    
    public Student(){
        name="Ahsan";
        Seatnumber="B24110006082";
    }
    
    public Student(String name,String Seatnumber){
        this.name=name;
        this.Seatnumber=Seatnumber;
    }

    public Student(Student other){
        this.name=other.name;
        this.Seatnumber=other.Seatnumber;
    }
    
    //  SETTER

    public void setStudent(String name,String Seatnumber){
        this.name=name;
        this.Seatnumber=Seatnumber;
    }

    //  GETTER
    
    public String getName(){
        return name;
    }
      
    public String getSeatnumber(){
        return Seatnumber;
    }
  
    // COMPARE METHOD FOR SORTING PURPOSE
    public int compareToName(Student other){
       return this.name.compareTo(other.name);
    }

    public int compareToSeatNumber(Student other){
       return this.Seatnumber.compareTo(other.Seatnumber);
    }
    
    // CLONED METHOD 
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }
    
    // TO PRINT
    @Override
    public String toString() {
        
        return "Name = "+name+"Seat number = "+Seatnumber  ;
    }

}