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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Unit of usage in Langfuse
 */
@JsonAdapter(ModelUsageUnit.Adapter.class)public enum ModelUsageUnit {
  
  CHARACTERS("CHARACTERS"),
  
  TOKENS("TOKENS"),
  
  MILLISECONDS("MILLISECONDS"),
  
  SECONDS("SECONDS"),
  
  IMAGES("IMAGES");

  private String value;

  ModelUsageUnit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ModelUsageUnit fromValue(String value) {
    for (ModelUsageUnit b : ModelUsageUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ModelUsageUnit> {
    @Override
    public void write(final JsonWriter jsonWriter, final ModelUsageUnit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ModelUsageUnit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ModelUsageUnit.fromValue(value);
    }
  }
}

