package model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AccountConverter implements DynamoDBTypeConverter<String, Account> {

    public String convert(Account account) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(account);
    }


    public Account unconvert(String s) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(s, Account.class);
    }
}
