package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessageTo(User user, String message) throws MessageNotSentException {
//        var userr = Optional.of(user)
//                .orElseThrow(() -> new MessageNotSentException("Object User was null"));
//
//        System.out.println("Sending message: " + message + " to: " + userr.getName());


        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        } else {
            throw new MessageNotSentException("Object User was null");
        }
    }
}