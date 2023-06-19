package com.ecews.mqlamisplus.utility;




import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<LocalDateTime> {
    @Override
    public LocalDateTime deserialize(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws java.io.IOException {
        return LocalDateTime.parse(p.getValueAsString(), DateTimeFormatter.ISO_DATE_TIME);
    }
}
