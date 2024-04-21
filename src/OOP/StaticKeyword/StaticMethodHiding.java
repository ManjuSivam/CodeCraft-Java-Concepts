package OOP.StaticKeyword;

public class StaticMethodHiding {
    public static void display(){
        System.out.println("Displaying from parent");
    }
}

class child extends StaticMethodHiding{
    //NOT an overridden method - specialised method
    public static void display(){
        System.out.println("Displaying from child");
    }

//    //cannot override a static method
//    @Override
//    public static void display(){
//        System.out.println("Displaying from parent");
//    }
}
