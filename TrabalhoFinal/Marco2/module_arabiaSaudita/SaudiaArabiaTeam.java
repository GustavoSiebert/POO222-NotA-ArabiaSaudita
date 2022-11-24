package module_arabiaSaudita;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SaudiaArabiaTeam  implements NationalTeamStats{
    private List<Player> players;
    private List<TechCommittee> techCommittees;
    private List<SportDirector> sportDirectors;

    public SaudiaArabiaTeam() {
        players = new ArrayList<Player>();
        techCommittees = new ArrayList<TechCommittee>();
        sportDirectors = new ArrayList<SportDirector>();
    }

    public JSONArray GetJsonInfo(int value) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/project/banco.json"));
            JSONObject jsonObject = (JSONObject) obj;
            switch (value) {
                case 1:
                    return (JSONArray) jsonObject.get("players");
                case 2:
                    return (JSONArray) jsonObject.get("techCommittees");
                case 3:
                    return (JSONArray) jsonObject.get("sportDirectors");
            }

        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return  null;
    }
    public List<Player> GetPlayers()
    {
        JSONArray playersJson = GetJsonInfo(1);
        List<Player> result = new ArrayList<Player>();
        for (Object js: playersJson) {
            JSONObject js1 = (JSONObject) js;

            result.add(new Player((String)js1.get("name"),(int) (long) js1.get("age"),(int) (long) js1.get("number"),(String) js1.get("nickname"),(double)js1.get("height"),(double)js1.get("weight"),(String) js1.get("position"),(String) js1.get("club")));
        }

        return result;
    }

    public List<TechCommittee> GetTechCommittees()
    {
        JSONArray playersJson = GetJsonInfo(1);
        List<TechCommittee> result = new ArrayList<TechCommittee>();
        for (Object js: playersJson) {
            JSONObject js1 = (JSONObject) js;

            result.add(new TechCommittee((String)js1.get("name"),(int) (long) js1.get("age"),(String) js1.get("role")));
        }

        return result;
    }
    public List<SportDirector> GetSportDirector()
    {
        JSONArray playersJson = GetJsonInfo(1);
        List<SportDirector> result = new ArrayList<SportDirector>();
        for (Object js: playersJson) {
            JSONObject js1 = (JSONObject) js;

            result.add(new SportDirector((String)js1.get("name"),(int) (long) js1.get("age"),(String) js1.get("contact1"),(String) js1.get("contactEmail")));
        }

        return result;
    }

    public void SetTeamPlayers() {

        players.add( new Player("Muhammed Al Owais",20,1,"Muhammed Al Owais",1.76,72.2,"Goleiro","(Al Hilal)"));
        players.add( new Player("Mohammed Al Yammi",21,2,"Mohammed Al Yammi",1.88,74.3,"Goleiro","(Al Hilal)"));
        players.add( new Player("Nawaf Al-Aqeedi",21,3,"Nawaf Al-Aqeedi",1.87,90.5,"Goleiro","Sem Clube"));
        players.add( new Player("Sultan Al-Ghanam",21,4,"Sultan Al-Ghanam",1.84,70.4,"Lateral Direito","(Al Hilal)"));
        players.add( new Player("Abdulelah Al-Amri",21,5,"Abdulelah Al-Amri",1.82,75.0,"Lateral Direito","(Al Hilal)"));
        players.add( new Player("Ali Al-Bulayhi",21,6,"Ali Al-Bulayhi",1.90,90.3,"Lateral Direito","(Al Hilal)"));
        players.add( new Player("Abdullah Mado",21,7,"Abdullah Mado",1.78,78.4,"Lateral Esquerdo","(Al Bilal)"));
        players.add( new Player("Hassan Tambakti",21,8,"Hassan Tambakti",1.76,83.9,"Lateral Esquerdo","(Al Hilal)"));
        players.add( new Player("Saud Abdulhamid",21,9,"Saud Abdulhamid",1.90,86.0,"Lateral Esquerdo","(Al Nassr)"));
        players.add( new Player("Yasser Al-Shahrani",21,10,"Yasser Al-Shahrani",1.85,60.3,"Zagueiro","(Al Hilal)"));
        players.add( new Player("Salem Al-Dawsari",21,11,"Salem Al-Dawsari",1.70,80.2,"Zagueiro","(Al Hilal)"));
        players.add( new Player("Abdulellah Al-Malki",21,12,"Abdulellah Al-Malki",1.70,69.6,"Zagueiro","(Al Nassr)"));
        players.add( new Player("Mohamed Kanoo",21,14,"Mohamed Kanoo",1.70,96.0,"Zagueiro","(Al Hilal)"));
        players.add( new Player("Abdullah Al-Aboud",21,15,"Abdullah Al-Aboud",1.79,87.4,"Volante","(Al Hilal)"));
        players.add( new Player("Sami Al-Najei",21,16,"Sami Al-Najei",1.69,69.69,"Volante","(Al Nassr)"));
        players.add( new Player("Hattan Bahbri",21,17,"Hattan Bahbri",1.86,95.0,"Meia","(Al Nassr)"));
        players.add( new Player("Nasser Al-Dawsari",21,18,"Nasser Al-Dawsari",1.87,88.1,"Meia","(Al-Ittihad Jeddah)"));
        players.add( new Player("Ali Al-Hassan",21,19,"Ali Al-Hassan",1.85,99.3,"Meia","(Al Hilal)"));
        players.add( new Player("Riad Shrahili",21,20,"Riad Shrahili",1.85,100.3,"Meia","(Al-Ittihad Jeddah)"));
        players.add( new Player("Abdullah Otayf",21,21,"Abdullah Otayf",1.70,67.4,"Meia","(Al-Ahli)"));
        players.add( new Player("Saleh Al-Shehri",21,22,"Saleh Al-Shehri",1.80,83.0,"Atacante","(Al Nassr)"));
        players.add( new Player("Firas Al-Braikan",21,23,"Firas Al-Braikan",16.3,71.2,"Atacante","(Al Nassr)"));
        players.add( new Player("Haitham Asiri",21,24,"Haitham Asiri",1.80,78.12,"Atacante","(Al Nassr)"));
        players.add( new Player("Nawaf Al Abed",21,25,"Nawaf Al Abed",1.76,80.0,"Atacante","(Al Nassr)"));
    }
    public void SetTeamCommittees()
    {
        techCommittees.add(new TechCommittee("Hervé Jean Marie Roger Renard",21,"Manager"));
        techCommittees.add(new TechCommittee("Abdulellah Al-Najei",21,"TechCommittee"));
        techCommittees.add(new TechCommittee("Dabir Wasim Halabi",21,"TechCommittee"));
    }

    public void SetDirectorManager()
    {
        sportDirectors.add(new SportDirector("Nabeel Humam Naser",21,"(36)99363-4732","HumamNaser@gmail.com"));
        sportDirectors.add(new SportDirector("Salem Abdulhamid",21,"(36)84672-2372","Abdulhamid@gmail.com"));
    }
    public void CreateJsonFile()
    {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{players: [");
            for (Player player : players) {
                String jsonInString = new Gson().toJson(player);
                sb.append(jsonInString+ ",");
            }
            sb.append("]");
            sb.append(",techCommittees: [");
            for (TechCommittee techCommittee : techCommittees) {
                String jsonInString = new Gson().toJson(techCommittee);
                sb.append(jsonInString+ ",");
            }
            sb.append("]");
            sb.append(",sportDirectors: [");
            for (SportDirector sportDirector : sportDirectors) {
                String jsonInString = new Gson().toJson(sportDirector);
                sb.append(jsonInString+ ",");
            }
            sb.append("]}");

            FileWriter file = new FileWriter("C:/project/banco.json");
            file.write(sb.toString());
            file.close();
        }
        catch(Exception ex){

        }
    }

    @Override
    public int getHowManyQuestions() {
        //todo
        return 0;
    }

    @Override
    public String getHowManyCallsToPlayer(int number) {
        return String.valueOf(GetPlayers().stream().filter(x -> x.getNumber() == number).findFirst().get().getPlayerAsked());
    }
}
