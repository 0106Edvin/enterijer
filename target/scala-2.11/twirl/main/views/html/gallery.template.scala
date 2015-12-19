
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gallery_Scope0 {
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

class gallery extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Studio Enterijer")/*1.26*/{_display_(Seq[Any](format.raw/*1.27*/("""


"""),format.raw/*4.1*/("""<!--gallery-->
    <section id="recent-works">
        <div class="row" >
            <div>
                <h1>Our Latest Project</h1>
            </div>
            <div class="col-md-12" >
                    <div class="carousel-inner">
                        <div class="item active">
                            <div class="row" id="easyPaginate" >
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*18.83*/routes/*18.89*/.Assets.versioned("images/gallery/1.jpg")),format.raw/*18.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Kuhinja - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" href='"""),_display_(/*23.94*/routes/*23.100*/.Assets.versioned("images/gallery/1.jpg")),format.raw/*23.141*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12" >
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*33.83*/routes/*33.89*/.Assets.versioned("images/gallery/2.jpg")),format.raw/*33.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*38.136*/routes/*38.142*/.Assets.versioned("images/gallery/2.jpg")),format.raw/*38.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*48.83*/routes/*48.89*/.Assets.versioned("images/gallery/3.jpg")),format.raw/*48.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*53.136*/routes/*53.142*/.Assets.versioned("images/gallery/3.jpg")),format.raw/*53.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*63.83*/routes/*63.89*/.Assets.versioned("images/gallery/4.jpg")),format.raw/*63.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*68.136*/routes/*68.142*/.Assets.versioned("images/gallery/4.jpg")),format.raw/*68.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*78.83*/routes/*78.89*/.Assets.versioned("images/gallery/5.jpg")),format.raw/*78.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*83.136*/routes/*83.142*/.Assets.versioned("images/gallery/5.jpg")),format.raw/*83.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*93.83*/routes/*93.89*/.Assets.versioned("images/gallery/6.jpg")),format.raw/*93.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*98.136*/routes/*98.142*/.Assets.versioned("images/gallery/6.jpg")),format.raw/*98.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*108.83*/routes/*108.89*/.Assets.versioned("images/gallery/7.jpg")),format.raw/*108.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*113.136*/routes/*113.142*/.Assets.versioned("images/gallery/7.jpg")),format.raw/*113.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*123.83*/routes/*123.89*/.Assets.versioned("images/gallery/8.jpg")),format.raw/*123.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*128.136*/routes/*128.142*/.Assets.versioned("images/gallery/8.jpg")),format.raw/*128.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12" >
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*138.83*/routes/*138.89*/.Assets.versioned("images/gallery/9.jpg")),format.raw/*138.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*143.136*/routes/*143.142*/.Assets.versioned("images/gallery/9.jpg")),format.raw/*143.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*153.83*/routes/*153.89*/.Assets.versioned("images/gallery/10.jpg")),format.raw/*153.131*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*158.136*/routes/*158.142*/.Assets.versioned("images/gallery/10.jpg")),format.raw/*158.184*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*168.83*/routes/*168.89*/.Assets.versioned("images/gallery/11.jpg")),format.raw/*168.131*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*173.136*/routes/*173.142*/.Assets.versioned("images/gallery/11.jpg")),format.raw/*173.184*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-md-3 col-xs-12">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*183.83*/routes/*183.89*/.Assets.versioned("images/gallery/12.jpg")),format.raw/*183.131*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*188.136*/routes/*188.142*/.Assets.versioned("images/gallery/12.jpg")),format.raw/*188.184*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>



                            </div>
                        </div><!--/.item-->

                    </div>

            </div>
        </div><!--/.row-->
    </section><!--/#recent-works-->

    <script>
    $('#easyPaginate').easyPaginate("""),format.raw/*207.37*/("""{"""),format.raw/*207.38*/("""
        """),format.raw/*208.9*/("""paginateElement: '.picture',
        elementsPerPage: 8,
        effect:'climb'
        """),format.raw/*211.9*/("""}"""),format.raw/*211.10*/(""");
</script>
    <style>
        .easyPaginateNav a """),format.raw/*214.28*/("""{"""),format.raw/*214.29*/("""
            """),format.raw/*215.13*/("""font-family: "Lucida Sans","Lucida Grande",sans-serif;
            padding:9px;


        """),format.raw/*219.9*/("""}"""),format.raw/*219.10*/("""

        """),format.raw/*221.9*/(""".easyPaginateNav a.current """),format.raw/*221.36*/("""{"""),format.raw/*221.37*/("""
            """),format.raw/*222.13*/("""font-weight:bold;
            text-decoration:underline;
        """),format.raw/*224.9*/("""}"""),format.raw/*224.10*/("""

        """),format.raw/*226.9*/(""".easyPaginateNav a:hover """),format.raw/*226.34*/("""{"""),format.raw/*226.35*/("""
            """),format.raw/*227.13*/("""background-color: #DEDEDE;
            color: #000;

        """),format.raw/*230.9*/("""}"""),format.raw/*230.10*/("""
    """),format.raw/*231.5*/("""</style>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object gallery extends gallery_Scope0.gallery
              /*
                  -- GENERATED --
                  DATE: Sat Dec 19 15:00:45 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/gallery.scala.html
                  HASH: 91e4a2337a3f1d669d7ac235c30186e9f02b8cd6
                  MATRIX: 831->1|863->25|901->26|933->32|1673->745|1688->751|1751->792|2171->1185|2187->1191|2250->1232|2920->1875|2935->1881|2998->1922|3458->2354|3474->2360|3537->2401|4206->3043|4221->3049|4284->3090|4744->3522|4760->3528|4823->3569|5492->4211|5507->4217|5570->4258|6030->4690|6046->4696|6109->4737|6778->5379|6793->5385|6856->5426|7316->5858|7332->5864|7395->5905|8064->6547|8079->6553|8142->6594|8602->7026|8618->7032|8681->7073|9351->7715|9367->7721|9431->7762|9892->8194|9909->8200|9973->8241|10643->8883|10659->8889|10723->8930|11184->9362|11201->9368|11265->9409|11936->10052|11952->10058|12016->10099|12477->10531|12494->10537|12558->10578|13228->11220|13244->11226|13309->11268|13770->11700|13787->11706|13852->11748|14522->12390|14538->12396|14603->12438|15064->12870|15081->12876|15146->12918|15816->13560|15832->13566|15897->13608|16358->14040|16375->14046|16440->14088|17020->14639|17050->14640|17088->14650|17207->14741|17237->14742|17321->14797|17351->14798|17394->14812|17516->14906|17546->14907|17586->14919|17642->14946|17672->14947|17715->14961|17810->15028|17840->15029|17880->15041|17934->15066|17964->15067|18007->15081|18099->15145|18129->15146|18163->15152
                  LINES: 32->1|32->1|32->1|35->4|49->18|49->18|49->18|54->23|54->23|54->23|64->33|64->33|64->33|69->38|69->38|69->38|79->48|79->48|79->48|84->53|84->53|84->53|94->63|94->63|94->63|99->68|99->68|99->68|109->78|109->78|109->78|114->83|114->83|114->83|124->93|124->93|124->93|129->98|129->98|129->98|139->108|139->108|139->108|144->113|144->113|144->113|154->123|154->123|154->123|159->128|159->128|159->128|169->138|169->138|169->138|174->143|174->143|174->143|184->153|184->153|184->153|189->158|189->158|189->158|199->168|199->168|199->168|204->173|204->173|204->173|214->183|214->183|214->183|219->188|219->188|219->188|238->207|238->207|239->208|242->211|242->211|245->214|245->214|246->215|250->219|250->219|252->221|252->221|252->221|253->222|255->224|255->224|257->226|257->226|257->226|258->227|261->230|261->230|262->231
                  -- GENERATED --
              */
          