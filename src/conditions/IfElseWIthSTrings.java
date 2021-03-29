package conditions;

public class IfElseWIthSTrings {
    public static void main(String[] args) {
        String name = "serap" ;
        String lastname = "kilic";
        String lastname2 = "KiliC";

        if(name.equals(lastname)){
            System.out.println("Same as Last Name");
        }
        else if (lastname.equalsIgnoreCase(lastname2)){
            System.out.println("say x");
        }


    }
}
