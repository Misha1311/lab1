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
        Person person = new Person();
        Scanner num = new Scanner(System.in);
        Scanner slovo = new Scanner(System.in);
        int count = 0;
        int countstudent = 0;
        System.out.print("Введите количество студентов: ");
        countstudent = num.nextInt();
        for (int i = 0; i < countstudent; i++){
            System.out.print("Введите фамилию: ");
            person.Surname[i] = slovo.nextLine();
            System.out.print("Введите специальность: ");
            person.Speciality[i] = slovo.nextLine();
            System.out.print("Введите год поступления: ");
            person.Year[i] = num.nextInt();
            System.out.print("Введите физику: ");
            person.Physic[i] = num.nextInt();
            System.out.print("Введите математику: ");
            person.Math[i] = num.nextInt();
            System.out.print("Введите историю: ");
            person.History[i] = num.nextInt();
        }

        for(int j = 0; j< countstudent; j++) {
            if (person.Year[j] <= gcalendar.get(Calendar.YEAR) - 3) {
                count++;
                System.out.println("Фамилия: " + person.Surname[j]);
                System.out.println("Специальность: " + person.Speciality[j]);
                System.out.println("Год поступления: " + person.Year[j]);
                System.out.println("Оценка по физике: " + person.Physic[j]);
                System.out.println("Оценка по математике: " + person.Math[j]);
                System.out.println("Оценка по историе: " + person.History[j]);
            }
        }
        System.out.println("Студентов учашихся на 3 курсе и выше: " + count);
    }

    public static void task2(){
        Date date = new Date();
        Worker worker = new Worker();
        Scanner num = new Scanner(System.in);
        Scanner slovo = new Scanner(System.in);
        int countworker = 0;
        System.out.print("Введите количество работников: ");
        countworker = num.nextInt();
        for (int i = 0; i < countworker; i++){
            System.out.print("Введите фамилию работника: ");
            worker.Surname[i] = slovo.nextLine();
            System.out.print("Введите должность работника: ");
            worker.Position[i] = slovo.nextLine();
            System.out.print("Введите день подписания контракта: ");
            worker.Day[i] = num.nextInt();
            System.out.print("Введите месяц подписания контракта: ");
            worker.Month[i] = num.nextInt();
            System.out.print("Введите год подписания контракта: ");
            worker.Year[i] = num.nextInt();
            System.out.print("Введите срок действия контракта: ");
            worker.Term[i] = num.nextInt();
            System.out.print("Введите оклад: ");
            worker.Salary[i] = num.nextInt();

        }

        for(int j = 0; j< countworker; j++) {
            if ((worker.Year[j] == date.getYear() + 1900) && (worker.Month[j] <= date.getMonth() + 1) && (worker.Day[j] <= date.getDate())) {
                System.out.println("Фамилия: " + worker.Surname[j]);
                System.out.println("Специальность: " + worker.Position[j]);
                System.out.println("Дата подписания контракта: " + worker.Day[j] + " " + worker.Month[j] + " " + worker.Year[j]);
                System.out.println("Срок действия контракта: " + worker.Term[j]);
                System.out.println("Оклад: " + worker.Salary[j]);
            }
            if ((worker.Year[j] == date.getYear() + 1899) && (worker.Month[j] >= date.getMonth() + 1) && (worker.Day[j] >= date.getDate())) {
                System.out.println("Фамилия: " + worker.Surname[j]);
                System.out.println("Специальность: " + worker.Position[j]);
                System.out.println("Дата подписания контракта: " + worker.Day[j] + " " + worker.Month[j] + " " + worker.Year[j]);
                System.out.println("Срок действия контракта: " + worker.Term[j]);
                System.out.println("Оклад: " + worker.Salary[j]);
            }
        }
    }
}
