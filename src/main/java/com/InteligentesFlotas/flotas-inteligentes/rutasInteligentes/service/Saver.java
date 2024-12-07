package main.java.com.InteligentesFlotas.flotas-inteligentes.rutasInteligentes.service;
//implementamos la interfaz router este nos ayuda a que esta interfaz pueda modificarse sin afectar al sistema
public class Saver implements Router {
    public void save(String route) {
        System.out.println("Ruta guardada: " + route);
    }
}

