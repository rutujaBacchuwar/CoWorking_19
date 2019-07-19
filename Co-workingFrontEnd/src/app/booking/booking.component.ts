// import { Component, OnInit } from '@angular/core';
// import { SpaceService } from '../space.service';

// @Component({
//   selector: 'app-booking',
//   templateUrl: './booking.component.html',
//   styleUrls: ['./booking.component.css']
// })
// export class BookingComponent implements OnInit {


//   arrayOfData: any=[];

//   selectedSpaces = []

//   constructor(private spaceService: SpaceService) { }

//   ngOnInit() {

//     this.spaceService.getSpace().subscribe(a=>
//       {
//         console.log(a, "?????????");
//         this.arrayOfData=a;
//       })
//   }
//    demo(){
//     window.alert("Booking Suceesfully");
//   }
// }

// import { Component, OnInit } from '@angular/core';
// import { SpaceService } from '../space.service';
// import { HttpClient } from '@angular/common/http';
// import { CardService } from '../card.service';
// @Component({
//  selector: 'app-booking',
//  templateUrl: './booking.component.html',
//  styleUrls: ['./booking.component.css']
// })
// export class BookingComponent implements OnInit {
//  arrayOfData: any=[];
//   selectedSpaces = []
//   arrayOfDetails: any=[]
//  total:any;
// addCost = []
// arrayOfCategory = []
// location:any;
// space:any;
//  constructor(private spaceService: SpaceService,private httpClient: HttpClient,private cardService:CardService) { }
//  ngOnInit() {
//    console.log(sessionStorage.getItem('spaceName'));
//    this.location=sessionStorage.getItem('spaceName')
//    console.log(sessionStorage.getItem('locationName'));
//    this.space=sessionStorage.getItem('locationName')
//    console.log("In NgOninit")
//    // console.log(this.locationName);
//    this.getModal();
//  }
// addSpace(a, rate, count, name) {
//  console.log(a,rate,count,name)
//  let obj = {
//    rate:  rate,
//    count: count,
//  name: name,
//    // id: id,
//  }
//  this.selectedSpaces.push(obj)
// }
// book() {
// console.log(this.selectedSpaces)
// }
// public num1:number;
// public num2:number;
// public result:number;
//  calc(){
//  this.result=this.num1*this.num2;
//  // console.log(this.result)
//  this.addCost.push(this.result);
//  console.log(this.addCost);
//  }
//  sum(){
//  this.total = this.addCost.reduce((acc = 0, curVal) => {
//    return acc = acc + curVal;
//  })
//  console.log(this.total, "This is the Total")
//  console.log(this.total);
//  // this.addCost.push(total);
//  }
//  getModal():any{
//    this.spaceService.getSpace().subscribe(data=>
//      {
//        console.log(data, "?????????");
//        this.arrayOfData=data;
//      })
//  }
// }

import { Component, OnInit } from '@angular/core';
import { SpaceService } from '../space.service';
import { HttpClient } from '@angular/common/http';
import { CardService } from '../card.service';



@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {


  arrayOfData: any=[];
  arrayOfCategories: any=[]
selectedThing = [];

   selectedSpaces = []
   
   arrayOfDetails: any=[]
  total:any;

addCost = []
   

arrayOfCategory = []
location:any;
space:any;
capacity:any;
categoryName:any;
hourlyPrice:any;
dailyPrice:any;
monthlyPrice:any;
name:any;
  constructor(private spaceService: SpaceService,private httpClient: HttpClient,private cardService:CardService) { }

  ngOnInit() {

    
   
    console.log("In Booking comp ts")

    console.log("In NgOninit")
  
    this.getModal();
    
  }



addSpace(a, rate, count, name) {
  console.log(a,rate,count,name)
  let obj = {
    rate:  rate,
    count: count,
  name: name,
    // id: id,
    

  }
  this.selectedSpaces.push(obj)
}
book() {


console.log(this.selectedSpaces)

}

public num1:number;
 public num2:number;
 public result:number;

 
  calc(){
  

  this.result=this.num1*this.num2;
  // console.log(this.result)
 
  
  this.addCost.push(this.result);

  console.log(this.addCost);
  }

  sum(){
  this.total = this.addCost.reduce((acc = 0, curVal) => {
    return acc = acc + curVal;
  })

  console.log(this.total, "This is the Total")
  console.log(this.total);

  // this.addCost.push(total);
  }




  getModal():any{
    this.name=sessionStorage.getItem("spaceName")
    console.log("getting space name")
    console.log(this.name)
    this.spaceService.getSpaceDetails(this.name).subscribe(data=>
      {
        console.log(data);
        this.arrayOfData=data;
        this.arrayOfCategories=this.arrayOfData.category
        console.log(this.arrayOfCategories);
        
      })
  }


  pushthisthing(thisthing){
    console.log(thisthing, "sdfhskjdfhskjhfdkshfdkjsh")
    this.selectedThing = thisthing;
  }
   
}



