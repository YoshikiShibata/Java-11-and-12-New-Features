public class XMLData {
    public static void main(String[] args) {
        /*
        Sample XML data
        <plastic id="98751">
            <singleuse>
                <item value="Straw" replaceWith="Ban Straws" />
                <item value="spoon" replaceWith="Steel Spoon" />
            </singleuse>
        </plastic>
         */

        String data =
                "<plastic id=\"98751\">\n" +
                "  <singleuse>\n" +
                "    <item value=\"Straw\" replaceWith=\"Ban Straws\" />\n" +
                "    <item value=\"spoon\" replaceWith=\"Steel Spoon\" />\n" +
                "  </singleuse>\n" +
                "</plastic>";


        String dataUsingTextBlock = """
                <plastic id="98751">
                  <singleuse>
                    <item value="Straw" replaceWith="Ban Straws" />
                    <item value="spoon" replaceWith="Steel Spoon" />
                  </singleuse>
                </plastic>
                """;

		System.out.println(data);
		System.out.println(dataUsingTextBlock);
    }
}
