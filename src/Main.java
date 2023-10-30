import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Задача1 возраст совершеннолетия
        int age = 24;
        if (age>=18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача2 надеть ли шапку?
        int temperature=-2;
        if(temperature>=5){
            System.out.println("На улице "+temperature+" градусов можно идти без шапки");
        } else {
            System.out.println("На улице "+temperature+" градусов,нужно надеть шапку");
        }

        //Задача3 Превышение скорости
        int speed=0;
        if (speed<=60){
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " +speed+", то придется заплатить штраф");
        }

        //Задача4 куда отправить по возрасту
        int ageGo = 34;
        if (ageGo>=2 && ageGo<=6) {
            System.out.println("Если возраст человека равен "+ageGo+", то ему нужно ходить в садик");
        } if (ageGo>6 && ageGo<=17){
            System.out.println("Если возраст человека равен "+ageGo+", то ему нужно ходить в школу");
        } if (ageGo>=18 && ageGo<=24){
            System.out.println("Если возраст человека равен "+ageGo+", то ему нужно ходить в университет");
        } if (ageGo>24) {
            System.out.println("Если возраст человека равен "+ageGo+", то ему нужно ходить на работу");
        }

        //Задача5 Ограничение по возрасту
        int ageAttraction = 4;
        if (ageAttraction<=5){
            System.out.println("Если возраст ребенка равен "+ageAttraction+", то ему нельзя кататься на аттракционе");
        } if (ageAttraction>5 && ageAttraction<=14){
            System.out.println("Если возраст ребенка равен "+ageAttraction+", то ему можно кататься на аттракционе в сопровождении");
        } if (ageAttraction>14) {
            System.out.println("Если возраст ребенка равен "+ageAttraction+", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //Задача6 Насколько забит вагон
        int passenger=10;
        int capacityCoach=102;
        int seatingArea= 60;
        boolean capacity = capacityCoach>=passenger;
        if (capacity) {
            System.out.printf("Есть место. ");
            if (passenger<=seatingArea) {
                System.out.println("Место сидячее");
            } else {
                System.out.println("Есть стоячее место");
            }
        } else {
            System.out.println("Вагон переполнен");
        }

        //Задача7 Какое из трех чисел больше?
        int one=5;
        int two=4;
        int three=3;
        if (one-two>0 && one-three>0) {
            System.out.println("Большеe "+one);
        } else {
            if (two-one>0 && two-three>0) {
                System.out.println("Большеe "+two);
            } else {
                System.out.println("Большеe "+three);
            }
    }}
}