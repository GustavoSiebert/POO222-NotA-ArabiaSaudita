import module_arabiaSaudita.NationalTeamInfos;
import module_arabiaSaudita.NationalTeamStats;

import java.awt.*;
import java.nio.file.Path;

public class SaudiArabia implements NationalTeamInfos {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public int getHowManyMembers() {
        return 0;
    }

    @Override
    public int getOldestPlayer() {
        return 0;
    }

    @Override
    public int getYoungestPlayer() {
        return 0;
    }

    @Override
    public double getAverageAge() {
        return 0;
    }

    @Override
    public String getPlayer(int number) {
        return null;
    }

    @Override
    public String getPressOfficerContacts() {
        return null;
    }

    @Override
    public String getCountryName() {
        return null;
    }

    @Override
    public Image getFlagImage() {
        return null;
    }

    @Override
    public Path getTechnicalCommittee() {
        return null;
    }

    @Override
    public NationalTeamStats getStatsResponsible() {
        return null;
    }
}