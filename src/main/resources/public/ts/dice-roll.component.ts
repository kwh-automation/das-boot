import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'dice-roll',
    templateUrl: './dice-roll.component.html',
    styleUrls: ['./dice-roll.component.css']
})

export class DiceRollComponent implements OnInit {

    constructor() { }

    ngOnInit() { }

}
//
// module app.directives {
//
//     class DiceRollComponent implements ng.IComponentOptions {
//
//         public bindings: any;
//         public controller: any;
//         public templateUrl: string;
//
//         constructor() {
//             this.bindings = {
//                 textBinding: '@',
//                 dataBinding: '<',
//                 functionBinding: '&'
//             };
//             this.controller = DiceRollController;
//             this.templateUrl = 'dice-roll.component.html'
//         }
//     }
//
//     angular.module('appModule').component('diceRollComponent', new DiceRollComponent());
// }