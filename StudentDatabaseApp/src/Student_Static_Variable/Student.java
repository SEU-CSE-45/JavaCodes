
package Student_Static_Variable;

public class Student {
    String name;
    int id;
    static String University="Southeast University";
    public Student(String name,int id){
    this.name=name;
    this.id=id;
    }
    
    public void printInfo(){
        System.out.println("Student Name : "+name);
        System.out.println("Student ID : "+id);
        System.out.println("University Name : "+University);
    }
}
