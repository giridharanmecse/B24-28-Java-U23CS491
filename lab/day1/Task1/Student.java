public class Student implements Comparable<Student>{
    Integer id;
    String name;
    Integer mark1;
    Integer mark2;
    Integer mark3;
    Integer total;

    public Student(Integer id,String name,Integer mark1,Integer mark2,Integer mark3){
        this.id = id;
        this.name= name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.total = mark1+mark2+mark3;
    }

    @Override
    public String toString(){
        return id+"  "+name;
    }

    public int compareTo(Student s){
        return this.total.compareTo(s.total);
    }
}