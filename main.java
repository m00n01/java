class main{
    public static void main(String[] args){

        // Create students

        student daniel = new student("Daniel", 12, 1.86);
        student melissa = new student("Melissa", 12, 3.68);
        student tiffany = new student("Tiffany", 12, 3.98);
        student vincent = new student("Vincent", 12, 4.02);

        classroom myClass = new classroom();

        myClass.add(daniel);
        myClass.add(melissa);
        myClass.add(tiffany);
        myClass.add(vincent);

        myClass.getClassSize();

        System.out.println(myClass.getStudent("Daniel"));
        System.out.println(myClass.getStudent("Vincent"));
        System.out.println(myClass.getStudent("Mary"));
        
        System.out.println(myClass.getAverage());

    }
}