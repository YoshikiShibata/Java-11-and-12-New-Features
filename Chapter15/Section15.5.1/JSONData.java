public class JSONData {
    public static void main(String[] args) {

        String data =
                "{\"plastic\": { \n" +
                "  \"id\": \"98751\", \n" +
                "  \"singleuse\": { \n" +
                "    \"item\": [ \n" +
                "      {\"value\": \"Straw\", \"replaceWith\": \"Ban Straws\"}, \n" +
                "      {\"value\": \"Spoon\", \"replaceWith\": \"Steel Spoon\"} \n" +
                "    ] \n" +
                "  } \n" +
                "}}";


        String data2 = """
                {"plastic": {
                  "id": "98751",
                  "singleuse": {
                    "item": [
                      {"value": "Straw", "replaceWith": "Ban Straws"},
                      {"value": "Spoon", "replaceWith": "Steel Spoon"}
                    ]
                  }
                }}
                """;

        System.out.println(data);
        System.out.println(data2);
    }
}
