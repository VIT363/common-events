package com.vitzemtsov.common.events;

import java.util.UUID;

public record FileConversionRequest(
        UUID fileId,
        String bucketName,
        String objectName
) {}