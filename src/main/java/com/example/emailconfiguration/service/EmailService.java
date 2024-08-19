package com.example.emailconfiguration.service;

import com.example.emailconfiguration.model.Email;
import com.example.emailconfiguration.model.Languages;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmailService implements IEmailService {

    private static final Map<String, Email> emails;

    static {
        emails = new HashMap<>();
        emails.put("1", new Email("1", "english", "25", true, "kho"));
        emails.put("2", new Email("2", "vietnamese", "50", false, "kho vkl"));
        emails.put("3", new Email("3", "japanese", "25", false, "kho"));
        emails.put("4", new Email("4", "chinese", "25", true, "kho"));
    }


    @Override
    public List<Email> findAll() {
        return new ArrayList<>(emails.values());
    }

    @Override
    public void addEmail(Email email) {
        emails.put(email.getId(), email);
    }
}
