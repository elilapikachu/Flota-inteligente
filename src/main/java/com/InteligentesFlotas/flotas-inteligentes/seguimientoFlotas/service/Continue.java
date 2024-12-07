package main.java.com.InteligentesFlotas.flotas-inteligentes.seguimientoFlotas.service;

//Implementación de I segregación de interfaces

//tenemos dos interfaces
public interface Continue {
    void avanzar();
}

public interface GPS {
    void ubicacion();
}

//cada clase utliza lo que necesita las clases no contienen elementos que no necesitan 
public class Continuerun implements Continue {
    @Override
    public void avanzar() {
        System.out.println("La flota esta avanzando");
    }
}

//aqui podemos observar una implementación de ambas interfaces solo porque es necesario
public class rastrear implements Continue, GPS {
    @Override
    public void ubicacion() {
        System.out.println("Su ubicación actual es xxxxx");
    }

    @Override
    public void avanzar() {
        System.out.println("La flota esta avanzando en estos momentos....");
    }
}

//estamos evitando añadir funcionalidades que no usan ciertas clases y asi poder seguirlas usando a futuro de una manera optima y entendible 
//teniendo interfaces especificas para cada funcionalidad estamos cumpliendo con la I 
