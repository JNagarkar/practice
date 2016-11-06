package src.JavaBasics;

/**
 * Created by jaydatta on 9/15/16.
 */
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Intuit {
    public static void main(String[] args) throws IOException {

        Intuit intuit = new Intuit();

        List<Employee> employees = intuit.getEmployeeDetails();

        // Now read the connection between the employees and populate the
        // friends list
        intuit.populateFriends(employees);

        intuit.printResult(employees);

    }

    private void printResult(List<Employee> employees) {

        for (Employee employee : employees) {
            System.out.print(employee.id + ": ");

            List<Employee> friends = employee.friends;
            if (friends.isEmpty()) {
                System.out.print("None");
            } else {
                int length = friends.size();
                int count = 1;
                for (Employee friend : friends) {
                    if(count == length) {
                        System.out.print(friend.id);
                    } else {
                        System.out.print(friend.id + ", ");
                    }
                    count++;

                }
                // System.out.println(friends);
            }

            System.out.println();
        }
    }

    private void populateFriends(List<Employee> employees) throws NumberFormatException, IOException {
        // BufferedReader br = new BufferedReader(new
        // InputStreamReader(System.in));

        BufferedReader br = new BufferedReader(
                new FileReader("friendships.csv"));
        String line = null;
        boolean firstLine = true;
        while ((line = br.readLine()) != null) {
            // ignore first line
            if (firstLine) {
                firstLine = false;
                continue;
            }

            StringTokenizer st = new StringTokenizer(line, ",");
            // read the employee details and create an employee instance
            int id1 = Integer.parseInt(st.nextToken());
            int id2 = Integer.parseInt(st.nextToken());

            employees.get(id1-1).friends.add(employees.get(id2-1));
            employees.get(id2-1).friends.add(employees.get(id1-1));
        }

    }

    private List<Employee> getEmployeeDetails() throws IOException {
        String line = null;
        // BufferedReader br = new BufferedReader(new
        // InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("employees.csv"));
        ArrayList<Employee> employees = new ArrayList<Employee>();
        boolean firstLine = true;
        while ((line = br.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue;
            }

            StringTokenizer st = new StringTokenizer(line, ",");

            // read the employee details and create an employee instance
            int id = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String department = st.nextToken();
            employees.add(new Employee(id, name, department));
        }
        return employees;

    }

}

class Employee {
    int id;
    String name;
    String department;
    List<Employee> friends;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.friends = new ArrayList<Employee>();
    }
}