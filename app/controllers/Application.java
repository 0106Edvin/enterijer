package controllers;


import play.mvc.Controller;
import play.mvc.Result;
import views.html.contact;
import views.html.gallery;
import views.html.index;
import views.html.proba;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }
    public Result gallery(){

        return ok(gallery.render());
    }
    public Result contact(){
        return ok(contact.render());
    }
    public Result proba(){
        return ok(proba.render());
    }

}
