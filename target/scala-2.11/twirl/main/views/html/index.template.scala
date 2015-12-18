
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

        """),format.raw/*3.9*/("""<section id="main-slider" class="no-margin">
            <div class="carousel slide wet-asphalt">
                <ol class="carousel-indicators">
                    <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                    <li data-target="#main-slider" data-slide-to="1"></li>
                    <li data-target="#main-slider" data-slide-to="2" ></li>
                </ol>

                <div class="carousel-inner">
                    <div class="item active">
                        <img src=""""),_display_(/*13.36*/routes/*13.42*/.Assets.versioned("images/slider/bg1.jpg")),format.raw/*13.84*/("""" alt="" >

                    </div><!--/.item-->
                    <div class="item">
                        <img src=""""),_display_(/*17.36*/routes/*17.42*/.Assets.versioned("images/slider/bg2.jpg")),format.raw/*17.84*/("""" alt="">
                    </div><!--/.item-->
                    <div class="item ">
                        <img src=""""),_display_(/*20.36*/routes/*20.42*/.Assets.versioned("images/slider/bg3.jpg")),format.raw/*20.84*/("""" alt="">
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
                                                    <img class="img-responsive " src=""""),_display_(/*54.88*/routes/*54.94*/.Assets.versioned("images/portfolio/recent/kuhinja.jpg")),format.raw/*54.150*/("""" alt="">
                                                    <h5>
                                                    Kuhinje
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*59.140*/routes/*59.146*/.Assets.versioned("images/portfolio/recent/kuhinja.jpg")),format.raw/*59.202*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive " src=""""),_display_(/*67.88*/routes/*67.94*/.Assets.versioned("images/portfolio/recent/amplakar.jpg")),format.raw/*67.151*/("""" alt="">
                                                    <h5>
                                                    Americki plakari
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*72.140*/routes/*72.146*/.Assets.versioned("images/portfolio/recent/amplakar.jpg")),format.raw/*72.203*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive " src=""""),_display_(/*80.88*/routes/*80.94*/.Assets.versioned("images/portfolio/recent/komoda.jpg")),format.raw/*80.149*/("""" alt="">
                                                    <h5>
                                                    Komode
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*85.140*/routes/*85.146*/.Assets.versioned("images/portfolio/recent/komoda.jpg")),format.raw/*85.201*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
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
                                                    <img class="img-responsive " src=""""),_display_(/*97.88*/routes/*97.94*/.Assets.versioned("images/portfolio/recent/djsoba.jpg")),format.raw/*97.149*/("""" alt="">
                                                    <h5>
                                                    Djecije sobe
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*102.140*/routes/*102.146*/.Assets.versioned("images/portfolio/recent/djsoba.jpg")),format.raw/*102.201*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive " src=""""),_display_(/*110.88*/routes/*110.94*/.Assets.versioned("images/portfolio/recent/ormar.jpg")),format.raw/*110.148*/("""" alt="">
                                                    <h5>
                                                    Ormari
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*115.140*/routes/*115.146*/.Assets.versioned("images/portfolio/recent/ormar.jpg")),format.raw/*115.200*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive " src=""""),_display_(/*123.88*/routes/*123.94*/.Assets.versioned("images/portfolio/recent/ukzid.jpg")),format.raw/*123.148*/("""" alt="">
                                                    <h5>
                                                    Ukrasni zid
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*128.140*/routes/*128.146*/.Assets.versioned("images/portfolio/recent/ukzid.jpg")),format.raw/*128.200*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
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
                                                    <img class="img-responsive " src=""""),_display_(/*140.88*/routes/*140.94*/.Assets.versioned("images/portfolio/recent/tapeta.jpg")),format.raw/*140.149*/("""" alt="">
                                                    <h5>
                                                        Tapete
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*145.140*/routes/*145.146*/.Assets.versioned("images/portfolio/recent/tapeta.jpg")),format.raw/*145.201*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive " src=""""),_display_(/*153.88*/routes/*153.94*/.Assets.versioned("images/portfolio/recent/polzavino.jpg")),format.raw/*153.152*/("""" alt="">
                                                    <h5>
                                                        Police za vino
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*158.140*/routes/*158.146*/.Assets.versioned("images/portfolio/recent/polzavino.jpg")),format.raw/*158.204*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                                <div class="col-xs-4">
                                                    <div class="portfolio-item">
                                                        <div class="item-inner">
                                                            <img class="img-responsive " src=""""),_display_(/*166.96*/routes/*166.102*/.Assets.versioned("images/portfolio/recent/poslprostor.jpg")),format.raw/*166.162*/("""" alt="">
                                                            <h5>
                                                               Poslovni prostori
                                                            </h5>
                                                            <div class="overlay">
                                                                <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href=""""),_display_(/*171.148*/routes/*171.154*/.Assets.versioned("images/portfolio/recent/poslprostor.jpg")),format.raw/*171.214*/("""" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
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


""")))}),format.raw/*186.2*/("""
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
                  DATE: Fri Dec 18 17:28:42 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/index.scala.html
                  HASH: 3b60e0613039bf1d18cb41858afd02a35292ea24
                  MATRIX: 827->1|859->25|897->26|933->36|1497->573|1512->579|1575->621|1728->747|1743->753|1806->795|1958->920|1973->926|2036->968|3866->2771|3881->2777|3959->2833|4385->3231|4401->3237|4479->3293|5068->3855|5083->3861|5162->3918|5597->4325|5613->4331|5692->4388|6281->4950|6296->4956|6373->5011|6798->5408|6814->5414|6891->5469|7692->6243|7707->6249|7784->6304|8216->6707|8233->6713|8311->6768|8901->7330|8917->7336|8994->7390|9420->7787|9437->7793|9514->7847|10104->8409|10120->8415|10197->8469|10628->8871|10645->8877|10722->8931|11507->9688|11523->9694|11601->9749|12031->10150|12048->10156|12126->10211|12716->10773|12732->10779|12813->10837|13251->11246|13268->11252|13349->11310|13971->11904|13988->11910|14071->11970|14551->12421|14568->12427|14651->12487|15265->13070
                  LINES: 32->1|32->1|32->1|34->3|44->13|44->13|44->13|48->17|48->17|48->17|51->20|51->20|51->20|85->54|85->54|85->54|90->59|90->59|90->59|98->67|98->67|98->67|103->72|103->72|103->72|111->80|111->80|111->80|116->85|116->85|116->85|128->97|128->97|128->97|133->102|133->102|133->102|141->110|141->110|141->110|146->115|146->115|146->115|154->123|154->123|154->123|159->128|159->128|159->128|171->140|171->140|171->140|176->145|176->145|176->145|184->153|184->153|184->153|189->158|189->158|189->158|197->166|197->166|197->166|202->171|202->171|202->171|217->186
                  -- GENERATED --
              */
          