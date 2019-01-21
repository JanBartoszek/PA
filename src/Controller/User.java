package Controller;

import Model.Persistence.Mediatheque;
import Model.Operator.Operator;
import Model.Operator.Operators;

public class User extends Operator {
    public User(Operators type, String name, Mediatheque mediatheque) {
        super(type, name, mediatheque);
    }
}
