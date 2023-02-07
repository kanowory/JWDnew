package zjazd5.interfaces.dataProviders;

import zjazd5.interfaces.dataProviders.DataProvider;

public class SimpleDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "raz, dwa, trzy";
    }
}
