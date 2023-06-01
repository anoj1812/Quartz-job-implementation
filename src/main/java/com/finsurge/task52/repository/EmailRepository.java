package com.finsurge.task52.repository;

import com.finsurge.task52.entity.Email;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository {
    private List<Email> list = new ArrayList<Email>();

    public void save() {
        Email email = new Email();
        list.add(0,email);
    }
    public Email getEmail() {
        return list.get(0);
    }
}


