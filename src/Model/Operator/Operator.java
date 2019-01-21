package Model.Operator;

import Model.Persistence.Mediatheque;

public abstract class Operator {

    protected Operators type;
    protected String name;
    protected Mediatheque mediatheque;

    public Operator(Operators type, String name, Mediatheque mediatheque) {
        this.type = type;
        this.name = name;
        this.mediatheque = mediatheque;
    }
}
