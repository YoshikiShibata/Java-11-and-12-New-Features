// Copyrigt (C) 2019 Yoshiki Shibata. All rights reserved.

record Emp(String name, int[] division) {
	public static void main(String[] args) {
		Emp e = new Emp("Yoshiki", new int[]{10});
		int[] div = e.division();
		System.out.println(e.division()[0]);	
		div[0] = 100;
		System.out.println(e.division()[0]);	
	}	
}


