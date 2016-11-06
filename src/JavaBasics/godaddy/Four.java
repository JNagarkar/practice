package src.JavaBasics.godaddy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jaydatta on 10/22/16.
 */
public class Four {

    public static void main(String[] args) {

//        String inputString = "Frank ->Mary, Mary -> Sam, Mary ->Bob,Sam -> Katie,Sam ->Pete, Bob -> John, Bob, Katie";
        String inputString = "Sam -> Pete,   Pete  -> Nancy, Sam -> Katie, Mary -> Bob, Frank -> Mary, Mary -> Sam, Bob -> John, Frank,Sam";

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

        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();
        boolean managerExists = true;

        String firstEmployee = firstEmp;
        String secondEmployee = secondEmp;
        while (managerExists) {
            if (employeeMap.containsKey(firstEmployee           )) {
                firstEmployee = employeeMap.get(firstEmployee).manager;
                firstList.add(firstEmployee);
            }
            if (employeeMap.containsKey(secondEmployee)) {
                secondEmployee = employeeMap.get(secondEmployee).manager;
                secondList.add(secondEmployee);
            }
            if (!(employeeMap.containsKey(firstEmployee)) && !(employeeMap.containsKey(secondEmployee))) {

                firstList.add(firstEmployee);
                secondList.add(secondEmployee);
                managerExists = false;
            }
        }

        int firstSize = firstList.size()-1;
        int secondSize = secondList.size()-1;
        boolean searchingManager = true;

        while (searchingManager) {
            System.out.println(firstSize+":"+secondSize);
            if (firstSize > -1 && secondSize > -1  && firstList.get(firstSize).equals(secondList.get(secondSize))) {

                --firstSize;
                --secondSize;
            } else {
                System.out.println(firstList.get(firstSize+1));
                searchingManager = false;
            }
        }
    }
}
