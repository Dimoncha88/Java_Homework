package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();
        notebook1.name = "Asus";
        notebook1.size = "15.6";
        notebook1.processor = "i5";
        notebook1.color = "Черный";
        notebook1.ram = "8";
        notebook1.price = "40000";

        Notebook notebook2 = new Notebook();
        notebook2.name = "Aser";
        notebook2.size = "15.6";
        notebook2.processor = "i3";
        notebook2.color = "Черный";
        notebook2.ram = "4";
        notebook2.price = "35000";

        Notebook notebook3 = new Notebook();
        notebook3.name = "Apple";
        notebook3.size = "13.6";
        notebook3.processor = "M1";
        notebook3.color = "Серебро";
        notebook3.ram = "8";
        notebook3.price = "80000";

        Notebook notebook4 = new Notebook();
        notebook4.name = "Lenovo";
        notebook4.size = "16";
        notebook4.processor = "AMD";
        notebook4.color = "Белый";
        notebook4.ram = "4";
        notebook4.price = "45000";

     /*   System.out.println(notebook1);
        System.out.println(notebook2);
        System.out.println(notebook3);
        System.out.println(notebook4);*/

        List<Notebook> list1 = new ArrayList<>();
        list1.add(notebook1);
        list1.add(notebook2);
        list1.add(notebook3);
        list1.add(notebook4);
        System.out.println(list1);


        Scanner enter = new Scanner(System.in);
        System.out.printf("Введите параметр ноутбука (производитель, " +
                "размер экрана, цвет, оперативная память(в ГБ)): ");
        String parametr = enter.nextLine();
        for (Notebook element : list1) {
            if (element.getName().equalsIgnoreCase(parametr) ||
                    element.getSize().equalsIgnoreCase(parametr) ||
                    element.getColor().equalsIgnoreCase(parametr) ||
                    element.getRam().equalsIgnoreCase(parametr))
                System.out.println(element.notebookInfo());
        }
    }
}


