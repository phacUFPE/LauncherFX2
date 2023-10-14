package com.example.launcherfx2.utils.constants;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GeneralConstants {
    public static final String GENERAL_RESOURCES = "general";
    public static final String LANGUAGES_RESOURCES = "languages";
    public static final Path LOG_FILE_PATH = Paths.get(System.getProperty("user.dir"), "log.txt");
}
