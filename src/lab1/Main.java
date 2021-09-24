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
            System.out.println("Выберите номер задания :1) Легкий уровень 2) Средний уровень. Если вы хотите выйти введите 0.");
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
        int countstudent = 0;
        System.out.print("Введите количество студентов: ");
        countstudent = num.nextInt();
        Person[] person = new Person[countstudent];
        for (int i = 0; i < countstudent; i++){
            person[i] = new Person();
            System.out.print("Введите фамилию: ");
            person[i].Surname = slovo.nextLine();
            System.out.print("Введите специальность: ");
            person[i].Speciality = slovo.nextLine();
            System.out.print("Введите год поступления: ");
            person[i].Year = num.nextInt();
            System.out.print("Введите физику: ");
            person[i].Physic = num.nextInt();
            System.out.print("Введите математику: ");
            person[i].Math = num.nextInt();
            System.out.print("Введите историю: ");
            person[i].History = num.nextInt();
        }

        for(int j = 0; j< countstudent; j++) {
            if (person[j].Year <= gcalendar.get(Calendar.YEAR) - 3) {
                count++;
                System.out.println("Фамилия: " + person[j].Surname);
                System.out.println("Специальность: " + person[j].Speciality);
                System.out.println("Год поступления: " + person[j].Year);
                System.out.println("Оценка по физике: " + person[j].Physic);
                System.out.println("Оценка по математике: " + person[j].Math);
                System.out.println("Оценка по историе: " + person[j].History);
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
            worker[i].Surname = slovo.nextLine();
            System.out.print("Введите должность работника: ");
            worker[i].Position = slovo.nextLine();
            System.out.print("Введите день подписания контракта: ");
            worker[i].Day = num.nextInt();
            System.out.print("Введите месяц подписания контракта: ");
            worker[i].Month = num.nextInt();
            System.out.print("Введите год подписания контракта: ");
            worker[i].Year = num.nextInt();
            System.out.print("Введите срок действия контракта: ");
            worker[i].Term = num.nextInt();
            System.out.print("Введите оклад: ");
            worker[i].Salary = num.nextInt();

        }

        for(int j = 0; j< countworker; j++) {
            if ((worker[j].Year == date.getYear() + 1900) && (worker[j].Month <= date.getMonth() + 1) && (worker[j].Day <= date.getDate())) {
                System.out.println("Фамилия: " + worker[j].Surname);
                System.out.println("Специальность: " + worker[j].Position);
                System.out.println("Дата подписания контракта: " + worker[j].Day + " " + worker[j].Month + " " + worker[j].Year);
                System.out.println("Срок действия контракта: " + worker[j].Term);
                System.out.println("Оклад: " + worker[j].Salary);
            }
            else if ((worker[j].Year == date.getYear() + 1899) && (worker[j] .Month>= date.getMonth() + 1) && (worker[j].Day >= date.getDate())) {
                System.out.println("Фамилия: " + worker[j].Surname);
                System.out.println("Специальность: " + worker[j].Position);
                System.out.println("Дата подписания контракта: " + worker[j].Day + " " + worker[j].Month + " " + worker[j].Year);
                System.out.println("Срок действия контракта: " + worker[j].Term);
                System.out.println("Оклад: " + worker[j].Salary);
            }
        }
    }
}
