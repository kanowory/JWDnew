package zjazd5.enums.lab17;

public enum WorldDirections {
    N("północ", "North", 0),
    NE ("północny wschód", "Northeast", 45),
    E("wschód", "East", 90),
    SE("południowy wschód", "Southeast", 135),
    S("południe", "South", 180),
    SW("południowy zachód", "Southwest", 225),
    W("zachód", "West", 270),
    NW ("północny zachód", "Northwest", 315);

    String namePl;
    String nameEnglish;
    int rotation;

    WorldDirections(String namePl, String nameEnglish, int rotation) {
        this.namePl = namePl;
        this.nameEnglish = nameEnglish;
        this.rotation = rotation;
    }

    public String getNamePl() {
        return namePl;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public int getRotation() {
        return rotation;
    }

    @Override
    public String toString() {
        return "WorldDirections{" +
                "namePl='" + namePl + '\'' +
                ", nameEnglish='" + nameEnglish + '\'' +
                ", rotation=" + rotation +
                '}';
    }
}
