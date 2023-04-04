package packagexercicios;
import java.util.Scanner;


public class Exercicios
{

    public static void ex1()
    {

        
        //Function
        System.out.println("FUNÇÃO: Dizer IMC a partir de sua Massa corporal e Altura.");


        //Getting user inputs
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto você pesa em KG?");
        Double MC = entrada.nextDouble();

        System.out.println("Qual a sua altura em Metros ?");
        Double altura = entrada.nextDouble();

        Double IMC = (MC/(altura*altura));
        System.out.printf("Seu IMC: %.2f \n", IMC);

        //Closing
        entrada.close();

        //Comparing chain & Display
        if(IMC < 18.5)
            System.out.println("Magro");
        else if(IMC >= 18.5)
            System.out.println("Normal");
        else if(IMC >= 25.0)
            System.out.println("Sobrepeso");
        else if(IMC >= 30.0)
            System.out.println("Obeso");
        else if(IMC >= 35.0)
            System.out.println("Obesidade Morbida");
        else
        System.out.println("Valor Irreal");

    }

    public static void ex2()

    {
        // Password Register
        Scanner inputPassword = new Scanner(System.in);
        System.out.println("*Register your password:");
        String password = inputPassword.nextLine();
        
        

       //Getting 2 integer numbers
        System.out.println("*Input two integer numbers:");
        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);

        int num1 = inputNum1.nextInt();
        int num2 = inputNum2.nextInt();
        double div = num1/num2;

        //Password Request
        System.out.println("*What is the password?");
        Scanner demandPassword = new Scanner(System.in);
        String passwordAtempt = demandPassword.next();

        
        //Showing result (Or not)
        if (passwordAtempt.equals(password))
            {
                System.out.printf("The div of the two integers is: %.1f", div);
            }

        else 
            {
                System.out.println("Wrong Password.");
                System.exit(0);
            }

        inputPassword.close();
        inputNum1.close();
        inputNum2.close();
        demandPassword.close();
        





        



        
    }
    
    public static void ex3()
    {

        // Getting Name Inputs
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um nome: ");
        String nome1 = entrada.next();

        System.out.println("Digite um nome: ");
        String nome2 = entrada.next();

        System.out.println("Digite um nome: ");
        String nome3 = entrada.next();

        System.out.println("Digite um nome: ");
        String nome4 = entrada.next();

        System.out.println("Digite um nome: ");
        String nome5 = entrada.next();

        String maior;

        //Comparing the string sizes    
        if (nome1.compareTo(nome2) > 0) {maior = nome1;}
        else {maior = nome2;}

        if (maior.compareTo(nome3) > 0) {}
        else {maior = nome3;}

        if(maior.compareTo(nome4) > 0)  {}
        else {maior = nome4;}

        if(maior.compareTo(nome5) > 0) {}
        else {maior = nome5;}


        //Displaying biggest string
        System.out.printf("The Bigger String is: %s", maior);

        //Closing
        entrada.close();








    }

    public static void ex4()
    {
        //Function

        String CorrectPassword = "123456";

        System.out.println("Password:    ");
        Scanner entrada = new Scanner (System.in);
        String AttemptPassword = entrada.next();

        if (AttemptPassword.equalsIgnoreCase(CorrectPassword)) {System.out.println("Acesso Liberado");}
        else {System.out.println("Acesso Negado");}

        entrada.close();
    }

    public static void ex5()
    {

        
    }



























}

    