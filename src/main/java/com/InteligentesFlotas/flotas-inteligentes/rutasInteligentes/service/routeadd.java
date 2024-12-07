package main.java.com.InteligentesFlotas.flotas-inteligentes.rutasInteligentes.service;
//guardamos la ruta 
//esta depende de la abstracción lo cual hace que estemos cumpliendo la D
//esto permite que routeradd funcione con cualquier implementación de router
public class routeadd {
    private final Saver saver;

    public RouteService(RouteSaver saver) {
        this.saver = saver;
    }

    public void saveRoute(String route) {
        saver.save(route);
    }
}
