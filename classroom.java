import java.util.ArrayList;

public class classroom {

    static ArrayList<student> classroom = new ArrayList<student>();

    // Prints out index of a student in the class
    public int getStudent(String name){

        for(int i = 0 ; i < classroom.size() ; i++){
            if (classroom.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    // Gets the size of the classroom

    public void getClassSize(){
        System.out.println("There are " + classroom.size() + " students in the class");
    }

    public void add(student s) {

        student other = new student(s.getName(), s.getGradeLevel(), s.getGPA());

        classroom.add(other);

    }

    // Remove student at index
    public void remove(int i){

        classroom.remove(i);

    }

    // Get GPA average

    public double getAverage(){
        
        double average = 0.0;

        for (int i = 0 ; i < classroom.size() ; i++){
            average += classroom.get(i).getGPA();
            average = average/classroom.size();
        }

        return average;
    }
    

}
