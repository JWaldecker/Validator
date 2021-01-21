package org.javawebstack.validator.rule;

import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.validator.Validator;

import java.util.UUID;

public class UUIDRule implements ValidationRule {

    public String validate(Validator validator, AbstractElement value) {
        if(!value.isString())
            return "Not a valid uuid value";
        try {
            UUID.fromString(value.string());
            return null;
        }catch (Exception ignored){
            return "Not a valid uuid value";
        }
    }

}
