public class student {
    
    String name;
    int gradeLevel;
    double gpa;

    // Constructor

    public student(String name, int gradeLevel, double gpa){
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    // Overloaded Constructors

    public student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        gpa = 0.0;
    } 

    public student(String name){
        this.name = name;
        gradeLevel = 0;
        gpa = 0.0;
    }

    // Getters

    public String getName(){
        return name;
    }

    public int getGradeLevel(){
        return gradeLevel;
    }

    public double getGPA(){
        return gpa;
    }

    // Setters

    public void setName(String name){
        this.name = name;
    }

    public void setGradeLevel(double gpa){
        this.gpa = gpa;
    }

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    public String toString(){
        return "Name: " + getName() + "\nGrade Level: " + getGradeLevel() + "\nGPA: " + getGPA() + "";
    }

}
