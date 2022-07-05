import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class BankingService {

  constructor(private http : HttpClient) { }
  url = "http://localhost:9003/deposit";
  url1 = "http://localhost:9003/withdrawl";
  url2 = "http://localhost:9003/view";
depositdata(dvalue: any)
{
   return this.http.post(this.url,dvalue);
}
withdrawldata(removedata: any)
{
  return this.http.post(this.url1,removedata);
}
viewdata()
{
  return this.http.get(this.url2);
}
}
