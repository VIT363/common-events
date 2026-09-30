package com.vitzemtsov.common.events;

import java.util.UUID;

public record FileConvertedEvent(
        UUID fileId,
        ConversionStatus status,
        String bucketName,
        String objectName,
        String errorMessage
) {}