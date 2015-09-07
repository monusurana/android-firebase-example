package com.example.android.firebaseexample.News;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CricketNews {

    private List<Item> item = new ArrayList<Item>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The item
     */
    public List<Item> getItem() {
        return item;
    }

    /**
     *
     * @param item
     * The item
     */
    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}