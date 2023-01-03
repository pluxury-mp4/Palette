

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Введите размер палитры (=0 выход): ");

        Palette palette = new Palette();
        palette.drop();                     //Выход из программы при вводе 0
        palette.getInfo();                  //Вывод строки "Содержание палитры"
        palette.getPalette();               //Вывод двумерного массива (Палитры)
        while (true) {                      //Бесконечный цикл
            test();                         //Вывод возможных комманд

            Scanner sc = new Scanner(System.in);  //Ввод данных с клавиатуры
            String letter = sc.nextLine();

            if (letter.equalsIgnoreCase("Q")) {      //Выход при нажатии Q
                System.exit(0);
            }

            if (letter.equalsIgnoreCase("R")){ // Перевод в другой формат
                palette.perevod();
            }

            if (letter.equalsIgnoreCase("P")) {      //Печать всей палитры при нажатии P
                palette.getInfo();
                palette.getPalette();
            }


            if (letter.equalsIgnoreCase("F")) {      //Заполнение палитры случайными числами
                palette.getInfo();
                palette.getRandom();}

            if (letter.equalsIgnoreCase("M")){       //Изменение цвета в палитре
                palette.getCollor();

                choice();

                Scanner scanner = new Scanner(System.in);       //Ввод данных с клавиатуры
                String choiseColor = sc.nextLine();

                    if (choiseColor.equalsIgnoreCase("P")){ //Печать всей палитры при нажатии P
                    palette.getInfo();
                    palette.getPalette();
                }
                    if (choiseColor.equalsIgnoreCase("R")){ //Изменение красного элемента
                        palette.getRed();
                    }

                    if (choiseColor.equalsIgnoreCase("G")){ //Изменение зеленого элемента
                        palette.getGreen();
                    }

                    if (choiseColor.equalsIgnoreCase("B")){ //Изменение синего элемента
                        palette.getBlue();
                    }


                    if (choiseColor.equalsIgnoreCase("F")){ // Заполнение случайными значениями
                        palette.getInfo();
                        palette.getRandom();
                    }

                    if (choiseColor.equalsIgnoreCase("Q")){ //Выход из программы
                        System.exit(0);
                    }



            }

        }

    }



    public static void test(){
        System.out.println("(P) Печать всей палитры");
        System.out.println("(M) Изменение цвета в палитре");
        System.out.println("(F) Заполнения палитры случайными значениями");
        System.out.println("(R) Перевод цвета в формат YUV");
        System.out.println("(Q) Выход");
        System.out.println();
        System.out.print("Выберите пункт: ");
    }

    public static void choice(){
        System.out.println("(P) Печать всех компонент");
        System.out.println("(R) Изменение красной компоненты");
        System.out.println("(G) Изменение зеленой компоненты");
        System.out.println("(B) Изменение синей компоненты");
        System.out.println("(F) Заполнение случайными значениями");
        System.out.println("(Q) Выход");
        System.out.println();
        System.out.println("Выберите пункт: ");

    }

}
