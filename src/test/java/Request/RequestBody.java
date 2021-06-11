package Request;

public class RequestBody {

    public String jsonMetodoPost(String name, String job){
        String jsonBody = "{\n" +
                "    \"name\":" + "\"" + name + "\"" + "," +
                "    \"job\":" + "\"" + job + "\"" +
                "}";
        return jsonBody;
    }

    public String jsonMetodoPath(String name, String job){
        String jsonBody = "{\n" +
                "    \"name\":" + "\"" + name + "\"" + "," +
                "    \"job\":" + "\"" + job + "\"" +
                "}";
        return jsonBody;
    }
}
