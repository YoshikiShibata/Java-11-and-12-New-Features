final class EmpPOJO {
    private String name;
    private int age;

    public EmpPOJO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accessor methods - getName, getAge
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutator methods - setName, setAge
    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (!(obj instanceof EmpPOJO)) {
            return false;
        } else {
            EmpPOJO emp = (EmpPOJO)obj;
            return (emp.name.equals(this.name) &&
                    emp.age == this.age);
        }
    } 

    @Override
    public String toString() {
        return name + ":" + age;
    }

    @Override
    public int hashCode() {
		return name.hashCode() * 31 + age;
    }
}
