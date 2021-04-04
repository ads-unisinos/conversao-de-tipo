package conversaoDeTipo;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------- CASTING---------");
        float f = 12.5f;
        int i;
        //i = f; Erro de compilação. Operador de cast necessário

        i = (int) f; // Casting: vou perder a precisão

        System.out.println("Valor de f: " + f);
        System.out.println("Valor de i: " + i);

        System.out.println("-------- ATRIBUIÇÃO---------");
        int intOper1 = 2;
        int intOper2 = 3;
        float resultFloat = 0.0f;

        // conversão implícita
        resultFloat = intOper1 + intOper2;

        System.out.println("-------- STRING---------");

        int resultInt = 0;
        float resultFloat2 = 0.0f;
        System.out.println("Resultado da operacao (int): " + resultInt);
        System.out.println("Resultado da operacao (float): " + resultFloat2);

        String s1 = String.valueOf(resultInt);
        String s2 = String.valueOf(resultFloat2);

        System.out.printf("s1= %s and s2= %s%n",s1,s2);

        System.out.println("-------- STRING PARA TIPOS PRIMITIVOS (WRAPPERS)---------");
        //WRAPPERS : a classe que representa o tipo primitivo.

        System.out.println( Integer.parseInt("122") );
        System.out.println( Long.parseLong("122223344"));
        System.out.println( Double.parseDouble("12.22") );

        System.out.println("-------- PROMOCAO NUMERICA---------");
        // Coversão automática
        // byte -> short -> int -> long -> float -> double

        int intOper3 = 2;
        float floatOper3 = 2.6f;
        // operador intOper1 é implicitamente tratado como float
        resultFloat = intOper1 + floatOper3;

        resultInt = (int) (intOper1 + floatOper3); // precisa de cast

        System.out.println("-------- INVOCACAO DE METODOS---------");

        int opInt = 5;
        float opFloat = 2.7f;
        System.out.println( "Resultado da soma: " + soma(opInt, opFloat));



    }

    public static float soma ( float op1, float op2)
    {
        return op1+ op2;
    }
}
