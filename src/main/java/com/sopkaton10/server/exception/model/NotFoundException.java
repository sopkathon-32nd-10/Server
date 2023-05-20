package com.sopkaton10.server.exception.model;

import com.sopkaton10.server.exception.Error;

public class NotFoundException extends SoptException{

    public NotFoundException(Error error, String message) {
        super(error, message);
    }
}
