import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BankingService } from '../banking.service';
import {HttpClientModule} from '@angular/common/http';
@Component({
  selector: 'app-deposit',
  templateUrl: './deposit.component.html',
  styleUrls: ['./deposit.component.css']
})
export class DepositComponent implements OnInit {

  constructor(private bservice :BankingService) { }

  ngOnInit(): void {
  }
depositdetails(depositform: any)
{
    this.bservice.depositdata(depositform.value).subscribe();
}
}
