package com.shoppershub.productservice.utils;

public class Constants {

    public final String EXCEPTON_MESSAGE ="API THROWN SOME EXCEPTION";

    public String PRODUCT_UPDATE_QUERYC ="UPDATE project.product SET product_name = :productName," +
            "product_description = :productDescription," +
            "price = :price>," +
            "exp_date = :expDate," +
            "WHERE product_id = :productId";
}
