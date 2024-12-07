package main.java.com.InteligentesFlotas.flotas-inteligentes.alertasFlotas.service;

public class AlertMain {
    public static void main(String[] args) {
        // Enviar alerta por correo
        Message emailAlert = new EmailAlert();
        ServiceAlert emailService = new ServiceAlert(emailAlert);
        emailService.sendAlert("La flota nacesita reparacíones", 189282);

        // Enviar alerta por SMS
        Message smsAlert = new SMSAlert();
        ServiceAlert smsService = new ServiceAlert(smsAlert);
        smsService.sendAlert("El estado de la flota es neutro", 1829);
    }
}
