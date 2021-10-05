package lab1;

public class Student {
    private String Surname;
    private String Speciality;
    private int Year;
    private int Physic;
    private int Math;
    private int History;

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        this.Speciality = speciality;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year > 0 && year < 2022 ? year : 2021;
    }

    public int getPhysic() {
        return Physic;
    }

    public void setPhysic(int physic) {
        this.Physic = physic > 0 && physic < 6 ? physic : 1;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        this.Math = math > 0 && math < 6 ? math : 1;
    }

    public int getHistory() {
        return History;
    }

    public void setHistory(int history) {
        this.History = history > 0 && history < 6 ? history : 1;
    }

    @Override
    public String toString() {
        return
                "Фамилия: " + getSurname() + "\n" +
                        "Специальность: " + getSpeciality() + "\n" +
                        "Год поступления: " + getYear() + "\n" +
                        "Оценка по физике: " + getPhysic() + "\n" +
                        "Оценка по математике: " + getMath() + "\n" +
                        "Оценка по историе: " + getHistory();
    }
}

