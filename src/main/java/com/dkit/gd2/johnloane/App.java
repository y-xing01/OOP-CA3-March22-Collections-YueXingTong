package com.dkit.gd2.johnloane;

import java.util.*;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    public static void main( String[] args )
    {
        //Question 1a
        ArrayList<Student> studentList = questionOnePartA();
        System.out.println("Question 1 : ");
        for (Student s : studentList){
            System.out.println("Student ID : " + s.getId() + ", Student Name : " + s.getName() + ", Student Age : " + s.getAge());
        }
        System.out.println();

        //Question 1b
        System.out.println("Question 1b : ");
        questionOnePartB();
        System.out.println();

        //Question 1c
        System.out.println("Question 1c : ");
        questionOnePartC();
        System.out.println();

        //Question 1d
        System.out.println("Question 1d : ");
        questionOnePartD();
        System.out.println();

//

//        //Question 2
        System.out.println("Question 2a : ");
        HashMap<Integer, Employee> employeeHashMap = questionTwoPartA();
        System.out.println(employeeHashMap);
        System.out.println("The Lucky Winner is : " + pickLuckyWinner(employeeHashMap));
        System.out.println();

//        questionTwoPartB();
        System.out.println("Question 2b : ");
        List<Employee> employeeList = questionTwoPartB();
        for (Employee e : employeeList){
            System.out.println("Employee First Name : " + e.getFirstName() + ", Employee Last Name : " + e.getLastName());
        }
        System.out.println("Unique First Names");
        printUniqueNames(employeeList, "John");
        for (Employee e : employeeList){
            System.out.println("Employee First Name : " + e.getFirstName() + ", Employee Last Name : " + e.getLastName());
        }

//        questionTwoPartC();
        HashMap<Employee, Integer> employeeHashMap2 = new HashMap<>();
        employeeHashMap2.put(new Employee("John", "Doe"), 1);
        employeeHashMap2.put(new Employee("Michael", "San"), 2);
        employeeHashMap2.put(new Employee("Andrew", "Keal"), 3 );
        employeeHashMap2.put(new Employee("Jeremy", "Ann"), 4 );
        employeeHashMap2.put(new Employee("Serjs", "Bob"), 5);
//        HashMap<Employee,Integer> questionTwoPartC = printNameAndCount(employeeHashMap2);

//        questionTwoPartD();
//
//        //Question 3
//        List<String> oneHundredStrings = new ArrayList<>();
//        populateOneHundredStrings(oneHundredStrings);
//        questionThreePartA(oneHundredStrings);
//        questionThreePartB();
//
//        //Question 4
        System.out.println();
        compareTwoStudents();
        System.out.println(questionFourPartA());
        System.out.println(questionFourPartB());
//        questionFourPartC();
    }

    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }

    private static ArrayList<Student> questionOnePartA(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "John", 20));
        studentList.add(new Student(2, "Nathan", 18));
        studentList.add(new Student(3, "James", 22));
        studentList.add(new Student(4, "Andrew", 21));

        return studentList;
    }

    private static void questionOnePartB(){
        ArrayList<Student> studentList = questionOnePartA();
        Collections.sort(studentList, new nameComparator());
        for (Student s : studentList) {
            System.out.println("Student ID : " + s.getId() + ", Student Name : " + s.getName() + ", Student Age : " + s.getAge());
        }
    }

    private static void questionOnePartC(){
        ArrayList<Student> studentList = questionOnePartA();
        Collections.sort(studentList, new ageComparator());
        for (Student s : studentList) {
            System.out.println("Student ID : " + s.getId() + ", Student Name : " + s.getName() + ", Student Age : " + s.getAge());
        }
    }

    private static void questionOnePartD(){
        System.out.println("The time and space complexity of adding and sorting Students in the list is a O(1)");
    }

    private static HashMap<Integer, Employee> questionTwoPartA(){
        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put(1 ,new Employee("John", "Doe"));
        employeeHashMap.put(2, new Employee("Michael", "San"));
        employeeHashMap.put(3, new Employee("Andrew", "Keal"));
        employeeHashMap.put(4, new Employee("Jeremy", "Ann"));
        employeeHashMap.put(5, new Employee("Serjs", "Bob"));
        return employeeHashMap;
    }
    public static Employee pickLuckyWinner(HashMap<Integer,Employee> employees){
        Random rd = new Random();
        int size = employees.size();
        int luckyWinner = rd.nextInt(size) + 1;
        System.out.println("Lucky Number : " + luckyWinner);
        return employees.get(luckyWinner);
    }

    public static List questionTwoPartB(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Doe"));
        employeeList.add(new Employee("Michael", "San"));
        employeeList.add(new Employee("John", "Keal"));
        employeeList.add(new Employee("Jeremy", "Ann"));
        employeeList.add(new Employee("Serjs", "Bob"));
        return employeeList;
    }
    public static List printUniqueNames(List<Employee> employeeList, String uniqueNames) {
        boolean unique = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getFirstName() == uniqueNames) {
                unique = false;
                employeeList.remove(employeeList.get(i));
            }
        }
        return employeeList;
    }

//    public static HashMap<Employee, Integer> printNameAndCount(HashMap<Employee, Integer> nameAndCount) {
//        HashMap<Employee, Integer> nameCount = new HashMap<>();
//
//        for (Map.Entry m : nameAndCount.entrySet()) {
//            Employee name = Employee m.getValue();
//
//            if(nameCount.containsKey(name)){
//                nameCount.put(name, nameCount.get(name)+1);
//            }
//            else{
//                nameCount.put(name, 1);
//            }
//
//        }
//        return nameCount;
//    }

//    public static ArrayList<String> removeRepeat(List<String> oneHundredStrings){
//        ArrayList<String> nonDuplicate = new ArrayList<String>();
//        for(String text: oneHundredStrings){
//            if(!nonDuplicate.contains(text)){
//                nonDuplicate.add(text);
//            }
//        }
//        return nonDuplicate;
//    }
//
    public static String questionFourPartA(){
        return "Question 4A : Because the Student Class has no equals and hashcode methods";
    }
    public static String questionFourPartB(){
        return "Question 4B : Without the overriding hashcode method, it will treat every Object in the class as different";
    }
}
