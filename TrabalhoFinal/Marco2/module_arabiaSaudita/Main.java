package module_arabiaSaudita;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //    SaudiaArabiaTeam saudiArabia = new SaudiaArabiaTeam();

        JSONParser parser = new JSONParser();
        try {
            SaudiaArabiaTeam sa = new SaudiaArabiaTeam();
            List<Player> p =  sa.GetPlayers();

            System.out.println("deu");

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
