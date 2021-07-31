package com.app.AssociationMapping.ApiController;

import java.util.List;

import javax.validation.Valid;

import com.app.AssociationMapping.entity.Account;
import com.app.AssociationMapping.service.ServiceManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyApiController extends BaseApiController
{
    @Autowired
    private ServiceManagerImpl service;
    
    @PostMapping(value="/accounts/post")
    public ResponseEntity<String> saveAccounts(@Valid @RequestBody Account acc)
    {
        service.getAcc(acc);
        return new ResponseEntity<String>("Records Inserted",HttpStatus.OK);
    }

    @GetMapping(value="/accounts")
    public ResponseEntity<List<Account>> fetchAccounts()
    {
        service.fetchAllAccounts();
        return new ResponseEntity<List<Account>>(service.fetchAllAccounts(),HttpStatus.OK);
    }
}
