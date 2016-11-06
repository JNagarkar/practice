package src.JavaBasics.IntuitSolution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by jaydatta on 9/16/16.
 * Print list of employee who are friends of department A, but themselves are not present in that department
 */

public class ChangedInputSolution {
    public static void main(String[] args) throws IOException {
        ChangedInputSolution solution = new ChangedInputSolution();

        List<Employee> listEmployees = solution.getEmployeeDetails();

        System.out.println("populating friends");
        solution.populateFriends(listEmployees);
        solution.printRelations(listEmployees);
    }

    public static void printRelations(List<Employee> employees) {

        for (Employee employee : employees) {
            System.out.print(employee.employee_id + ":");
            List<Employee> friends = employee.friends;
            int count = friends.size();
            for (Employee currentFriends : friends) {
                if (count != 0) {
                    System.out.print(currentFriends.employee_id + ",");
                } else {
                    System.out.print(currentFriends.employee_id);
                }
                count--;
            }
            System.out.print("\n");

        }

    }

    public static List getEmployeeDetails() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        ArrayList<Employee> employees = new ArrayList<>();
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


//            employees.add(id,name,department);
            employees.add(new Employee(id, name, department));


        }


        return employees;
    }

    public void populateFriends(List<Employee> employees) throws NumberFormatException,IOException {



        BufferedReader br = new BufferedReader(new FileReader("friendships.csv"));
        boolean firstLine = true;
        String line = null;

        ArrayList<Integer> friend1  = new ArrayList<>();
        friend1.add(1);
        friend1.add(1);
        friend1.add(2);
        friend1.add(3);
        friend1.add(6);
        friend1.add(6);
        friend1.add(6);        friend1.add(7);
        friend1.add(7);
        friend1.add(8);
        friend1.add(8);


        ArrayList<Integer> friend2  = new ArrayList<>();
        friend2.add(2);
        friend2.add(3);
        friend2.add(4);
        friend2.add(6);
        friend2.add(7);
        friend2.add(8);
        friend2.add(9);
        friend2.add(1);
        friend2.add(2);
        friend2.add(3);
        friend2.add(9);





        int u=0;
        while (u < friend1.size()) {


            int id1 = friend1.get(u);
            int id2 = friend2.get(u);

            // Important step. List bydefault adds elements into 0th location as well

            // these are id's of the objects actually

            employees.get(id1-1).friends.add(employees.get(id2-1));
            employees.get(id2-1).friends.add(employees.get(id1-1));


            System.out.println(id1+"M"+id2);

            u++;
        }
    }

}




