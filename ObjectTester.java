public class ObjectTester {
    public static void main (String[] args) {

        //make Dog object - instantation
        Dog dog1 = new Dog();
        System.err.println(dog1);



        //make Dog object - use non-default constructor
        Dog dog2 = new Dog( name:"Mitochondria", age:3,breed: "Chihuahua");
        System.out.println(dog2);


        dog2.setName(name:"Harry");
        System.out.println(dog2);
        }
        



    } //end main
}//end class