public class practice {
    int roll_no;
    String Name;
    static String college_name="TTS";

    static void change(){
        college_name="L.S.Raheja";
    }

    practice(int r, String s ){
        roll_no=r;
        Name= s;
    }

    void disp(){
        System.out.println("Name: "+Name+" Roll_NO: "+roll_no+" College: "+ college_name);
    }

    public static void main(String[] args) {
        practice.change();
        practice s1 = new practice(69, "Bro");

        s1.disp();
    }
}
