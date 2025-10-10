enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER,
}

public class SeasonExe {
    public String sAbbr;
    public Season sFavoriteSeason;

    public static void main(String[] args) {
        SeasonExe season = new SeasonExe();
        season.sAbbr = "Win";
        season.sFavoriteSeason = Season.WINTER;

        System.out.println("ABBR: " + season.sAbbr);
        System.out.println("FULL NAME: " + season.sFavoriteSeason);
    }
}
