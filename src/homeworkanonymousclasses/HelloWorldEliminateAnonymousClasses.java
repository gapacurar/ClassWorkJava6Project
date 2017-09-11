/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkanonymousclasses;

/**
 *
 * @author Laita Claudiu
 */
public class HelloWorldEliminateAnonymousClasses {

// Inner interface HelloWorld
    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone);
    }
    // Method sayHello prints

    public void sayHello() {
        // Local class EnglishGreetings implemented in the method sayHello()
        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        } // end of EnglishGreeting local class
        // create an EnglishGreeting object/instance
        HelloWorld englishGreeting = new EnglishGreeting();
        
        // Create a Local class instead of an Anonimous class that greets in French language
        class FrenchGreeting implements HelloWorld{
            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        }// end of FrenchGreeting local class
        // create an FrenchGreeting object/instance
        HelloWorld frenchGreeting = new FrenchGreeting();

        // Create a Local class instead of an Anonimous class for Spanish language
        class SpanishGreeting implements HelloWorld {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            } 
        }// end of SpanishGreeting local class
        // create an SpanishGreeting object/instance
        HelloWorld spanishGreeting = new SpanishGreeting();
        
        
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
    // main method

    public static void main(String... args) {
        HelloWorldEliminateAnonymousClasses myApp
                = new HelloWorldEliminateAnonymousClasses();
        myApp.sayHello();
    }
}
