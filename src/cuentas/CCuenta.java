package cuentas;

public class CCuenta {

	/**
	 * 
	 */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	public CCuenta() {
	}

	/**
	 * Parametros del constructor
	 * 
	 * @param nom  Parametro que da el nombre del propietario de la cuenta
	 * @param cue  parametro para recibir el valor de la variable cuenta
	 * @param sal  saldo de la cuenta
	 * @param tipo tip de Interes
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Metodo para obtener el saldo de una cuenta
	 * 
	 * @return devuelve el saldo de la cuenta
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Metodo para ingresar una cantidad en la cuenta
	 * 
	 * @param cantidad cantida a ingresar, se sumara al saldo actual
	 * @throws Exception tiene que ser < 0
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Metodo para retirar dinero de la cuenta
	 * 
	 * @param cantidad cantidad a retirar sera restada del saldo actual
	 * @throws Exception se lanza si es mayor que el saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Metodo para extraer el nombre
	 * 
	 * @return nombre del titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para setear el nombre del titular de la cuenta
	 * 
	 * @param nombre del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para coger el valor de cuenta
	 * @return devuelve cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Metodo para dar un valor a cuenta
	 * @param cuenta 
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Metodo para obtener el saldo
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo para setear saldo
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}