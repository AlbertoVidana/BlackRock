package com.example.demo.repositories;

import com.example.demo.models.InvalidTransaction;
import com.example.demo.models.TemporaryValidationRestrictions;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TemporaryValidationRestrictionRepository {
    private List<InvalidTransaction> restrictionsList = new ArrayList<>();

    public TemporaryValidationRestrictionRepository() {
        // Initialize with some dummy restrictions for testing
        // restrictionsList.add(new InvalidTransaction("2023-10-01", 110.0, 200.0, 90.0, "Invalid amount"));
        // restrictionsList.add(new InvalidTransaction("2023-10-12 20:15", 250.00, 300.00, 50.00, "Celling exceeded"));
    }
    public List<InvalidTransaction> addRestrictions(List<InvalidTransaction> restrictions) {
        for (InvalidTransaction restriction : restrictions) {
            long i = (long) Math.ceil(restriction.getAmount());
            long result = ((i + 99) / 100);
            restriction.setCelling(result * 100.0);
            restriction.setRemanent(restriction.getCelling() - restriction.getAmount());
            restriction.setErrorMessage("Restriction error due to :");
            restrictionsList.add(restriction);
        }
        return restrictionsList;
    }
    public List<InvalidTransaction> getAll() {
        return restrictionsList;
    }
    public TemporaryValidationRestrictions addTemporaryValidationRestrictions(TemporaryValidationRestrictions restrictions) {
        restrictions.setInvalidTransactions(addRestrictions(restrictions.getInvalidTransactions()));
        return restrictions;
    }

}
