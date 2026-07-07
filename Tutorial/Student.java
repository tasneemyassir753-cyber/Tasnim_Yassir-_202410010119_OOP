//Attributes
class Studant {
    String name;
    int age;
    double gpa;

    //constructor: To store the values from users
    Student(String studentName, int studentAge, double studentGpa) {
    name = studentName;
    age = studentAge;
    gpa = studantGpa;
}
// Methods
public void displayInfo() {
    System.out.println("Name: "+ name);
    System.out.println("Age: "+ age);
    System.out.println("GPA: "+ gpa);
}
// Another Methods
public void study() {
    System.out.println(name + "is studying.");
}
//Yet Another Methods
public void takeExam() {
    System.out.println(name + "is taking an exam.");
    
}
