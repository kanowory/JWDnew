package zjazd5.interfaces;

public class DataProviderApp {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider();//tutaj podmieniamy data providera

        dataPresenter.showData(dataProvider);
    }
}
