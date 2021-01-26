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

	//declaraci�n de varibles 
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
     * @param cue n�mero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de inter�s de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * M�todo permite conocer el estado de la cuenta 
     * @return m�todo get que devuelve el saldo de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * M�todo que permite ingresar cierta cantidad de dinero a la cuenta
     * @param cantidad es la cantidad a ingresar
     * @throws Exception Excepci�n en caso de ingresar un valor no v�lido
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * M�todo que permite retirar cierta cantidad de dinero la cuenta
     * @param cantidad es la cantidad a retirar
     * @throws Exception Excepci�n en caso de ingresar un valor no v�lido
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
	 * Devuelve el n�mero de identificaci�n cuenta
	 * @return String con el n�mero de identificaci�n
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el n�mero de identificaci�n de la cuenta.
	 * @param cuenta n�mero de identificaci�n
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
	 * Devuelve el tipo de inter�s de la cuenta
	 * @return dobule con el valor del tipo de inter�s
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Establece el tipo de inter�s de la cuenta
	 * @param tipoInteres valor con el tipo de inter�s
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
