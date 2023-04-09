package assignments.assignment12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    int id,year,age;
    double perTillDate;
    String name,gender,engDepartment;
    Student(int id,String name,int age,String gender,String engDepartment,int year,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.year=year;
        this.perTillDate=perTillDate;
    }
    public static String getGender(Student s){
        return s.gender;
    }
    public static int getAge(Student s){
        return s.age;
    }
    public static double getPerTillDate(Student s){
        return s.perTillDate;
    }
    public static String getDepartment(Student s){
        return s.engDepartment;
    }
}

public class Assignment {
    public void printAllDepartmentNames(ArrayList<Student> s){
        s.stream().map(p->p.engDepartment).distinct().forEach(System.out::println);

    }
    public void studentsEnrolledAfter2018(ArrayList<Student> s){
        s.stream().filter(p->p.year>2018).map(p->p.name).forEach(System.out::println);
    }
    public void allMalesInComputerScience(ArrayList<Student> s){
        Stream<Student> data=s.stream().filter(p->p.gender.equals("Male")).filter(p->p.engDepartment.equals("Computer Science"));
        data.forEach(e->System.out.println(e.id+" "+e.name+" "+e.age+" "+" "+e.gender+" "+e.engDepartment+" "+e.year+" "+e.perTillDate));
    }

    public void femalesAndMalesCount(ArrayList<Student> s){
        s.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting())).forEach((gender,count)-> System.out.println(gender+" "+count));
    }
    public void averageAgeOfMaleAndFemale(ArrayList<Student> s){
        s.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))).forEach((gender,age)-> System.out.println(gender+" "+age));
    }
    public void highestStudentDetails(ArrayList<Student> s) {
        Student e=s.stream().max(Comparator.comparingDouble(Student::getPerTillDate)).orElse(null);
        System.out.println(e.id+" "+e.name+" "+e.age+" "+" "+e.gender+" "+e.engDepartment+" "+e.year+" "+e.perTillDate);
    }
    public void numberOfStudentsInEachDepartment(ArrayList<Student> s){
        s.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())).forEach((department,count)-> System.out.println(department+" "+count));
    }
    public void averagePercentageOfDepartment(ArrayList<Student> s){
        s.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getPerTillDate))).forEach((department,percentage)-> System.out.println(department+" "+percentage));
    }
    public void detailsOfYoungestMale(ArrayList<Student> s){
        Student e=s.stream().filter(a->a.gender.equals("Male")&&a.engDepartment.equals("Electronic")).min(Comparator.comparingInt(Student::getAge)).orElse(null);
        System.out.println(e.id+" "+e.name+" "+e.age+" "+" "+e.gender+" "+e.engDepartment+" "+e.year+" "+e.perTillDate);
    }
    public void countOfMaleAndFemaleInComputerScience(ArrayList<Student> s){
        s.stream().filter(e->e.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())).forEach((gender,count)-> System.out.println(gender+" "+count));
    }
    public static void main(String[] args) {
        ArrayList<Student> studentData=new ArrayList<>();
        studentData.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentData.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentData.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentData.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentData.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentData.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentData.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentData.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentData.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentData.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentData.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentData.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentData.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentData.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentData.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentData.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentData.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        Assignment obj=new Assignment();
//        obj.printAllDepartmentNames(studentData);
//        obj.studentsEnrolledAfter2018(studentData);
//        obj.allMalesInComputerScience(studentData);
//        obj.femalesAndMalesCount(studentData);
//        obj.averageAgeOfMaleAndFemale(studentData);
//        obj.highestStudentDetails(studentData);
//        obj.numberOfStudentsInEachDepartment(studentData);
//        obj.averagePercentageOfDepartment(studentData);
//        obj.detailsOfYoungestMale(studentData);
//        obj.countOfMaleAndFemaleInComputerScience(studentData);
    }
}
