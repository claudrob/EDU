package my.edu.univeristy;

public class HolaMundo {

    public static void main(String[] args) {
        int myVariableInteger = 10;
        System.out.println(myVariableInteger);

        String myVariableString = "Hello";
        System.out.println(myVariableString);

        myVariableString = "Good bye!";


        System.out.println(myVariableString);

        var myVarVariable = 15;

        System.out.println(myVarVariable);

        var miVarString = "Hi there";
        var $miVar = 10;
        var _miVar = 10;
        System.out.print("miVarString: " + miVarString);

        var user = "Claud";
        var title = "Engineer";

        var union = title + " " + user;
        System.out.println("Union: " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);
        System.out.println(i + j + user);
        System.out.println(user + (i + j ));

        var name = "Karla";
        System.out.println("New line: \n" + name);
        System.out.println("Tab:\t" + name);
        System.out.println("Retroceso: \b\b\r" + name);
        System.out.println("Retroceso: \'" + name + "\'");
        System.out.println("Retroceso: \"" + name + "\"");

    }
}
