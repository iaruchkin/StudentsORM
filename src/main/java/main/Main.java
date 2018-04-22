package main;

import dbService.DBException;
import dbService.DBService;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        dbService.printConnectInfo();

        System.out.println("to add student type: 'add'\n" +
                "to delete student type: 'delete'\n" +
                "to print all student list type: 'print'");

        Scanner input = new Scanner(System.in);
        String command = input.next();

        try {
                if (command.equals("add")) {
                    System.out.println("name: ");
                    String name = input.next();
                    System.out.println("surname: ");
                    String surname = input.next();
                    System.out.println("midname: ");
                    String midname = input.next();
                    System.out.println("date of birth: ");
                    String birthdate = input.next();
                    System.out.println("group: ");
                    String group = input.next();
                    long userId = dbService.addStudent(name,
                            surname, midname,
                            birthdate, group);
                    System.out.println("Added student id: " + userId);
                } else if (command.equals("delete")) {
                    System.out.println("student id =");
                    Long studentId = new Long(input.next());
                    dbService.deleteStudent(studentId);
                } else if (command.equals("print")) {
                    Collection dataSet = dbService.getAllStudents();
                    System.out.println("All students: " + dataSet);
                }
        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
