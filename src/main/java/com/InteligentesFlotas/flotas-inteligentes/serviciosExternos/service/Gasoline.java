package main.java.com.InteligentesFlotas.flotas-inteligentes.serviciosExternos.service;

//Implementaciones de la L, en este sistema de pagos podemos observar una interfas y los metodos funcionan independientemente

public interface Gasoline {
    void pay(double precio);
}
//Podemos utlizar cualquier implementación de la interfaz gasoline
public class CreditPay implements Gasoline {
    @Override
    public void pay(double precio) {
        System.out.println("pago con tarjeta de crédito de: " + precio);
    }
}

public class foreignPay implements Gasoline {
    @Override
    public void pay(double precio) {
        System.out.println("pago en efectivo de: " + precio);
    }
}
// Las subclases pueden sustituir a la interfaz gasoline sin que se rompa el sistema.
// por ende estamos cumpliendo la L de el principio SOLID
