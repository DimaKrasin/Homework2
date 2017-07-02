package com.goit.homework;

import java.util.Scanner;

public class Homework2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = sc.nextLine();
            System.out.print("Введите город проживания: ");
            String city = sc.nextLine();
            System.out.print("Введите Ваш возраст: ");
            int age = sc.nextInt();
            String tmp = sc.nextLine();
            System.out.print("Введите Ваше хобби: ");
            String hobby = sc.nextLine();

            System.out.println("Выберите вариант(число) вывода текста : \n1 - табличный\n2 - текстовый\n3 - иной");
            int chois = sc.nextInt();

            switch(chois){
                case 1: System.out.println("\nИмя: "+name+"\nГород: "+city+"\nВозраст: "+age+"\nХобби: "+hobby);
                break;
                case 2:System.out.println("Человек по имени "+name+" живет в городе "+city+"."+"\nЭтому человеку "+age+" лет и  любит он заниматься "+hobby+".");
                break;
                case 3: System.out.println( name+" - имя\n"+city+" - город\n"+ age + " - возраст\n" + hobby + " - хобби" );
                    default: System.out.println("Вы выбрали неправильное значение (число)");
            };
        }
    }


