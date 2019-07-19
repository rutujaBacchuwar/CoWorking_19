import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SpaceService {

  
  constructor(private httpClient:HttpClient) { }

  // getSpace():any{
  //   return this.httpClient.get("http://13.235.110.75:3000/space");
  // }

  getSpaceDetails(name):any{
    console.log("In getspaceDetails")
    console.log(name)
    return this.httpClient.get(`http://localhost:8090/api/v1/space/spaces/${name}`)
  }

}
