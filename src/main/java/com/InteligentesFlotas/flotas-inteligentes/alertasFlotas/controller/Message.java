package main.java.com.InteligentesFlotas.flotas-inteligentes.alertasFlotas.controller;

//En esta interfas estamos creando una función que nos va a a ayudar a mandar la alerta al conductor
//Vamos a cumplir con el principio O abierto y cerrado
public interface Message {
    void send(String mensaje, Integer conductor);
}