package ec.epn.git.calculator;

public class CalculatorExecute {

    public static void main(String[] args) {
        System.out.println("==== CALCULATOR EXECUTE =====");

        Calculator c = new Calculator();
        int addition = c.addition(4, 7);
        System.out.println("c.addition(4,7) = " + addition);

        int substraction = c.substraction(7, 1);
        System.out.println("c.substrac(7,1) = " + substraction);

        // CAMBIOS PARA VERIFICAR EL PIPELINE

        int division = c.substraction(15, 3);
        System.out.println("This is the change, now a division is made");
        System.out.println("c.division(15,3) = " + division);


        // Integrantes del grupo
        System.out.println("Erick Bajaña");
        System.out.println("Anderson Pilataxi");
        System.out.println("Franciel Tipantuña");
        System.out.println("Andrés Veas");


    }

}
