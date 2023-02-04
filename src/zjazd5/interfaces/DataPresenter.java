package zjazd5.interfaces;

public class DataPresenter {
    void showData(DataProvider dataProvider) {//typ interfejsu żeby klasa była uniwersalna dla różnych dostarczycieli danych
        System.out.println("Prezentacja danych: " + dataProvider.getData());
    };
}
