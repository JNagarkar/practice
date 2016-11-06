package src.JavaBasics.IntuitSolution.Third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by jaydatta on 9/16/16.
 * Print list of employee who are friends of department A, but themselves are not present in that department
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        String[] employees = {
                "101,Richard,Engineering",
                "2357,Erlich,HR",
                "3709,Monica,Business",
                "4564,Dinesh,Engineering",
                "6098,Carla,Engineering"
        };

        String[] friendships = {
                "101,2357",
                "101,3709",
                "2357,4564"
        };



        HashMap<Integer,Employee> listEmployees = solution.getEmployeeDetails();

        solution.populateFriends(listEmployees);
        solution.printRelations(listEmployees);
    }

    public static void printRelations(HashMap<Integer,Employee> employeesList) {

        Iterator it = employeesList.entrySet().iterator();

       while(it.hasNext()){
           Map.Entry me = (Map.Entry)it.next();

           Employee employee = (Employee) me.getValue();
           System.out.print(me.getKey());
           for(Employee employeesItem: employee.friends ){
               System.out.print(employeesItem.employee_id+",");
           }
           System.out.println("\t");

       }

    }

    public static HashMap<Integer,Employee> getEmployeeDetails() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));


        HashMap<Integer,Employee> employeeList = new HashMap<>();


        boolean firstLine = true;
        String line = null;
        while ((line = br.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue;
            }

            StringTokenizer st = new StringTokenizer(line, ",");
            //System.out.println(st);
            int id = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String department = st.nextToken();


            employeeList.put(id,new Employee(id,name,department));

        }


        return employeeList;
    }

    public void populateFriends(HashMap<Integer,Employee> employeesList) throws NumberFormatException,IOException {
        BufferedReader br = new BufferedReader(new FileReader("friendships.csv"));
        boolean firstLine = true;
        String line = null;
        while ((line = br.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue;
            }
            StringTokenizer st = new StringTokenizer(line, ",");

                int id1 = Integer.parseInt(st.nextToken());
                int id2 = Integer.parseInt(st.nextToken());

                // Important step. List bydefault adds elements into 0th location as well

                employeesList.get(id1).friends.add(new Employee(employeesList.get(id2).employee_id,employeesList.get(id2).name,employeesList.get(id2).department));
                employeesList.get(id2).friends.add(new Employee(employeesList.get(id1).employee_id,employeesList.get(id1).name,employeesList.get(id1).department));
        }
    }
}
