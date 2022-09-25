import com.Employee;
import com.SortByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee();
        ArrayList<Employee>employees=new ArrayList<Employee>() ;
        employees.add(new Employee("Peter",23));
        employees.add(new Employee("Tom",27));
        employees.add(new Employee("Mary",18));
        employees.forEach(System.out::println);

        List<Employee>test=new ArrayList<>();
        test.add(new Employee("Christina",24));
        test.add(new Employee("John",31));

        employees.addAll(test);
        System.out.println("--- С применением метода (addAll) ---");
        employees.forEach(System.out::println);

        System.out.println("Под индексом 0 : "+employees.get(0));
        System.out.println("Размер коллекции : "+employees.size());
        System.out.println("Удалить добаленную коллекцию : "+employees.removeAll(test));
        System.out.println("Размер коллекции : "+ employees.size());
        employees.add(0,new Employee("Mike",33));

        System.out.println("----Сортировка по возрату----");
        Comparator<Employee> comparator = Comparator.comparing(obj -> obj.getAge());
//        Collections.sort(employees,new SortByAge());
        //Попробовала использовать компоратор двумя способами
        Collections.sort(employees,comparator);
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }



    }
}