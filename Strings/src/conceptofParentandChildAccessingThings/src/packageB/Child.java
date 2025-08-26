// File: Child.java (Package: packageB)
package packageB;

import packageA.Parent;

public class Child extends Parent {
    // Static area (Cannot access staticVar and staticMethod directly)
    static {
        // System.out.println(staticVar); // ❌ Error: staticVar is not accessible directly
        // staticMethod();                // ❌ Error: staticMethod is not accessible directly
    }

    public static void main(String[] args) {
        // Static members of parent can only be accessed using Parent's class name
        System.out.println(Parent.staticVar); // ✅ Allowed
        Parent.staticMethod();                // ✅ Allowed

        // Creating an instance of Child
        Child child = new Child();
        System.out.println(child.instanceVar); // ✅ Allowed (instance member in non-static area)
        child.instanceMethod();               // ✅ Allowed
    }
}
