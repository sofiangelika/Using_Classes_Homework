package com.company;
import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {
        homework_1();
        homework_2();
        homework_3(args[0], args[1]);
    }

    //Homework 1:
    public static void homework_1() {
        for (int k = 0; k <= 10; k++) {
            double a = k * (Math.PI / 5);
            System.out.print(a + ", ");
            System.out.print(Math.sin(a) + ", ");
            System.out.println(Math.cos(a));
        }
    }

    //Homework 2:
    public static void homework_2() {
        boolean running = true;
        while (running) {
            String operation = input("give operation: ");
            if (operation.equals("end")) {
                running = false;
            }
            else {
                int a = inputInt("give first integer operand: ");
                int b = inputInt("give second integer operand: ");
                if (operation.equals("add"))
                    output(a + b);
                else if (operation.equals("sub"))
                    output(a - b);
                else
                    output("unknown operation");
            }
        }
    }

    //Homework 3:
    public static void homework_3(String first_command_line, String second_command_line) {
        if (second_command_line.length() < 2)
            System.exit(-1);
        boolean cutting = true;
        while (cutting) {
            int starting_cut = first_command_line.indexOf(second_command_line);
            if (starting_cut < 0)
                cutting = false;
            else {
                String before = first_command_line.substring(0, starting_cut);
                String after = first_command_line.substring(starting_cut + second_command_line.length());
                if (before.length() > 0)
                    System.out.println(before);
                first_command_line = after;
            }
        }
        if (first_command_line.length() > 0)
            System.out.println(first_command_line);
    }
}
