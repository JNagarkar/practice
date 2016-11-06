package JavaBasics.IntuitSolution.second;

/**
 * Created by jaydatta on 9/28/16.
 */


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args){

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

        Solution intuit = new Solution();

        HashMap<Integer,Employee> employeesHmap = intuit.getEmployeeDetails(employees,friendships,new ArrayList<Employee>());

        // Now read the connection between the employees and populate the
        // friends list
        intuit.populateFriends(employeesHmap,friendships);



        intuit.printResult(employeesHmap);

    }
      private void printResult(HashMap<Integer,Employee> employeesHmap) {



          Iterator myIterator= employeesHmap.entrySet().iterator();

          while(myIterator.hasNext()){
              Map.Entry me = (Map.Entry)myIterator.next();
              Employee employee = (Employee) me.getValue();

              List<Employee> friends = employee.friends;
              int count = friends.size();

              System.out.print(me.getKey()+":");
              for (Employee currentFriends : friends) {
                  if (count != 0) {
                      System.out.print(currentFriends.id + ",");
                  } else {
                      System.out.print(currentFriends.id);
                  }
                  count--;
              }

              System.out.println("\t");

          }



      }

    private void populateFriends(HashMap<Integer,Employee> hmap, String[] friendships){

        int counter=0;
        while (counter < friendships.length) {
            // ignore first line



            StringTokenizer st = new StringTokenizer(friendships[counter], ",");
            // read the employee details and create an employee instance
            int id1 = Integer.parseInt(st.nextToken());
            int id2 = Integer.parseInt(st.nextToken());

            hmap.get(id1).friends.add(new Employee(id2,hmap.get(id2).name,hmap.get(id2).department));
            hmap.get(id2).friends.add(new Employee(id1,hmap.get(id1).name,hmap.get(id1).department));
            counter++;
        }

    }

    private HashMap<Integer,Employee> getEmployeeDetails(String[] employeesArray,String[] friendships,
                                                         ArrayList<Employee> employees){
        String line = null;
        // BufferedReader br = new BufferedReader(new
        // InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(
        //       new FileReader("C:\\workspace\\InterviewPractice\\src\\testcode\\employees.csv"));


        HashMap<Integer,Employee>  hmap = new HashMap<Integer,Employee>();

        employees = new ArrayList<Employee>();
        boolean firstLine = true;

        int counter = 0;

        while (counter < employeesArray.length) {


            StringTokenizer st = new StringTokenizer(employeesArray[counter], ",");

            // read the employee details and create an employee instance
            int id = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String department = st.nextToken();

            employees.add(new Employee(id,name,department));
            hmap.put(id, new Employee(id,name,department));
            counter++;
        }
        return hmap;

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
