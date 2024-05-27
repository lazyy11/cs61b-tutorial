public class DogLauncher {
    public static void main(String[] args){
        /** Showing how to instantiate an object. */
//        Dog d = new Dog(20);
//        d.makeNoise();

        /** Showing how to invoke a static method. */
        Dog d = new Dog(15);
        Dog d2 = new Dog(100);
        Dog bigger = Dog.maxDog(d, d2);
        bigger.makeNoise();

        /** Showing how to invoke instance method a.k.a. non-static method. */
//        Dog d = new Dog(15);
//        Dog d2 = new Dog(100);
//        Dog bigger = d.maxDog(d2);
//        bigger.makeNoise();

        /** Access the static variable binomen. */
        System.out.println(Dog.biomen);
    }
}