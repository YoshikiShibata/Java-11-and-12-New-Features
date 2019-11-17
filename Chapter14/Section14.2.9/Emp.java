record Emp(String name, int age) {
    // overloading constructor
    public Emp {
			if (age < 0) {
					throw new IllegalArgumentException("age is negative");
			}
			/*
			age = 10;
        if (name.equals("COOL")) age = 20;
        else if (name.equals("SAFE")) age = 30;
        else if (name.equals("ELEGANT")) age = 50;
        else age = 70;
		*/
    }
    public String fancyOutput() { // additional method
        return "My style is COOL";
    }
}
