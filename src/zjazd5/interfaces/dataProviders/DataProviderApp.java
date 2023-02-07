package zjazd5.interfaces.dataProviders;

public class DataProviderApp {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider();//tutaj podmieniamy data providera

        dataPresenter.showData(dataProvider);
    }
}
