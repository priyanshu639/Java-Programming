public class Static {
    public static void main(String[] args){
        
        Student s1 =new Student();
        s1.Schoolname="jnv";

        Student s2 =new Student();
        s2.Schoolname="mnp";
        System.out.println(s2.Schoolname);
        System.out.println(s1.Schoolname);

        Student s3 =new Student();
        s3.Schoolname="abc";

    }
    
}

class Student{
    String name;
    int rollNo;

    static String Schoolname;

    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}
