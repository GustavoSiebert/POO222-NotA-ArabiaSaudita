package module_arabiaSaudita;

import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class ArabiaSaudita implements NationalTeamInfos, NationalTeamStats {

    SaudiaArabiaTeam sa = new SaudiaArabiaTeam();

    @Override
    public int getHowManyMembers() {
        sa.addNmbTimesAsked();
        int number = sa.GetPlayers().size() + sa.GetTechCommittees().size() + sa.GetSportDirector().size();
        return number;
    }

    @Override
    public int getOldestPlayer() {
        sa.addNmbTimesAsked();
        return sa.GetPlayers().stream().max(Comparator.comparing(Player::getAge)).get().getNumber();
    }

    @Override
    public int getYoungestPlayer() {
        sa.addNmbTimesAsked();
        return sa.GetPlayers().stream().min(Comparator.comparing(Player::getAge)).get().getNumber();
    }

    @Override
    public double getAverageAge() {
        sa.addNmbTimesAsked();
        return sa.GetPlayers().stream().map(Player::getAge).reduce(0, Integer::sum).doubleValue();
    }

    @Override
    public String getPlayer(int number) {
        sa.addNmbTimesAsked();
        Player p = sa.GetPlayers().stream().filter(x -> x.getNumber() == number).findFirst().get();
        JSONObject json = new JSONObject(p);

        return json.toString();
    }

    @Override
    public String getPressOfficerContacts() {
        sa.addNmbTimesAsked();
        List<SportDirector> tc = sa.GetSportDirector();

        JSONObject json = new JSONObject(tc);
        return json.toString();
    }

    @Override
    public String getCountryName() {
        sa.addNmbTimesAsked();
        return this.getClass().getName();
    }

    @Override
    public Image getFlagImage() {
        try {
            sa.addNmbTimesAsked();
            return ImageIO.read(new File("./POO222-NotA-ArabiaSaudita/TrabalhoFinal/arabiaSaudita.png"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            ;
        }
        return null;
    }

    @Override
    public Path getTechnicalCommittee() {
        sa.addNmbTimesAsked();
        return Path.of((new File("./POO222-NotA-ArabiaSaudita/TrabalhoFinal/banco.json")).getPath(), new String[0]);
    }

    @Override
    public NationalTeamStats getStatsResponsible() {
        sa.addNmbTimesAsked();
        return sa;
    }

    @Override
    public int getHowManyQuestions() {
        return sa.getHowManyQuestions();
    }

    @Override
    public String getHowManyCallsToPlayer(int number) {
        return sa.getHowManyCallsToPlayer(number);
    }
}