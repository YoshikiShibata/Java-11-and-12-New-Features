record Emp(String name, int age) {
    // overloading constructor
    public Emp(String name, String style) {
        this.name = name;
        if (style.equals("COOL")) age = 20;
        else if (style.equals("SAFE")) age = 30;
        else if (style.equals("ELEGANT")) age = 50;
        else age = 70;
    }
    public String fancyOutput() { // additional method
        return "My style is COOL";
    }

	public void setAge(int age) {
			this.age = age;
	}
}
