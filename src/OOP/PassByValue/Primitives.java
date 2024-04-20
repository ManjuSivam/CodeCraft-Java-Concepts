package OOP.PassByValue;

public class Primitives {
    public static void  modify(int a, int b){
        a= 5;
        b=10;
    }

    public static void main(String[] args) {
        int x=1, y=2;
        System.out.println(x==1);
        System.out.println(y==2);
        modify(x,y);
        System.out.println(x==1);
        System.out.println(y==2);
    }
}
