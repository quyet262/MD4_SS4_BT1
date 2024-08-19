package com.example.emailconfiguration.service;

import com.example.emailconfiguration.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> findAll();
    void addEmail(Email email);

}
