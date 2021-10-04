package lab1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int chislo = 0;
        do {
            System.out.println("Выберите номер задания : 1) Легкий уровень 2) Средний уровень. Если вы хотите выйти введите 0.");
            chislo = num.nextInt();
            switch (chislo) {
                case 0:
                    break;
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                default:
                    System.out.println("Вы ввели не правильное число(Введите от 1-2). ");
                    break;
            }
        } while (chislo != 0);
    }

    public static void task1() {
        GregorianCalendar gcalendar = new GregorianCalendar();
        Scanner num = new Scanner(System.in);
        Scanner slovo = new Scanner(System.in);
        int count = 0;
        int countstudents = 0;
        System.out.print("Введите количество студентов: ");
        countstudents = num.nextInt();
        Student[] students = new Student[countstudents];
        for (int i = 0; i < countstudents; i++){
            students[i] = new Student();
            System.out.print("Введите фамилию: ");
            students[i].setSurname(slovo.nextLine());
            System.out.print("Введите специальность: ");
            students[i].setSpeciality(slovo.nextLine());
            System.out.print("Введите год поступления: ");
            students[i].setYear(num.nextInt());
            System.out.print("Введите оценку физику: ");
            students[i].setPhysic(num.nextInt());
            System.out.print("Введите оценку математику: ");
            students[i].setMath(num.nextInt());
            System.out.print("Введите оценку историю: ");
            students[i].setHistory(num.nextInt());
        }

        for(int j = 0; j< countstudents; j++) {
            if (students[j].getYear() <= gcalendar.get(Calendar.YEAR) - 3) {
                count++;
                System.out.println(students[j].toString());
            }
        }
        System.out.println("Студентов учашихся на 3 курсе и выше: " + count);
    }

    public static void task2(){
        Date date = new Date();
        Scanner num = new Scanner(System.in);
        Scanner slovo = new Scanner(System.in);
        int countworker = 0;
        System.out.print("Введите количество работников: ");
        countworker = num.nextInt();
        Worker[] worker = new Worker[countworker];
        for (int i = 0; i < countworker; i++){
            worker[i] = new Worker();
            System.out.print("Введите фамилию работника: ");
            worker[i].setSurname(slovo.nextLine());
            System.out.print("Введите должность работника: ");
            worker[i].setPosition(slovo.nextLine());
            System.out.print("Введите день подписания контракта: ");
            worker[i].setDay(num.nextInt());
            System.out.print("Введите месяц подписания контракта: ");
            worker[i].setMonth(num.nextInt());
            System.out.print("Введите год подписания контракта: ");
            worker[i].setYear(num.nextInt());
            System.out.print("Введите срок действия контракта: ");
            worker[i].setTerm(num.nextInt());
            System.out.print("Введите оклад: ");
            worker[i].setSalary(num.nextInt());

        }

        for(int j = 0; j< countworker; j++) {
            if ((worker[j].getYear() == date.getYear() + 1900) && (worker[j].getMonth() <= date.getMonth() + 1) && (worker[j].getDay() <= date.getDate())) {
                System.out.println(worker[j].toString());
            }
            else if ((worker[j].getYear() == date.getYear() + 1899) && (worker[j].getMonth()>= date.getMonth() + 1) && (worker[j].getDay() >= date.getDate())) {
                System.out.println(worker[j].toString());
            }
        }
    }
}
