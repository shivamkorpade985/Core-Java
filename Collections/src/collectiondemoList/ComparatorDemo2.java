package collectiondemoList;

import java.util.Comparator;
import java.util.TreeSet;

class Employee1 implements Comparator {
    private int id;
    private String name;
    private int sal;
     Employee1(){}

    Employee1(int id, String name,int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public int getsal() {
        return sal;
    }

    public void setsal(int sal) {
        this.sal = sal;
    }
    @Override
    public int compare(Object o1, Object o2) {
         Employee1 e1 = (Employee1) o1;
         Employee1 e2 = (Employee1) o2;

         if(e1.getsal() > e2.getsal()){
            return 1;

         }
         else if (e1.getsal() < e2.getsal()){
             return -1;
        }
         else{
             return 0;
        }
    }

}
public class ComparatorDemo2 {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(1,"Shivam",10000);
        Employee1 emp2 = new Employee1(7,"Soham",50000);
        Employee1 emp3 = new Employee1(15,"Prasad",23847);
        Employee1 emp4 = new Employee1(10,"Advait",45795);
        Employee1 emp5 = new Employee1(3,"Samrat",89542);

        TreeSet<Employee1> ts = new TreeSet<>(new Employee1());

        ts.add(emp1);
        ts.add(emp2);
        ts.add(emp3);
        ts.add(emp4);
        ts.add(emp5);

        System.out.println(ts);
    }
}
