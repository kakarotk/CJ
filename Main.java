class Base {
    void showme() {
        System.out.println("Base class method");
    }
}

class Child extends Base {
    void showme() {
        System.out.println("Child class method");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showme();
    }
}
