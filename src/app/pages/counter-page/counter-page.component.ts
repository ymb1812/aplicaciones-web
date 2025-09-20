import { Component, effect, signal } from '@angular/core';

@Component({
  selector: 'app-counter-page',
  imports: [],
  templateUrl: './counter-page.component.html',
})
export class CounterPageComponent { 
  counter = signal(10);

  increaseby(value: number = 1){
    this.counter.update(current => current + value);
  }

  decreaseby(value: number = 1){
    this.counter.update(current => current - value);
  }

  constructor(){

    const savevalue = localStorage.getItem('counter-value');
    if(savevalue){
      this.counter.set(Number(savevalue));
    }

    effect(() => {
      console.log('Counter changed: ', this.counter());
      localStorage.setItem('counter-value', this.counter().toString());
    });
  }
}
