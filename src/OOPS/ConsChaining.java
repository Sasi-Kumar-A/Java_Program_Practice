package OOPS;

class Aa{
    String name;
    int age;
    long phoneNo;

    Aa(String name, int age, long phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone No: " + phoneNo);
    }
}
class B extends Aa {
    String address;

    B(String name, int age, long phoneNo, String address) {
        super(name, age, phoneNo);
        this.address = address;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Address: " + address);
    }
}

class C extends B {
    String email;

    C(String name, int age, long phoneNo, String address, String email) {
        super(name, age, phoneNo, address);
        this.email = email;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Email: " + email);
    }
}

class D extends C {
    String occupation;

    D(String name, int age, long phoneNo, String address, String email, String occupation) {
        super(name, age, phoneNo, address, email);
        this.occupation = occupation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Occupation: " + occupation);
    }
}

class E extends D {
    E(String name, int age, long phoneNo, String address, String email, String occupation) {
        super(name, age, phoneNo, address, email, occupation);
        System.out.println("Constructor of class E is called");
    }
}

public class ConsChaining {
    public static void main(String args[]) {
        E e = new E("John", 30, 1234567890L, "123 Main St", "john@example.com", "Engineer");
        e.display();
    }
}