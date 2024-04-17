package com.derster.booknetwork.file;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FileUtils {
    public static byte[] readFileFromLocation(String fileUrl) {
        if (StringUtils.isBlank(fileUrl)){
            return null;
        }
        Path filePath = new File(fileUrl).toPath();
        try {
            return Files.readAllBytes(filePath);
        } catch (IOException e) {
            log.warn("No file found in the path {}", fileUrl);
        }
        return new byte[0];
    }
}
