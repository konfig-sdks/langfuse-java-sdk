/*
 * langfuse
 * ## Authentication  Authenticate with the API using Basic Auth, get API keys in the project settings:  - username: Langfuse Public Key - password: Langfuse Secret Key
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ObservationType
 */
@JsonAdapter(ObservationType.Adapter.class)public enum ObservationType {
  
  SPAN("SPAN"),
  
  GENERATION("GENERATION"),
  
  EVENT("EVENT");

  private String value;

  ObservationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ObservationType fromValue(String value) {
    for (ObservationType b : ObservationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ObservationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ObservationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ObservationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ObservationType.fromValue(value);
    }
  }
}

