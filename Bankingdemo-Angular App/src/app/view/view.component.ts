import { Component, OnInit } from '@angular/core';
import { BankingService } from '../banking.service';
import { HttpClientModule } from '@angular/common/http';
@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  constructor(private bservice : BankingService) {this.viewdetails(); }
  user:any;
  ngOnInit(): void {
  }
  viewdetails()
  {
    this.bservice.viewdata().subscribe(

      (resp) => { this.user=resp; } );
  }
}