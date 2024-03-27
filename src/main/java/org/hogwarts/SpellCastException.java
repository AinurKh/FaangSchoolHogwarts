package org.hogwarts;

public class SpellCastException extends RuntimeException{
    public SpellCastException() {
    }

    public SpellCastException(String message) {
        super(message);
    }


}
