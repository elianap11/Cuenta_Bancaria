/*
ejercicio para reforzar los conocimientos de POO.
Crea una clase llamada CuentaBancaria que tendrá los siguientes atributos: cbu, alias, saldo, moneda, tipoCuenta.
la moneda puede ser: peso, dolar o euro; el tipo de cuenta pueden ser Caja de Ahorros (CA) o Cuenta Corriente(CC).
el cbu que es un campo de 22 digitos, se genera dinamicamente.
el campo moneda y tipo de cuenta son obligatorios, el saldo por defecto es 0 y el alias es "mi.nuevo.alias".
cree los constructores que considere necesario.
cree los metodos get, set y mostrar que imprima las caracteristicas de una cuenta bancaria.
crear los metodos ingresarDinero y extraerDinero , que validen que el monto a extraer sea no negativa y que la operacion 
se pueda realizar, si el saldo lo permite.
crear en la clase Principal que tiene el metodo main : 5 CuentasBancarias , agregarlas a un arrayList a estas cuentas, 
comprobando que las cuentas no pueden tener el mismo cbu
* generar el archivo UML con la o las clases utilizadas : UMLetino - Free Online UML Tool for Fast UML Diagrams

 */
package cuenta.bancaria;

/**
 *
 * @author Yo
 */
public class CuentaBancaria {
    
    private Long cbu;
    private String alias;
    private Double saldo;
    private String moneda;
    private String tipoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Long cbu, String alias, Double saldo, String moneda, String tipoCuenta) {
        this.cbu = cbu;
        this.alias = "mi.nuevo.alias";
        this.saldo = 0D;
        this.moneda = moneda;
        this.tipoCuenta = tipoCuenta;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", alias=" + alias + ", saldo=" + saldo + ", moneda=" + moneda + ", tipoCuenta=" + tipoCuenta + '}';
    }
  
  
    
    
}
