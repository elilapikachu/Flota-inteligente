package main.java.com.InteligentesFlotas.alertasFlotas.service;

public class EmailAlert implements Message {
    @Override
    public void send(String message, Integer conductor) {
        System.out.println("Enviando alerta por correo al conductor " + conductor + ": " + message);
    }
}
