public class Student {

    String FirstName;
    String LastName;
    int YearOfGraduation;
    double GPA;
    String Major;

    public Student(String FirstName,
                   String LastName,
                   int YearOfGraduation,
                   double GPA,
                   String Major){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.YearOfGraduation=YearOfGraduation;
        this.GPA=GPA;
        this.Major=Major;

    }

    public void IncrementYearOfGraduation(){
        this.YearOfGraduation = this.YearOfGraduation +1;
    }


}
