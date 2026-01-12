package polymorphism;

import java.io.IOException;

class ChildExe extends ParentExe{
    @Override
    void display() throws IOException {
        System.out.println("Child method");
    }
}
