public class WelcomeTextBlocks {
    public static void main(String[] args) {
        String html = """
                      <HTML>
                          <BODY>
                              <H1>I like \""" as a delimiter</H1>
                          </BODY>
                      </HTML> 
                      """;
        System.out.print(html);
    }
}
