package W4;

public class Manager {
    String name;
    String company;

    Manager(String name, String company){
        this.name=name;
        this.company=company;
    }
    Manager(String name){
        this.name=name;
    }
    void sayHello(String name) throws Exception{
        System.out.println("Hello"+name+",My Manager name is"+this.name);
    }
    
}
