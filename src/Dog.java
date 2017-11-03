public class Dog {
    String name;
    int size;
    public static void main(String [] agrs)
    {
        Dog smallDog = new Dog();
        smallDog.name = "Rory";
        Dog [] Doggies = new Dog[3];
        Doggies[0] = new Dog();
        Doggies[0].name= "Marty";
        Doggies[1]= new Dog();
        Doggies[1].name= "McFly";
        Doggies[2]=smallDog;

        System.out.println("Last Dog's name is : " + Doggies[2].name);

        int x =0;
    while(x <Doggies.length)
    {
        Doggies[x].bark();
        x=x+1;
    }



    }

    public void bark() {
        System.out.println(name + "  barks");
    }
}
