<<<<<<< HEAD
public class student extends user {
    String matricNo;
    String admissionNo;

    String RegisterCourse(){
        return "CMP 202";
    }
    String CheckResult(){
        matricNo ="BHU/22/04/05/0092";
        admissionNo = "12345678";
        if (matricNo.equals("BHU/22/04/05/0092")||admissionNo.equals("12345678")) {
            return"Result";
            
        }
        else{
            return"Credentials error";
        }
        public static void main(String[] args) {
            new student();
            System.out.println("Result");
        }
    }
    
}
=======
public class student extends user {
    String matricNo;
    String admissionNo;

    String RegisterCourse(){
        return "CMP 202";
    }
    String CheckResult(){
        matricNo ="BHU/22/04/05/0092";
        admissionNo = "12345678";
        if (matricNo.equals("BHU/22/04/05/0092")||admissionNo.equals("12345678")) {
            return"Result";
            
        }
        else{
            return"Credentials error";
        }
        public static void main(String[] args) {
            new student();
            System.out.println("Result");
        }
    }
    
}
>>>>>>> 1f3e492 (rebase)
