package main.java.com.InteligentesFlotas.alertasFlotas.service;

public class ServiceAlert {
    private Message message;

    public ServiceAlert(Message message) {
        this.message = message;
    }

    // Método que se encarga de envios de alertas
    public void sendAlert(String message, Integer conductor) {
        this.message.send(message, conductor);
    }
}
//podemos agregar mas formas de alerta sin tener que modificar la interfaz cumpliendo con la O de abierto y cerrado.