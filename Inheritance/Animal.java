class Animal {
 
    public void makeSound() {
        System.out.println("Animal sound");
    }
   }
   
   class Dog extends Animal {
    public void dogSound() {
        System.out.println(" Bow Bow!");
    }
   }
   
   class Cat extends Animal {
    public void catSound() {
        System.out.println(" Meow Meow!");
    }
    
   
    public static void main(String[] args) {
   
        Dog d = new Dog();
        d.dogSound();
        Cat c = new Cat();
        c.catSound();
       
    }
   }
