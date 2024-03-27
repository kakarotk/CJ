public class student {
    student(String name, int roll){
        System.out.println("Student: "+ name+" RollNo: "+roll);
    }

    student(int roll, String Name){
        System.out.println("Roll No: "+roll+" Student: "+Name);
    }

    public static void main(String[] args) {
        student ab = new student("name",69);
        
        student bc= new student(69, "Name");


    }
}
