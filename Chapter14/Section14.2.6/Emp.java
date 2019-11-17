// Copyright (C) Yoshiki Shibata. All rights reserved.

record Emp(String name, int age) {
    @Override
    public String toString() {
        return String.format("Emp(%s, %d)", name, age);
    }

	@Override
	public int hashCode() { 
		return name.hashCode()* 37 + age;
	}

	@Override
	public boolean equals(Object o) {
			return this == o;
	}

	public String name() {
			return name.toUpperCase();
	}

	public int age() {
			return age - 20; // younger;
	}

    public static void main(String[] args) {
        System.out.println(new Emp("Yoshiki", 59));
		System.out.println(new Emp("Yoshiki", 59).hashCode());
		System.out.println(new Emp("Yoshiki", 59).equals(null));
		System.out.println(new Emp("Yoshiki", 59).name());
		System.out.println(new Emp("Yoshiki", 59).age());
    }
}
