package com.graaab.intercomm.library;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class DateDeserializer implements JsonDeserializer<Date>{
    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//        return new Date(TimeUnit.SECONDS.toMillis(Long.valueOf(element.getAsString())));
        return null;
    }
}
