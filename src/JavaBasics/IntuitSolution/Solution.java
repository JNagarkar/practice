package JavaBasics.IntuitSolution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by jaydatta on 9/16/16.
 * Print list of employee who are friends of department A, but themselves are not present in that department
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        List<Employee> listEmployees = solution.getEmployeeDetails();

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
        while ((line = br.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue;
            }
            StringTokenizer st = new StringTokenizer(line, ",");

                int id1 = Integer.parseInt(st.nextToken());
                int id2 = Integer.parseInt(st.nextToken());

                // Important step. List bydefault adds elements into 0th location as well
                employees.get(id1-1).friends.add(employees.get(id2-1));
                employees.get(id2-1).friends.add(employees.get(id1-1));



                System.out.println(id1+"M"+id2);
        }
    }
}
