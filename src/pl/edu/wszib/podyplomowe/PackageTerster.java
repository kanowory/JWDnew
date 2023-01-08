package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.java.PackagePresenter;
//import pl.edu.wszib.podyplomowe.PackagePresenter;//kolizja importów
import java.util.*;

public class PackageTerster {
    public static void main(String[] args) {

        System.out.println("Pakiet " + PackageTerster.class.getPackageName());

        PackagePresenter javapackagePresenter = new PackagePresenter();
        javapackagePresenter.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter podyplomowe = new pl.edu.wszib.podyplomowe.PackagePresenter();//użycie nazwy kwalifikowanej
        podyplomowe.showPackage();
    }
}
