package com.example.launcherfx2.utils.enums;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public enum Languages {
    English(Locale.US), Brazilian_Portuguese(Locale.forLanguageTag("pt-BR"));

    private static final ResourceBundle languagesResource = ResourceBundle.getBundle("languages");

    private final Locale locale;

    /**
     *
     * @param locale The language {@link Locale}
     *
     * @author Pedro Henrique Alves Cruz (phac@cin.ufpe.br - pedro.ha.cruz2022@gmail.com)
     */
    Languages(Locale locale) {
        this.locale = locale;
    }

    /**
     * Gets the language given a {@link Locale}.
     *
     * @param locale {@link Locale}
     * @return The language wrapped in an {@link Optional<Languages>}
     *
     * @author Pedro Henrique Alves Cruz (phac@cin.ufpe.br - pedro.ha.cruz2022@gmail.com)
     */
    public static Optional<Languages> getLanguageByLocale (Locale locale) {
        for(Languages language: Languages.values()) {
            if (language.locale == locale) {
                return Optional.of(language);
            }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return languagesResource.getString(name());
    }

    /**
     * Gets the language {@link Locale}.
     *
     * @return The language {@link Locale}
     *
     * @author Pedro Henrique Alves Cruz (phac@cin.ufpe.br - pedro.ha.cruz2022@gmail.com)
     */
    public Locale getLocale() {
        return this.locale;
    }
}