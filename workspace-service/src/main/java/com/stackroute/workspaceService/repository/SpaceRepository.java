package com.stackroute.workspaceService.repository;

import com.stackroute.workspaceService.domain.MySpace;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SpaceRepository extends MongoRepository<MySpace,Integer> {

    @Query("{ 'spaceName' : '?0'}")
    MySpace findBySpaceName(String spaceName);

}
