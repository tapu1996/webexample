package controller;
import  model.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="stnd")
@SessionScoped
public class stcontroller extends  model {
model m = new model();

    public stcontroller() {
    }

    public model getM() {
        return m;
    }

    public void setM(model m) {
        this.m = m;
    }
    public  String to_next(){
        setA(1);
        setA1("A");
        setB(2);
        setB1("B");
        return "viewstudent";

    }
}
