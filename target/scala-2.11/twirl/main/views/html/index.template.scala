
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Studio Enterijer")/*1.26*/{_display_(Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">


        <section id="main-slider" class="no-margin">
            <div class="carousel slide wet-asphalt">
                <ol class="carousel-indicators">
                    <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                    <li data-target="#main-slider" data-slide-to="1"></li>
                    <li data-target="#main-slider" data-slide-to="2" ></li>
                </ol>

                <div class="carousel-inner">
                    <div class="item active" >
                        <img src=""""),_display_(/*16.36*/routes/*16.42*/.Assets.versioned("images/slider/bg1.jpg")),format.raw/*16.84*/("""" alt="">

                    </div><!--/.item-->
                    <div class="item">
                        <img src=""""),_display_(/*20.36*/routes/*20.42*/.Assets.versioned("images/slider/bg2.jpg")),format.raw/*20.84*/("""" alt="">
                    </div><!--/.item-->
                    <div class="item ">
                        <img src=""""),_display_(/*23.36*/routes/*23.42*/.Assets.versioned("images/slider/bg3.jpg")),format.raw/*23.84*/("""" alt="">
                    </div><!--/.item-->
                </div><!--/.carousel-inner-->
            </div><!--/.carousel-->
            <a class="prev hidden-xs" href="#main-slider"  data-slide="prev">
                <i class="icon-angle-left"></i>
            </a>
            <a class="next hidden-xs" href="#main-slider" data-slide="next">
                <i class="icon-angle-right"></i>
            </a>
        </section><!--/#main-slider-->



        <section id="recent-works">
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <h3>Nasa ponuda</h3>
                        <p>Nudimo izradu visoko kvalitetnih kuhinja, americkih plakara, komoda, radnih i djecijih soba ... Vise slika mozete pogledati u nasoj galeriji </p>
                        <div class="btn-group">
                            <a class="btn btn-danger" href="#scroller" data-slide="prev"><i class="icon-angle-left"></i></a>
                            <a class="btn btn-danger" href="#scroller" data-slide="next"><i class="icon-angle-right"></i></a>
                        </div>
                        <p class="gap"></p>
                    </div>
                    <div class="col-md-9">
                        <div id="scroller" class="carousel slide">
                            <div class="carousel-inner">
                                <div class="item active">
                                    <div class="row">
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*57.99*/routes/*57.105*/.Assets.versioned("images/index/kuhinja.jpg")),format.raw/*57.150*/("""" alt="">
                                                    <h5>
                                                    Kuhinje
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*62.140*/routes/*62.146*/.Assets.versioned("images/index/kuhinja.jpg")),format.raw/*62.191*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*70.99*/routes/*70.105*/.Assets.versioned("images/index/amplakar.jpg")),format.raw/*70.151*/("""" alt="">
                                                    <h5>
                                                    Americki plakari
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*75.140*/routes/*75.146*/.Assets.versioned("images/index/amplakar.jpg")),format.raw/*75.192*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*83.99*/routes/*83.105*/.Assets.versioned("images/index/komoda.jpg")),format.raw/*83.149*/("""" alt="">
                                                    <h5>
                                                    Komode
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*88.140*/routes/*88.146*/.Assets.versioned("images/index/komoda.jpg")),format.raw/*88.190*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div><!--/.row-->
                                </div><!--/.item-->
                                <div class="item">
                                    <div class="row">
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*100.99*/routes/*100.105*/.Assets.versioned("images/index/djsoba.jpg")),format.raw/*100.149*/("""" alt="">
                                                    <h5>
                                                    Djecije sobe
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*105.140*/routes/*105.146*/.Assets.versioned("images/index/djsoba.jpg")),format.raw/*105.190*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*113.99*/routes/*113.105*/.Assets.versioned("images/index/ormar.jpg")),format.raw/*113.148*/("""" alt="">
                                                    <h5>
                                                    Ormari
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*118.140*/routes/*118.146*/.Assets.versioned("images/index/ormar.jpg")),format.raw/*118.189*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*126.99*/routes/*126.105*/.Assets.versioned("images/index/ukzid.jpg")),format.raw/*126.148*/("""" alt="">
                                                    <h5>
                                                    Ukrasni zid
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*131.140*/routes/*131.146*/.Assets.versioned("images/index/ukzid.jpg")),format.raw/*131.189*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                </div>
                                    </div>
                                </div>
                                        <div class="item">
                                            <div class="row">
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*143.99*/routes/*143.105*/.Assets.versioned("images/index/tapeta.jpg")),format.raw/*143.149*/("""" alt="">
                                                    <h5>
                                                        Tapete
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*148.140*/routes/*148.146*/.Assets.versioned("images/index/tapeta.jpg")),format.raw/*148.190*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive picturesize" src=""""),_display_(/*156.99*/routes/*156.105*/.Assets.versioned("images/index/polzavino.jpg")),format.raw/*156.152*/("""" alt="">
                                                    <h5>
                                                        Police za vino
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*161.140*/routes/*161.146*/.Assets.versioned("images/index/polzavino.jpg")),format.raw/*161.193*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                                <div class="col-xs-4">
                                                    <div class="portfolio-item">
                                                        <div class="item-inner">
                                                            <img class="img-responsive picturesize" src=""""),_display_(/*169.107*/routes/*169.113*/.Assets.versioned("images/index/poslprostor.jpg")),format.raw/*169.162*/("""" alt="">
                                                            <h5>
                                                               Poslovni prostori
                                                            </h5>
                                                            <div class="overlay">
                                                                <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*174.148*/routes/*174.154*/.Assets.versioned("images/index/poslprostor.jpg")),format.raw/*174.203*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                    </div>
                                </div><!--/.item-->
                            </div>
                        </div>
                    </div>
                </div><!--/.row-->
            </div>
        </section><!--/#recent-works-->
</html>


""")))}),format.raw/*190.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 17 13:52:51 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/index.scala.html
                  HASH: 5d9ab90067d01c49ba3910d279a5e56564943976
                  MATRIX: 827->1|859->25|897->26|924->27|1532->608|1547->614|1610->656|1762->781|1777->787|1840->829|1992->954|2007->960|2070->1002|3911->2816|3927->2822|3994->2867|4420->3265|4436->3271|4503->3316|5103->3889|5119->3895|5187->3941|5622->4348|5638->4354|5706->4400|6306->4973|6322->4979|6388->5023|6813->5420|6829->5426|6895->5470|7708->6255|7725->6261|7792->6305|8224->6708|8241->6714|8308->6758|8909->7331|8926->7337|8992->7380|9418->7777|9435->7783|9501->7826|10102->8399|10119->8405|10185->8448|10616->8850|10633->8856|10699->8899|11495->9667|11512->9673|11579->9717|12009->10118|12026->10124|12093->10168|12694->10741|12711->10747|12781->10794|13219->11203|13236->11209|13306->11256|13940->11861|13957->11867|14029->11916|14509->12367|14526->12373|14598->12422|15220->13013
                  LINES: 32->1|32->1|32->1|33->2|47->16|47->16|47->16|51->20|51->20|51->20|54->23|54->23|54->23|88->57|88->57|88->57|93->62|93->62|93->62|101->70|101->70|101->70|106->75|106->75|106->75|114->83|114->83|114->83|119->88|119->88|119->88|131->100|131->100|131->100|136->105|136->105|136->105|144->113|144->113|144->113|149->118|149->118|149->118|157->126|157->126|157->126|162->131|162->131|162->131|174->143|174->143|174->143|179->148|179->148|179->148|187->156|187->156|187->156|192->161|192->161|192->161|200->169|200->169|200->169|205->174|205->174|205->174|221->190
                  -- GENERATED --
              */
          