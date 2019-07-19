package com.stackroute.workspaceService.service;
import com.stackroute.workspaceService.domain.MySpace;

import java.util.List;


public interface SpaceService {
    public MySpace saveSpace(MySpace myspace);
    public MySpace findBySpaceName(String spaceName);
    public List<MySpace> getAllSpaces() ;

}
