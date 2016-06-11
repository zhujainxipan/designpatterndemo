package com.ht.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by annuoaichengzhang on 16/6/11.
 */
public class ProductFactory {
    private static final Map<String, Product> preMap = new HashMap<>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        if (preMap.containsKey(type)) {
            product = preMap.get(type);
        } else {
            if (type.equals("Procuct1")) {
                product = new Product1();
            } else {
                product = new Product2();
            }
            preMap.put(type, product);
        }
        return product;
    }
}
