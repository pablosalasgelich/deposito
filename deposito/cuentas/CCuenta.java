package cuentas;

/**
 * Esta clase simula una cuenta bancaria con operaciones simples.
 * 
 * @author pablo salas gelich
 * @version 2.0
 * @since 1.0
 * 
 */
public class CCuenta {

	//declaración de varibles 
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con datos de la cuenta
     * @param nom nombre de la cuenta
     * @param cue número de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método permite conocer el estado de la cuenta 
     * @return método get que devuelve el saldo de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que permite ingresar cierta cantidad de dinero a la cuenta
     * @param cantidad es la cantidad a ingresar
     * @throws Exception Excepción en caso de ingresar un valor no válido
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que permite retirar cierta cantidad de dinero la cuenta
     * @param cantidad es la cantidad a retirar
     * @throws Exception Excepción en caso de ingresar un valor no válido
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre de la cuenta
     * @return String nombre de la cuenta
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la cuenta
	 * @param nombre nombre de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el número de identificación cuenta
	 * @return String con el número de identificación
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el número de identificación de la cuenta.
	 * @param cuenta número de identificación
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo de la cuenta
	 * @return double con el valor del saldo.
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Estable el saldo inicial de la cuenta
	 * @param saldo valor del saldo inicial
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interés de la cuenta
	 * @return dobule con el valor del tipo de interés
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Establece el tipo de interés de la cuenta
	 * @param tipoInteres valor con el tipo de interés
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
