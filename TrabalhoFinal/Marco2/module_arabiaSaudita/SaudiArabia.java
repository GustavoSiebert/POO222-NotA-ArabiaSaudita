package module_arabiaSaudita;

import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaudiArabia implements NationalTeamInfos{

    SaudiaArabiaTeam sa = new SaudiaArabiaTeam();

    @Override
    public int getHowManyMembers() {
            int number = sa.GetPlayers().size() + sa.GetTechCommittees().size() + sa.GetSportDirector().size();
            return number;
    }

    @Override
    public int getOldestPlayer() {
        return sa.GetPlayers().stream().max(Comparator.comparing(Player::getAge)).get().getNumber();
    }

    @Override
    public int getYoungestPlayer() {
        return sa.GetPlayers().stream().min(Comparator.comparing(Player::getAge)).get().getNumber();
    }

    @Override
    public double getAverageAge() {
        return sa.GetPlayers().stream().map(Player::getAge).reduce(0, Integer::sum).doubleValue();
    }

    @Override
    public String getPlayer(int number) {
        Player p = sa.GetPlayers().stream().filter(x -> x.getNumber() == number).findFirst().get();
        JSONObject json = new JSONObject(p);

        return  json.toString();
    }

    @Override
    public String getPressOfficerContacts() {
        List<SportDirector> tc = sa.GetSportDirector();

        JSONObject json = new JSONObject(tc);
        return json.toString();
    }

    @Override
    public String getCountryName() {
        return this.getClass().getName();
    }

    @Override
    public Image getFlagImage() {
        try {
            return ImageIO.read(new File("./POO222-NotA-ArabiaSaudita/TrabalhoFinal/arabiaSaudita.png"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());;
        }
        return null;
    }

    @Override
    public Path getTechnicalCommittee() {
        return Path.of((new File("./POO222-NotA-ArabiaSaudita/TrabalhoFinal/banco.json")).getPath(), new String[0]);
    }

    @Override
    public NationalTeamStats getStatsResponsible() {
        return new SaudiaArabiaTeam();
    }
}
