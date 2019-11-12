class Planet {
    enum SingleUsePlastic {STRAW, BAG, SPOON, FORK, KNIFE, PLATE, BOTTLE}

    private static long damage;

    public void use(SingleUsePlastic plastic) {
        damage += switch (plastic) {
            case STRAW:
                yield 10;       // Use colon (:) to start code,
                                // Use yield to return val
            case BAG:
                yield 11;
            case SPOON, FORK, KNIFE:
                yield 7;
            case PLATE:
                int radius = 6;         // no need
                                        // of using curly brace
                yield (radius < 10 ? 15 : 20);      // Using
                                                    // yield to
                                                    // return a value
            case BOTTLE:
                yield 20;
        };
    }
}
