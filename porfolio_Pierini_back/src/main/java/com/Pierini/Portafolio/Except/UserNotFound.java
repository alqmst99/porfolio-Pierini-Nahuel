
package com.Pierini.Portafolio.Except;


public class UserNotFound extends RuntimeException{
    public UserNotFound (String message ){
        super(message);
    }
    
}
