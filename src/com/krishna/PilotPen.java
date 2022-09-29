package com.krishna;

import com.adap.AssignmentWork;
import com.adap.Pen;
import com.adap.PenAdapter;

public class PilotPen  {
    public static void main(String[] args) {
       Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("Im bit tired from Pilotpen");

    }
}
