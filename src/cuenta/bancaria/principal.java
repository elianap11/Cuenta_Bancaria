/*
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


public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria();
        CuentaBancaria cuentaBancaria3 = new CuentaBancaria();
        CuentaBancaria cuentaBancaria4 = new CuentaBancaria();
        CuentaBancaria cuentaBancaria5 = new CuentaBancaria();



    }
    
}
