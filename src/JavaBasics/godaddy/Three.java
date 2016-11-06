package JavaBasics.godaddy;

import JavaBasics.CollectionFramework.printingJob;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by jaydatta on 10/22/16.
 */
public class Three extends printingJob {

    public static void main(String[] args) {
        String inputString = "Frank ->Mary, Mary -> Sam, Mary ->Bob,Sam -> Katie,Sam ->Pete, Bob -> John, Bob, Katie";
        String[] relations = inputString.split(",");
        String firstEmp = null;
        String secondEmp = null;
        String[] current = new String[2];
        HashMap<String, Employee> employeeMap = new HashMap<>();

        for (int i = 0; i < relations.length; i++) {
                if (relations[i].contains("->")) {
                String[] relArray = relations[i].split("->");
                employeeMap.put(relArray[1].trim(), new Employee(relArray[1].trim(), relArray[0].trim()));
            } else {
                current[relations.length - (i + 1)] = relations[i];
            }
        }

        firstEmp = current[1].trim();
        secondEmp = current[0].trim();


        boolean result = true;

 /*       Iterator myIterator= employeeMap.entrySet().iterator();
        while(myIterator.hasNext()){
            Map.Entry me = (Map.Entry)myIterator.next();
            System.out.println(me.getKey()+"<-->"+me.getValue());
        }*/

        Employee employee1 = new Employee(firstEmp, employeeMap.get(firstEmp).manager);
        Employee employee2 = new Employee(secondEmp, employeeMap.get(secondEmp).manager);



        String copyFirst = firstEmp;
        String copySecond = secondEmp;



        while (employeeMap.containsKey(firstEmp)) {
         //   System.out.println(firstEmp + ":" + secondEmp);

            if (employeeMap.get(firstEmp).manager == employeeMap.get(secondEmp).manager) {
                System.out.println(employeeMap.get(firstEmp).manager);
                continue;
            } else if (employeeMap.get(firstEmp).name == employeeMap.get(secondEmp).manager) {
                System.out.println(employeeMap.get(firstEmp).name);
                continue;
            } else if (employeeMap.get(secondEmp).name == employeeMap.get(firstEmp).manager) {
                System.out.println(employeeMap.get(secondEmp).name);
                continue;
                }

            firstEmp = employeeMap.get(firstEmp).manager;
//            secondEmp = employeeMap.get(secondEmp).manager;
        }

        firstEmp = copyFirst;


        System.out.println("\n");
        while(employeeMap.containsKey(secondEmp)){
//            System.out.println(firstEmp + ":" + secondEmp);

            if (employeeMap.get(firstEmp).manager == employeeMap.get(secondEmp).manager) {
                System.out.println(employeeMap.get(firstEmp).manager);
                continue;
            } else if (employeeMap.get(firstEmp).name == employeeMap.get(secondEmp).manager) {
                System.out.println(employeeMap.get(firstEmp).name);
                continue;
            } else if (employeeMap.get(secondEmp).name == employeeMap.get(firstEmp).manager) {
                System.out.println(employeeMap.get(secondEmp).name);
                continue;
            }

//            firstEmp = employeeMap.get(firstEmp).manager;
            secondEmp = employeeMap.get(secondEmp).manager;
        }










//        String manager = findManager(employeeMap,firstEmp,secondEmp);
        //       System.out.println(manager);
    }

    private static String findManager(HashMap<String, Employee> employeeMap, String firstEmp, String secondEmp) {

        // employee 1 may be distant manager of 2
        // employee 1's manager may be distant manager of 2
        //


        System.out.println(firstEmp + ":" + secondEmp);
        if ((employeeMap.containsKey(firstEmp) && employeeMap.containsKey(firstEmp)) && employeeMap.get(firstEmp).manager == employeeMap.get(secondEmp).manager) {
            return employeeMap.get(firstEmp).manager;
        } else {
            return findManager(employeeMap, employeeMap.get(firstEmp).manager, employeeMap.get(secondEmp).manager);
        }
    }

}
