package cuentas;

public class Main {
	/**
	 * Metodo Principal , ejecuta el programa
	 * @param args
	 */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * 
     * Metodo que realiza las operaciones de ingresar y 
     * retirar sobre los objetos de la clase cuenta
     * @param cantidad recoge la cantida a ingresar
     * Se ha usado el parametro cantidad para ingresar.
     */
	public static void operativa_cuenta(float cantidad) {
		cantidad = 2300;
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(cantidad);
            System.out.println("El saldo actual es "+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es "+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}