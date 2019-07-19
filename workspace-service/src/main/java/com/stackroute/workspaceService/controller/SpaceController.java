package com.stackroute.workspaceService.controller;

import com.stackroute.kafka.domain.Space;
import com.stackroute.workspaceService.domain.MySpace;
import com.stackroute.workspaceService.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class SpaceController {
    SpaceService spaceService;

    @Autowired
    public SpaceController(SpaceService spaceService) {

        this.spaceService = spaceService;
    }

    @PostMapping("savespace")
    public ResponseEntity<?> saveSpace(@RequestBody MySpace myspace){
        ResponseEntity responseEntity = new ResponseEntity<MySpace>(spaceService.saveSpace(myspace), HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("spaces")
    public ResponseEntity<?> getSpace(){
        ResponseEntity responseEntity=new ResponseEntity<List<MySpace>>(spaceService.getAllSpaces(),HttpStatus.OK);
        return responseEntity;
    }

//    @GetMapping("space/{spaceName}")
//    public ResponseEntity<?> getByName(@PathVariable String spaceName){
//        System.out.println("spacename is"+spaceName);
//        MySpace mySpace = spaceService.findBySpaceName(spaceName);
//        System.out.println("==============================");
//        System.out.println("space is"+mySpace.toString());
//        ResponseEntity responseEntity=new ResponseEntity<MySpace>(mySpace, HttpStatus.OK);
//
//        return responseEntity;
//
//
//
//    }


    @GetMapping("space/{spaceName}")
    public MySpace getByName(@PathVariable String spaceName){

        System.out.println(spaceService.findBySpaceName(spaceName));

       return spaceService.findBySpaceName(spaceName);


    }
    }

