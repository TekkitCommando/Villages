package com.domsplace.Villages.Events;

import com.domsplace.Villages.Bases.CancellableEvent;
import com.domsplace.Villages.Objects.Resident;
import com.domsplace.Villages.Objects.Village;

public class ResidentRemovedEvent extends CancellableEvent {
    private Resident resident;
    private Village village;
    
    public ResidentRemovedEvent(Resident r, Village v) {
        this.resident = r;
        this.village = v;
    }
    
    public Resident getResident() {return this.resident;}
    public Village getVillage() {return this.village;}
}
