class StringExample {
    public static void main(String[] args) {
        String html = "<HTML>" +
"\n\t" + "<BODY>" +
"\n\t\t" + "<H1>Meaning of life</H1>" +
"\n\t" + "</BODY>" +
"\n" + "</HTML>";
		System.out.println(html);

		String html2 = "<HTML>" +
                   "\n\t" + "<BODY>" +
                       "\n\t\t" + "<H1>Meaning of life</H1>" +
                   "\n\t" + "</BODY>" +
              "\n" + "</HTML>";
		System.out.println(html2);
    }
}
