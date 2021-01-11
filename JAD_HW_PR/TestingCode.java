import java.util.*;
import java.util.List;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

class Parent { 
/** 
 * @param talk(
 */
// Superclass (parent)
    public void talk() { // this is the method the child will inherit
        System.out.println("adult talk");
    }
}

class Child extends Parent { // Subclass (child)
                             // making an object from this AKA Child test = new Child();
                             // and trying to call the methods by having Child.talk(); will not work unless
                             // you make the methods static
    public void talk() {
        System.out.println("child talk");
    }

    // even though this method is part of the child class, it will not be abled to
    // be called one we designate it with the Parent
    public void cry() {
        System.out.println("crying");
    }
}

public class TestingCode {
    public static void main(String args[]) {
        List<String> quotes = new ArrayList<>();

        quotes.add("Hello world");
        quotes.add("Testing");
        quotes.add("Try googling it");
        quotes.add("just walk away for a bit");
        quotes.add("lets see if this works");
        quotes.add("They've gone to plad!");
        quotes.add("Seeting Fasars to kill");
        quotes.add("running hax.exe");
        quotes.add("Have you tried turning it on and off?");
        quotes.add("Every 60 secinds in africa, a minute passes");

    }
}