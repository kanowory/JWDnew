package pl.edu.wszib.c;

import pl.edu.wszib.a.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {

        PackageTester a = new PackageTester();
        a.introduce();

        pl.edu.wszib.b.PackageTester b = new pl.edu.wszib.b.PackageTester();
        b.introduce();

        pl.edu.wszib.c.PackageTester c = new pl.edu.wszib.c.PackageTester();
        c.introduce();
    }
}