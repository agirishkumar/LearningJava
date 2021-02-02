public class EmployeeSalary {

    public static double SalaryCalculator(double HoursPerWeek, double AmountPerHour, int  VacationDays){
        if(HoursPerWeek<0){
            return -1;
        }

        if(AmountPerHour<0){
            return -1;
        }
        double WeeklyPayCheck = HoursPerWeek*AmountPerHour;
        double UnpaidAmount = VacationDays*8*AmountPerHour;
        return (WeeklyPayCheck*52)-UnpaidAmount;
    }


    public static void main(String[] args) {
        double Salary = SalaryCalculator(-2,10,4);
        System.out.println(Salary);
    }
}
