package com.h3.spring.hellodi;

import com.h3.spring.helloaop.Minstrel;

public class BraveKnight implements Knight {
    private Quest quest;
    //private Minstrel minstrel;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    /*public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }*/

    public void embarkOnQuest() {
        //minstrel.singBeforeQuest();//通过切面完成同样的效果
        quest.embark();
        //minstrel.singAfterQuest();
    }
}
