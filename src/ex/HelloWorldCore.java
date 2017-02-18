package ex;

import org.paninij.lang.Capsule;
import org.paninij.lang.CapsuleSystem;
import org.paninij.lang.Root;

@Root @Capsule
class HelloWorldCore {
    void run() {
        System.out.println("Hello, world.");
    }
    
    public static void main(String[] args) {
        CapsuleSystem.start(HelloWorld.class, args);
    }
}
