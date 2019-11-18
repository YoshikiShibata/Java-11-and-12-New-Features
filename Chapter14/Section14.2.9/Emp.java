record Emp(String name, int age) {
		public final int year;
    // overloading constructor
    public Emp {
			if age < 0 {
				throw new IllegalArgumentException("age is negative");
			}

			this.age = age/2;
			year = age;
					/*
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
