package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

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
    public Result univer(){
        return ok(univer.render());
    }
    public Result radneploce(){
        return ok(radneploce.render());
    }
    public Result mdffarbani(){
        return ok(mdffarbani.render());
    }
    public Result mdf(){
        return ok(mdf.render());
    }
    public Result hdflesonit(){
        return ok(hdflesonit.render());
    }
    public Result furniraneploce(){
        return ok(furniraneploce.render());
    }
    public Result ivericasirova(){
        return ok(ivericasirova.render());
    }
    public Result kuhinje(){
        return ok(kuhinje.render());
    }
    public Result plakari(){
        return ok(plakari.render());
    }
    public Result kannamjestaj(){
        return ok(kannamjestaj.render());
    }
    public Result dnevnesobe(){
        return ok(dnevnesobe.render());
    }
    public Result djecijesobe(){
        return ok(djecijesobe.render());
    }
    public Result spavacesobe(){
        return ok(spavacesobe.render());
    }
    public Result predsoblja(){
        return ok(predsoblja.render());
    }
    public Result kupatila(){
        return ok(kupatila.render());
    }

}
