package main.java.com.InteligentesFlotas.alertasFlotas.service;

public class EmailAlert implements Message {
    @Override
    public void send(String message, Integer conductorId) {
        System.out.println("Enviando alerta por correo al conductor " + conductorId + ": " + message);
    }
}
