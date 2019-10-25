import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { DiceRollComponent } from "./dice-roll.component";
import {DiceRollService} from "./dice-roll.service";


@NgModule({
    declarations: [DiceRollComponent],
    imports: [BrowserModule],
    providers: [DiceRollService],
    bootstrap: [DiceRollComponent]
})
export class DiceRollModule {

}