import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {
 
  CustomerArray : any[] = [];
  isResultLoaded = false;
  isUpdateFromActive = false;

  customername: string = "";
  customeraddress: string = "";
  mobile: Number=0;

  currentCustomerID = "";

  constructor(private http: HttpClient)
     {
      this.getAllCustomer();
     }
     getAllCustomer()
     {
      this.http.get("http://localhost:8084/api/v1/customer/getAllCustomer")
      .subscribe((resultData: any)=>
      {
        this.isResultLoaded = true;
        console.log(resultData);
        this.CustomerArray = resultData;
      } );
     }
     register()
     {
      let bodyData = {
        "customername" : this.customername,
        "customeraddress" : this.customeraddress,
        "mobile" : this.mobile
      };
      this.http.post("http://localhost:8084/api/v1/customer/save",bodyData,{responseType:'text'})
      .subscribe((resultData: any)=>
      {
        console.log(resultData);
        alert("Customer Details Registered successfully");
        this.getAllCustomer();

        this.customername = '';
        this.customeraddress = '';
        this.mobile = 0;
      } );
     }
     setUpdate(data: any)
     {
      this.customername = data.customername;
      this.customeraddress = data.customeraddress;
      this.mobile = data.mobile;
      this.currentCustomerID = data.customerid;
     }
     UpdaterRecords()
     {
      let bodyData = {
        "customerid" : this.currentCustomerID,
        "customername" : this.customername,
        "customeraddress" : this.customeraddress,
        "mobile" : this.mobile
      };
      this.http.put("http://localhost:8084/api/v1/customer/update",bodyData,{responseType:'text'})
      .subscribe((resultData: any)=>
      {
         console.log(resultData);
         alert("Customer Details Updated")
         this.getAllCustomer();
         this.customername = '';
         this.customeraddress = '';
         this.mobile = 0;
      });
     }
     save()
     {
      if(this.currentCustomerID == '')
      {
        this.register();
      }
      else{
          this.UpdaterRecords();
      }
     }
     setDelete(data: any)
     {
      this.http.delete("http://localhost:8084/api/v1/customer/deletecustomer"+ "/"+data.customerid,
        {responseType:'text'}).subscribe((resultData: any)=>
        {
              console.log(resultData);
              alert("customer details deleted")
              this.getAllCustomer();

              this.customername = '';
              this.customeraddress = '';
              this.mobile = 0;
        });
     }
}
