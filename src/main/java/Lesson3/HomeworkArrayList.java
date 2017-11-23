package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class HomeworkArrayList {

    public static void main(String[] args){
        //Формируется коллекция из строк типа ArrayList
        ArrayList<String> collection = new ArrayList<String>();
        collection.add("Audi");
        collection.add("Lexus");
        collection.add("BMW");
        collection.add("KIA");
        collection.add("Porsche");

        //Из коллекции удаляется одно из значений
        collection.remove("KIA");

        //Проверка, что коллекция больше не содержит удаленный объект (результат проверки выводится в консоль)
        boolean checkObject = collection.contains("KIA");
        if (checkObject==true) {
            System.out.println("Коллекция содержит удаленный объект 'KIA'");
        } else
            System.out.println("Коллекция не содержит удаленный объект 'KIA'");

        ArrayList<String> unsortedCollection = new ArrayList<String>();
        unsortedCollection.addAll(collection);

        //Выполняется сортировка объектов коллекции
        Collections.sort(collection);

        //Поочередный вывод строк в консоль до сортировки
        Iterator<String> itr = unsortedCollection.iterator();
        System.out.println("Строки коллекции до сортировки:");
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        //Поочередный вывод строк в консоль после сортировки
        Iterator<String> itr2 = collection.iterator();
        System.out.println("Строки коллекции после сортировки:");
        while (itr2.hasNext()) {
            String element2 = itr2.next();
            System.out.println(element2);
        }
    }
}
