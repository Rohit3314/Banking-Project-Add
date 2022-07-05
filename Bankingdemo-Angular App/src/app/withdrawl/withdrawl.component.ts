import { Component, OnInit } from '@angular/core';
import { BankingService } from '../banking.service';
import { HttpClientModule } from '@angular/common/http';
@Component({
  selector: 'app-withdrawl',
  templateUrl: './withdrawl.component.html',
  styleUrls: ['./withdrawl.component.css']
})
export class WithdrawlComponent implements OnInit {

  constructor(private bservice : BankingService) { }

  ngOnInit(): void {
  }
  withdrawldetails(withdrawlform: any)
  {
     this.bservice.withdrawldata(withdrawlform.value).subscribe();
  }
}
