import { Component, OnInit } from '@angular/core';
import { AccountService } from '../account.service';
@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.less']
})
export class CarListComponent implements OnInit {
  cars: Array<any>;


  constructor(private accountService: AccountService) { }

  ngOnInit() {
	this.accountService.getAll().subscribe(data => {
      this.cars = data;
	  console.log(data);
    });
  }

}
