enum SingleUsePlastic {STRAW, BAG, SPOON, FORK, KNIFE, PLATE, BOTTLE}

// The following commented code won't compile
/*
class Planet {
    private static long damage;

    public void use(SingleUsePlastic plastic) {
        damage += switch (plastic) {
            case SPOON, FORK, KNIFE -> 7;
        };
    }
}
*/

class Planet {
    private static long damage;

    public void use(SingleUsePlastic plastic) {
        damage += switch (plastic) {
            case SPOON, FORK, KNIFE -> 7;       // Adding (1) or (2), or both will enable the code to compile
            case STRAW, BAG, PLATE, BOTTLE -> 10;     // (1)
            default -> 100;       // (2)
        };
    }

    String getBook(String name) {
        String bookName = switch (name) {
            case "Shreya" -> "Harry Potter";
            case "Paul" -> "Management tips";
            case "Harry" -> "Life of Pi";
            default -> "Design Patters - everyone needs this";
        };
        return bookName;
    }

    String getBook2(String name) {
        String bookName = null;
        switch (name) {                                    // NOT returning a value
            case "Shreya" -> bookName = "Harry Potter";
            case "Paul" -> bookName = "Management tips";
            case "Harry" -> bookName = "Life of Pi";      // default case not included
        }
        return bookName;
    }

}
