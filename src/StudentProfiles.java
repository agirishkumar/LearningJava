public class StudentProfiles {

    public static void main(String[] args) {
        Student student1 = new Student("Girish","kumar",2020,8.5,"ECE");
        Student student2 = new Student("Sirish","kumar",2021,9.5,"ECM");

        student2.IncrementYearOfGraduation();
        System.out.println(student2.YearOfGraduation);


    }

}
