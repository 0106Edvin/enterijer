
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


Seq[Any](_display_(/*1.2*/main("Studio | Enterijer")/*1.28*/{_display_(Seq[Any](format.raw/*1.29*/("""

    """),format.raw/*3.5*/("""<section id="main-slider" class="no-margin">
        <div class="carousel slide wet-asphalt">
            <ol class="carousel-indicators">
                <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                <li data-target="#main-slider" data-slide-to="1"></li>
                <li data-target="#main-slider" data-slide-to="2" ></li>
            </ol>

            <div class="carousel-inner">
                <div class="item active" id="image1">

                </div><!--/.item-->
                <div class="item" id="image2">
                </div><!--/.item-->
                <div class="item" id="image3">
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
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*49.84*/routes/*49.90*/.Assets.versioned("images/portfolio/recent/kuhinja.jpg")),format.raw/*49.146*/("""" alt="">
                                                <h5>
                                                    Kuhinje
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*54.136*/routes/*54.142*/.Assets.versioned("images/full/kuhinja.jpg")),format.raw/*54.186*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*62.84*/routes/*62.90*/.Assets.versioned("images/portfolio/recent/amplakar.jpg")),format.raw/*62.147*/("""" alt="">
                                                <h5>
                                                    Americki plakari
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*67.136*/routes/*67.142*/.Assets.versioned("images/full/amplakari.jpg")),format.raw/*67.188*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*75.84*/routes/*75.90*/.Assets.versioned("images/portfolio/recent/komoda.jpg")),format.raw/*75.145*/("""" alt="">
                                                <h5>
                                                    Komode
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*80.136*/routes/*80.142*/.Assets.versioned("images/full/komoda.jpg")),format.raw/*80.185*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div><!--/.row-->
                            </div><!--/.item-->
                            <div class="item">
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*92.84*/routes/*92.90*/.Assets.versioned("images/portfolio/recent/djsoba.jpg")),format.raw/*92.145*/("""" alt="">
                                                <h5>
                                                    Djecije sobe
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*97.136*/routes/*97.142*/.Assets.versioned("images/full/djsoba.jpg")),format.raw/*97.185*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*105.84*/routes/*105.90*/.Assets.versioned("images/portfolio/recent/ormar.jpg")),format.raw/*105.144*/("""" alt="">
                                                <h5>
                                                    Ormari
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*110.136*/routes/*110.142*/.Assets.versioned("images/full/ormar.jpg")),format.raw/*110.184*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*118.84*/routes/*118.90*/.Assets.versioned("images/portfolio/recent/ukzid.jpg")),format.raw/*118.144*/("""" alt="">
                                                <h5>
                                                    Ukrasni zid
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*123.136*/routes/*123.142*/.Assets.versioned("images/full/ukzid.jpg")),format.raw/*123.184*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*135.84*/routes/*135.90*/.Assets.versioned("images/portfolio/recent/tapeta.jpg")),format.raw/*135.145*/("""" alt="">
                                                <h5>
                                                    Tapete
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*140.136*/routes/*140.142*/.Assets.versioned("images/full/tapeta.jpg")),format.raw/*140.185*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*148.84*/routes/*148.90*/.Assets.versioned("images/portfolio/recent/polzavino.jpg")),format.raw/*148.148*/("""" alt="">
                                                <h5>
                                                    Police za vino
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*153.136*/routes/*153.142*/.Assets.versioned("images/full/polzavino.jpg")),format.raw/*153.188*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive " src=""""),_display_(/*161.84*/routes/*161.90*/.Assets.versioned("images/portfolio/recent/poslprostor.jpg")),format.raw/*161.150*/("""" alt="">
                                                <h5>
                                                    Poslovni prostori
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*166.136*/routes/*166.142*/.Assets.versioned("images/full/poslprostor.jpg")),format.raw/*166.190*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
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
    </section><!--/#recent-works-->


""")))}),format.raw/*180.2*/("""
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
                  DATE: Thu Dec 24 13:17:36 CET 2015
                  SOURCE: C:/Users/ajla/Documents/DTProjects/enterijer/app/views/index.scala.html
                  HASH: cebb005eeb4befc451dc914f48416cba7e48e9c5
                  MATRIX: 827->1|861->27|899->28|933->36|3291->2367|3306->2373|3384->2429|3799->2816|3815->2822|3881->2866|4446->3404|4461->3410|4540->3467|4964->3863|4980->3869|5048->3915|5613->4453|5628->4459|5705->4514|6119->4900|6135->4906|6200->4949|6965->5687|6980->5693|7057->5748|7477->6140|7493->6146|7558->6189|8124->6727|8140->6733|8217->6787|8632->7173|8649->7179|8714->7221|9280->7759|9296->7765|9373->7819|9793->8210|9810->8216|9875->8258|10616->8971|10632->8977|10710->9032|11125->9418|11142->9424|11208->9467|11774->10005|11790->10011|11871->10069|12294->10463|12311->10469|12380->10515|12946->11053|12962->11059|13045->11119|13471->11516|13488->11522|13559->11570|14092->12072
                  LINES: 32->1|32->1|32->1|34->3|80->49|80->49|80->49|85->54|85->54|85->54|93->62|93->62|93->62|98->67|98->67|98->67|106->75|106->75|106->75|111->80|111->80|111->80|123->92|123->92|123->92|128->97|128->97|128->97|136->105|136->105|136->105|141->110|141->110|141->110|149->118|149->118|149->118|154->123|154->123|154->123|166->135|166->135|166->135|171->140|171->140|171->140|179->148|179->148|179->148|184->153|184->153|184->153|192->161|192->161|192->161|197->166|197->166|197->166|211->180
                  -- GENERATED --
              */
          