import java.util.Scanner;


class Calculator_massiv {
    public static void main(String[] args) {
        Scanner razmer = new Scanner(System.in);
        System.out.println("Выберети действие: 1 -использовать калькулятор; 2-использовать массив");
        int vibor1 = razmer.nextInt();
        if (vibor1 == 1) {
            System.out.println("вы выбрали работу с калькулятором");
            {
                System.out.println("Выберете действие: 1 - Сложение(+), 2 - Вычитание(-), 3 - Умножение(*), 4 - Деление(/)");
                int choose = razmer.nextInt();
                if(choose>4){

                    System.out.println("Нет такой операции, выберете другое действие");
                }
                else {

                    System.out.println("Введите первое число ");
                    double i = razmer.nextDouble();
                    System.out.println("Введите второе число");
                    double b = razmer.nextDouble();
                    switch (choose) {
                        case 1:
                            System.out.println("Вы выбрали сложение!");
                            double d = i + b;
                            System.out.printf("Сумма = %.4f", d);
                            break;
                        case 2:
                            System.out.println("Вы выбрали вычитание!");
                            double d1 = i - b;
                            // Округляем переменную d до 4х знаков после запятой
                            System.out.printf("Разность = %.4f", d1);
                            break;
                        case 3:
                            System.out.println("Вы выбрали умножение!");
                            double d2 = i * b;
                            System.out.printf("Произведение = %.4f", d2);
                            break;
                        case 4:
                            System.out.println("Вы выбрали деление!");
                            double d3 = i / b;
                            System.out.printf("Частное = %.4f", d3);
                            break;

                    }
                }
            }
            razmer.close();
        }
        else if (vibor1 == 2) {
            System.out.println("Вы выбрали работу с массивом ");
            System.out.println("Введите количество элементов массива:");
            int razmer1 = razmer.nextInt();
            String[] MyMassiv = new String[razmer1];
            for (int i = 0; i < razmer1; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива:");
                String slovo1 = razmer.next();
                MyMassiv[i] = slovo1;
            }
            System.out.print(" Введенный массив: ");
            for (int i = 0; i < razmer1; i++) {
                System.out.print(" " + MyMassiv[i] + " ");
            }
            System.out.println("");
            String MaxA = MyMassiv[0];
            int max = MaxA.length();
            for (int i = 1; i < MyMassiv.length; i++) {
                if (max < MyMassiv[i].length()) {
                    max = MyMassiv[i].length();
                }
            }
            System.out.print("Самое длинное слово в массиве: ");
            for (int j = 0; j < MyMassiv.length; j++) {
                if (max == MyMassiv[j].length()) {
                    System.out.print(" " + MyMassiv[j]);
                }
            }
        }
    }
}
