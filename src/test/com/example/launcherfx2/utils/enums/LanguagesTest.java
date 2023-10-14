package com.example.launcherfx2.utils.enums;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LanguagesTest {

    private final Locale portugueseBrazilian = Locale.forLanguageTag("pt-BR");

    private final Locale nonExistentLocale = new Locale("-1");

    static private ArrayList<Languages> availableLanguages;
    @Test
    void getExistentLanguageByLocale() {
        Optional<Languages> result = Languages.getLanguageByLocale(portugueseBrazilian);
        assertTrue(result.isPresent());
    }

    @Test
    void getExistentLanguageByLocaleResult() {
        Optional<Languages> result = Languages.getLanguageByLocale(portugueseBrazilian);
        assertEquals(result, Optional.of(Languages.Brazilian_Portuguese));
    }

    @Test
    void getNonExistentLanguageByLocale() {
        Optional<Languages> result = Languages.getLanguageByLocale(nonExistentLocale);
        assertTrue(result.isEmpty());
    }

    @Test
    void getNonExistentLanguageByLocaleResult() {
        Optional<Languages> result = Languages.getLanguageByLocale(nonExistentLocale);
        assertEquals(result, Optional.empty());
    }

    @Test
    void getLocale() {
        Languages ptBRLanguage = Languages.Brazilian_Portuguese;
        assertEquals(ptBRLanguage.getLocale(), portugueseBrazilian);
    }
}
