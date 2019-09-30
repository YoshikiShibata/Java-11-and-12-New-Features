public class UseDatabaseQuery {
    public static void main(String[] args) {
        String query = "SELECT talk_title, speaker_name " +
                "FROM   talks, speakers " +
                "WHERE  talks.speaker_id = speakers.speaker_id " +
                "AND    talks.duration > 50 ";

        String query2 = "SELECT 'talk_title', 'speaker_name' " +
                "FROM   'talks', 'speakers' " +
                "WHERE  'talks.speaker_id' = 'speakers.speaker_id' " +
                "AND    'talks.duration' > 50 ";

        String query3 = """
                        SELECT 'talk_title', 'speaker_name'
                        FROM   'talks', 'speakers'
                        WHERE  'talks.speaker_id' = 'speakers.speaker_id'
                        AND    'talks.duration' > 50 """;

		System.out.println(query);
		System.out.println(query2);
		System.out.println(query3);
    }
}
