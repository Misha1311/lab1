package lab1;

public class Worker {
    private String Surname;
    private String Position;
    private int Day;
    private int Month;
    private int Year;
    private int Term ;
    private int Salary;


    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        this.Day = day > 0 && day < 32 ? day : 1;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        this.Month = month > 0 && month < 13 ? month : 1;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year > 0 && year < 2022 ? year : 2021;
    }

    public int getTerm() {
        return Term;
    }

    public void setTerm(int term) {
        this.Term = term > 0 && term < 10 ? term : 1;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary > 1000 && salary < 100000 ? salary : 1000;
    }

    @Override
    public String toString() {
        return
                "Фамилия: " + Surname + "\n" +
                "Специальность: " + Position + "\n" +
                "Дата подписания контракта: " + Day + Month + Year + "\n" +
                "Срок действия контракта: " + Term + "\n" +
                "Оклад: " + Salary;
    }
}
