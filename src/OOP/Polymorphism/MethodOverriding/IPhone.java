package OOP.Polymorphism.MethodOverriding;

public class IPhone extends Phone{

    //@Override
    //cannot reduce the visibility -
    //attempting to assign weaker access privileges ('private'); was 'public'
//    private void call(){//
//        System.out.println("Calling from iphone - overridden method");
//    }

    @Override
    //can increase the visibility
    public void call(){//
        System.out.println("Calling from iphone - overridden method");
    }
//    @Override
    //cannot change the return type of inherited-overridden method
//    public int call(){//
//        System.out.println("Calling from iphone - overridden method");
//        return 0;
//    }


    //specialised method
    public void call(int x){
        System.out.println("Calling from iphone - specialised method");

    }

    @Override
    public IPhone calcCost(){ //can change return type if the return types are co-variant
        System.out.println("1 lakh rupees");
        IPhone q = new IPhone();
        return q;
    }

    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone();
        iPhone1.call();
        iPhone1.call(1);
        iPhone1.calcCost();
    }
}
