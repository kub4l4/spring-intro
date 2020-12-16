package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("messageService1")
public class RandomTextMessageService implements MessageService {
    String [] tablica = {"Lampa", "ksiazka", "szmata", "kon", "soczek", "ptaszek", "kabel", "woda", "kubek", "spinacz"};
    @Override
    public String getMessage() {
        int randomix = new Random().nextInt(tablica.length);

        return tablica[randomix];
    }
}
