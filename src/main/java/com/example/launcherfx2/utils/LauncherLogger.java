package com.example.launcherfx2.utils;

import com.example.launcherfx2.utils.constants.GeneralConstants;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LauncherLogger {
    private static final Logger LOGGER = Logger.getLogger(LauncherLogger.class.getSimpleName());
    private static FileHandler fileHandler;

    /**
     * Gets the logger.
     *
     * @return The {@link Logger} created.
     *
     * @author Pedro Henrique Alves Cruz (phac@cin.ufpe.br - pedro.ha.cruz2022@gmail.com)
     */
    public static Logger getLogger() throws IOException {
        if (fileHandler != null) {
            fileHandler.close();
        }
        fileHandler = new FileHandler(GeneralConstants.LOG_FILE_PATH.toString(), true);
        LOGGER.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        return LOGGER;
    }
}
