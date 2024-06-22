package W4;
public class ManagerApp {
    public static void main(String[]args) throws Exception{

    var manager1 = new Manager("amisha", "google");
    manager1.sayHello("user1");

    var vp1 = new VicePresident("amisha");
    vp1.sayHello("user1");
}
}
