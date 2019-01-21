package Controller;

import Model.Persistence.Mediatheque;
import Model.Operator.Operator;
import Model.Operator.Operators;

public class Manager extends Operator {
    public Manager(Operators type, String name, Mediatheque mediatheque) {
        super(type, name, mediatheque);
    }
}
