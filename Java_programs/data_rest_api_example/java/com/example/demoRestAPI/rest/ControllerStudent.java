package com.example.demoRestAPI.rest;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path="studentapi")
public class ControllerStudent {
}
