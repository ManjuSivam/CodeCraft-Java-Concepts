package OOP.Shadowing;

public class Q extends P{
    int num = 8;
    public void show(){
        System.out.println(num); //8 - Q's variable shadowed P's variable
        int num = 7;
        System.out.println(num); //7 - Q's local variable shadowed P's instance variable
        System.out.println(this.num); // Q's inst variable

        System.out.println(super.num); // Q's parent's inst variable

    }

    public static void main(String[] args) {
        Q obj = new Q();
        obj.show();
    }
}
