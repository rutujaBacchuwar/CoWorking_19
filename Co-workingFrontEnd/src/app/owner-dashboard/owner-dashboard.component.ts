import { Component, OnInit } from '@angular/core';
import { OwnerDashboardService } from '../owner-dashboard.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-owner-dashboard',
  templateUrl: './owner-dashboard.component.html',
  styleUrls: ['./owner-dashboard.component.css']
})
export class OwnerDashboardComponent implements OnInit {

 
  

  _authHttp: any;
  space: any;

 
  constructor(private ownerService:OwnerDashboardService,private route: ActivatedRoute, private router:Router) { }
  
  ArrayOfOwnerData:any=[];
  ArrayOfSpaceData:any=[];
  ngOnInit(){
  
      const ownerdata = this.route.snapshot.paramMap.get('name');
     
        
      this.ownerService.searchByName(ownerdata).subscribe(data => {
       
        this.ArrayOfOwnerData=data;
      
        console.log(this.ArrayOfOwnerData) ; 
        console.log(ownerdata);
    
     //this.ArrayOfOwnerData=data;
  });
  this.ownerService.getSpaceByName(ownerdata).subscribe(data => {
    //data=ownerdata;
    this.ArrayOfSpaceData=data;
   // data=ownerdata;
     console.log(data);
    
     });
  }

 
  clickEvent(ArrayOfOwnerData){
    console.log(ArrayOfOwnerData)
    this.router.navigateByUrl('/add-property/'+ArrayOfOwnerData.name+'/'+ArrayOfOwnerData.contactNumber+'/'+ArrayOfOwnerData.emailId);
  }

  refreshCustomersList()
   {
       this._authHttp.get(
               this.ownerService.getSpaceByName + "http://localhost:3000/Space-Details"
           )
         
           .subscribe(
               successResponse=>
               {
                   this.space = successResponse.data.space;
               },
               () => console.log("Request Completed")
           )

   }

  deleteSpace(ArrayOfSpaceData){
    console.log(ArrayOfSpaceData.spaceId);
    this.ownerService.deleteSpace(ArrayOfSpaceData.spaceId).subscribe(
      success=>
      {
          var index = this.ArrayOfSpaceData.indexOf(ArrayOfSpaceData, 0);
          if (index > -1)
          {
              this.ArrayOfSpaceData.splice(index, 1);
              this.refreshCustomersList();
          }
      }
    );
  

}

}
