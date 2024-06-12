class Person {
    private String schoolName;
    private String name;
    private String password;
    private String matricNo;
    private int staffNo;


      public Person(String schoolName, String name, String password, String matricNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.matricNo = matricNo;
    }

    
    public Person(String schoolName, String name, String password, int staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String toString() {
        if (matricNo != null) {
            return "Student [School Name=" + schoolName + ", Name=" + name + ", Password=" + password + ", Matric No=" + matricNo + "]";
        } else {
            return "Staff [School Name=" + schoolName + ", Name=" + name + ", Password=" + password + ", Staff No=" + staffNo + "]";
        }
    }
}