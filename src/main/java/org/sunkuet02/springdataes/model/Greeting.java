package org.sunkuet02.springdataes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.io.Serializable;

@Document(indexName = "index")
public class Greeting implements Serializable{

    @Id
    private String id;

    @MultiField(
            mainField = @Field(type = FieldType.String),
            otherFields = {
                    @InnerField(suffix = "raw", index = FieldIndex.not_analyzed, store = true, type = FieldType.String)
            }
    )
    private String username;


    private String message;


    public Greeting() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
