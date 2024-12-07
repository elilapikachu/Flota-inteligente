package main.java.com.InteligentesFlotas.flotas-inteligentes.alertasFlotas.service;

public class AlertMain {
    public static void main(String[] args) {
        // Enviar alerta por correo
        Message emailAlert = new EmailAlert();
        ServiceAlert emailService = new ServiceAlert(emailAlert);
        emailService.sendAlert("Revise", 101);

        // Enviar alerta por SMS
        Message smsAlert = new SMSAlert();
        ServiceAlert smsService = new ServiceAlert(smsAlert);
        smsService.sendAlert("Revise el estado de su vehículo", 102);
    }
}
