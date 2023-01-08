package pl.edu.wszib.podyplomowe;

public class PackagePresenter {

    public void showPackage() {
        System.out.println("To jest obiekt klasy " + this.getClass().getSimpleName() + ", w pakiecie " + this.getClass().getPackageName());

    }

    public static void main(String[] args) {

    }

}
