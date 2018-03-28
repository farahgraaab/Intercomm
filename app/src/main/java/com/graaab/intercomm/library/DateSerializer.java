package com.graaab.intercomm.library;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static android.provider.Settings.System.DATE_FORMAT;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class DateSerializer implements JsonDeserializer<Date>{

    private final String TAG = DateSerializer.class.getSimpleName();

//    @Override
//    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
//        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
//        formatter.setTimeZone(TimeZone.getDefault());
//        String dateFormatAsString = formatter.format(date);
//        return new JsonPrimitive(dateFormatAsString);
//    }

    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return null;
    }
}
