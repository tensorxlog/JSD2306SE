package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {

    }

    public void doSome() throws IOException, AWTException {

    }
}

class SubClass extends ThrowsDemo {
    //public void doSome(){

    //}

    //public void doSome() throws IOException {

    //}

    public void doSome() throws FileNotFoundException {

    }

    //public void doSome() throws SQLException {

    //}

    //public void doSome() throws Exception {

    //}
}