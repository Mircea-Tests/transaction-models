package model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

public class TransactionTypeConverter implements DynamoDBTypeConverter<String, Transaction.TransactionType> {
    public String convert(Transaction.TransactionType transactionType) {
        return transactionType.getId().toString();
    }

    public Transaction.TransactionType unconvert(String s) {
        return Transaction.TransactionType.getById(Integer.parseInt(s));
    }
}
