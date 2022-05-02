/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MainImportDealBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-28T23:49:15.047006Z[Etc/UTC]")
public class MainImportDealBody {
  public static final String SERIALIZED_NAME_COLLECTION = "collection";
  @SerializedName(SERIALIZED_NAME_COLLECTION)
  private String collection;

  public static final String SERIALIZED_NAME_COLLECTION_PATH = "collectionPath";
  @SerializedName(SERIALIZED_NAME_COLLECTION_PATH)
  private String collectionPath;

  public static final String SERIALIZED_NAME_DEAL_I_DS = "dealIDs";
  @SerializedName(SERIALIZED_NAME_DEAL_I_DS)
  private List<Integer> dealIDs = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public MainImportDealBody() { 
  }

  public MainImportDealBody collection(String collection) {
    
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollection() {
    return collection;
  }


  public void setCollection(String collection) {
    this.collection = collection;
  }


  public MainImportDealBody collectionPath(String collectionPath) {
    
    this.collectionPath = collectionPath;
    return this;
  }

   /**
   * Get collectionPath
   * @return collectionPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollectionPath() {
    return collectionPath;
  }


  public void setCollectionPath(String collectionPath) {
    this.collectionPath = collectionPath;
  }


  public MainImportDealBody dealIDs(List<Integer> dealIDs) {
    
    this.dealIDs = dealIDs;
    return this;
  }

  public MainImportDealBody addDealIDsItem(Integer dealIDsItem) {
    if (this.dealIDs == null) {
      this.dealIDs = new ArrayList<>();
    }
    this.dealIDs.add(dealIDsItem);
    return this;
  }

   /**
   * Get dealIDs
   * @return dealIDs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDealIDs() {
    return dealIDs;
  }


  public void setDealIDs(List<Integer> dealIDs) {
    this.dealIDs = dealIDs;
  }


  public MainImportDealBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainImportDealBody mainImportDealBody = (MainImportDealBody) o;
    return Objects.equals(this.collection, mainImportDealBody.collection) &&
        Objects.equals(this.collectionPath, mainImportDealBody.collectionPath) &&
        Objects.equals(this.dealIDs, mainImportDealBody.dealIDs) &&
        Objects.equals(this.name, mainImportDealBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, collectionPath, dealIDs, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainImportDealBody {\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    collectionPath: ").append(toIndentedString(collectionPath)).append("\n");
    sb.append("    dealIDs: ").append(toIndentedString(dealIDs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("collection");
    openapiFields.add("collectionPath");
    openapiFields.add("dealIDs");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MainImportDealBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MainImportDealBody.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MainImportDealBody is not found in the empty JSON string", MainImportDealBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MainImportDealBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MainImportDealBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("collection") != null && !jsonObj.get("collection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collection").toString()));
      }
      if (jsonObj.get("collectionPath") != null && !jsonObj.get("collectionPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionPath").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("dealIDs") != null && !jsonObj.get("dealIDs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealIDs` to be an array in the JSON string but got `%s`", jsonObj.get("dealIDs").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MainImportDealBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MainImportDealBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MainImportDealBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MainImportDealBody.class));

       return (TypeAdapter<T>) new TypeAdapter<MainImportDealBody>() {
           @Override
           public void write(JsonWriter out, MainImportDealBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MainImportDealBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MainImportDealBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MainImportDealBody
  * @throws IOException if the JSON string is invalid with respect to MainImportDealBody
  */
  public static MainImportDealBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MainImportDealBody.class);
  }

 /**
  * Convert an instance of MainImportDealBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
