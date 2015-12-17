
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


Seq[Any](_display_(/*2.2*/main("Studio Enterijer")/*2.26*/{_display_(Seq[Any](format.raw/*2.27*/("""


"""),format.raw/*5.1*/("""<!--gallery-->
    <section id="recent-works">
        <div class="row" >
            <div>
                <h1>Our Latest Project</h1>
            </div>
            <div class="col-md-12" >
                    <div class="carousel-inner">
                        <div class="item active">
                            <div class="row"  id="easyPaginate">

                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*20.83*/routes/*20.89*/.Assets.versioned("images/gallery/1.jpg")),format.raw/*20.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Kuhinja - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" href='"""),_display_(/*25.94*/routes/*25.100*/.Assets.versioned("images/gallery/1.jpg")),format.raw/*25.141*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*35.83*/routes/*35.89*/.Assets.versioned("images/gallery/2.jpg")),format.raw/*35.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*40.136*/routes/*40.142*/.Assets.versioned("images/gallery/2.jpg")),format.raw/*40.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*50.83*/routes/*50.89*/.Assets.versioned("images/gallery/3.jpg")),format.raw/*50.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*55.136*/routes/*55.142*/.Assets.versioned("images/gallery/3.jpg")),format.raw/*55.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*65.83*/routes/*65.89*/.Assets.versioned("images/gallery/4.jpg")),format.raw/*65.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*70.136*/routes/*70.142*/.Assets.versioned("images/gallery/4.jpg")),format.raw/*70.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*80.83*/routes/*80.89*/.Assets.versioned("images/gallery/5.jpg")),format.raw/*80.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*85.136*/routes/*85.142*/.Assets.versioned("images/gallery/5.jpg")),format.raw/*85.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*95.83*/routes/*95.89*/.Assets.versioned("images/gallery/6.jpg")),format.raw/*95.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*100.136*/routes/*100.142*/.Assets.versioned("images/gallery/6.jpg")),format.raw/*100.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*110.83*/routes/*110.89*/.Assets.versioned("images/gallery/7.jpg")),format.raw/*110.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*115.136*/routes/*115.142*/.Assets.versioned("images/gallery/7.jpg")),format.raw/*115.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*125.83*/routes/*125.89*/.Assets.versioned("images/gallery/8.jpg")),format.raw/*125.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*130.136*/routes/*130.142*/.Assets.versioned("images/gallery/8.jpg")),format.raw/*130.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*140.83*/routes/*140.89*/.Assets.versioned("images/gallery/9.jpg")),format.raw/*140.130*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*145.136*/routes/*145.142*/.Assets.versioned("images/gallery/9.jpg")),format.raw/*145.183*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*155.83*/routes/*155.89*/.Assets.versioned("images/gallery/10.jpg")),format.raw/*155.131*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*160.136*/routes/*160.142*/.Assets.versioned("images/gallery/10.jpg")),format.raw/*160.184*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*170.83*/routes/*170.89*/.Assets.versioned("images/gallery/11.jpg")),format.raw/*170.131*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*175.136*/routes/*175.142*/.Assets.versioned("images/gallery/11.jpg")),format.raw/*175.184*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="picture">
                                    <div class="col-xs-3">
                                        <div class="portfolio-item">
                                            <div class="item-inner">
                                                <img class="img-responsive" src='"""),_display_(/*185.83*/routes/*185.89*/.Assets.versioned("images/gallery/12.jpg")),format.raw/*185.131*/("""' alt="" style="height: 200px">
                                                <h5>
                                                    Nova - Corporate site template
                                                </h5>
                                                <div class="overlay">
                                                    <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href='"""),_display_(/*190.136*/routes/*190.142*/.Assets.versioned("images/gallery/12.jpg")),format.raw/*190.184*/("""' rel="prettyPhoto"><i class="icon-eye-open"></i></a>
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
    $('#easyPaginate').easyPaginate("""),format.raw/*210.37*/("""{"""),format.raw/*210.38*/("""
        """),format.raw/*211.9*/("""paginateElement: '.picture',
        elementsPerPage: 8,
        effect:'climb'
        """),format.raw/*214.9*/("""}"""),format.raw/*214.10*/(""");
</script>
    <style>
    .easyPaginateNav a """),format.raw/*217.24*/("""{"""),format.raw/*217.25*/("""
    """),format.raw/*218.5*/("""font-family: "Lucida Sans","Lucida Grande",sans-serif;
    font-size: 76%;
    padding:9px;
    text-align: center;

    """),format.raw/*223.5*/("""}"""),format.raw/*223.6*/("""

    """),format.raw/*225.5*/(""".easyPaginateNav a.current """),format.raw/*225.32*/("""{"""),format.raw/*225.33*/("""
    """),format.raw/*226.5*/("""font-weight:bold;
    text-decoration:underline;
    """),format.raw/*228.5*/("""}"""),format.raw/*228.6*/("""

    """),format.raw/*230.5*/(""".easyPaginateNav a:hover """),format.raw/*230.30*/("""{"""),format.raw/*230.31*/("""
    """),format.raw/*231.5*/("""background-color: #DEDEDE;
    color: #000;

    """),format.raw/*234.5*/("""}"""),format.raw/*234.6*/("""
    """),format.raw/*235.5*/("""</style>
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
                  DATE: Thu Dec 17 13:58:12 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/gallery.scala.html
                  HASH: 252b27910496c155f1007b722c71f2250aef0462
                  MATRIX: 831->3|863->27|901->28|933->34|1665->739|1680->745|1743->786|2163->1179|2179->1185|2242->1226|2901->1858|2916->1864|2979->1905|3439->2337|3455->2343|3518->2384|4177->3016|4192->3022|4255->3063|4715->3495|4731->3501|4794->3542|5453->4174|5468->4180|5531->4221|5991->4653|6007->4659|6070->4700|6729->5332|6744->5338|6807->5379|7267->5811|7283->5817|7346->5858|8005->6490|8020->6496|8083->6537|8544->6969|8561->6975|8625->7016|9285->7648|9301->7654|9365->7695|9826->8127|9843->8133|9907->8174|10567->8806|10583->8812|10647->8853|11108->9285|11125->9291|11189->9332|11849->9964|11865->9970|11929->10011|12390->10443|12407->10449|12471->10490|13131->11122|13147->11128|13212->11170|13673->11602|13690->11608|13755->11650|14415->12282|14431->12288|14496->12330|14957->12762|14974->12768|15039->12810|15699->13442|15715->13448|15780->13490|16241->13922|16258->13928|16323->13970|16905->14523|16935->14524|16973->14534|17092->14625|17122->14626|17202->14677|17232->14678|17266->14684|17420->14810|17449->14811|17485->14819|17541->14846|17571->14847|17605->14853|17688->14908|17717->14909|17753->14917|17807->14942|17837->14943|17871->14949|17951->15001|17980->15002|18014->15008
                  LINES: 32->2|32->2|32->2|35->5|50->20|50->20|50->20|55->25|55->25|55->25|65->35|65->35|65->35|70->40|70->40|70->40|80->50|80->50|80->50|85->55|85->55|85->55|95->65|95->65|95->65|100->70|100->70|100->70|110->80|110->80|110->80|115->85|115->85|115->85|125->95|125->95|125->95|130->100|130->100|130->100|140->110|140->110|140->110|145->115|145->115|145->115|155->125|155->125|155->125|160->130|160->130|160->130|170->140|170->140|170->140|175->145|175->145|175->145|185->155|185->155|185->155|190->160|190->160|190->160|200->170|200->170|200->170|205->175|205->175|205->175|215->185|215->185|215->185|220->190|220->190|220->190|240->210|240->210|241->211|244->214|244->214|247->217|247->217|248->218|253->223|253->223|255->225|255->225|255->225|256->226|258->228|258->228|260->230|260->230|260->230|261->231|264->234|264->234|265->235
                  -- GENERATED --
              */
          