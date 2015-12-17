
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Studio Enterijer")/*1.26*/{_display_(Seq[Any](format.raw/*1.27*/("""

  """),format.raw/*3.3*/("""<section id="recent-works">
    <div class="container">
      <div>
      <div style="text-align: center">
        <h1>CONTACT </h1>
      </div>
      <div class="row margin-bottom">
        <div class="col-md-4 col-md-offset-4">
          <div style="text-align: center" >
            <p>Please contact us, we would like to help you</p>
          </div>
        </div>
      </div>
        <div class="row">

          <div class="col-md-4">
            <div class="portfolio-item-contact">
              <div class="margin-top">
                <h5 class="icon-map-marker"> Address </h5>
                <h6>Hamdije Cemerlica, 7 <br>
                  Sarajevo, Bosnia and Herzegovina
                </h6>
              </div>

              <div class="margin-top">
                <h5 class="icon-phone"> Phone</h5>
                <h6>+387 (61) 957 000 </h6>
              </div>

              <div class="margin-top">
                <h5 class="icon-envelope"> Mail</h5>
                <h6>mirza.granulo&#64gmail.com</h6>
              </div>

            </div>

          </div>

          <div class="col-md-8">
            <div id="map"></div>
          </div>


        </div>
      </div>
    </div>
  </section>

  <script>
     function initialize() """),format.raw/*52.28*/("""{"""),format.raw/*52.29*/("""
        """),format.raw/*53.9*/("""var mapCanvas = document.getElementById('map');
        var mapOptions = """),format.raw/*54.26*/("""{"""),format.raw/*54.27*/("""
          """),format.raw/*55.11*/("""center: new google.maps.LatLng(43.850572, 18.393421),
          zoom:16,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""
        """),format.raw/*59.9*/("""var map = new google.maps.Map(mapCanvas, mapOptions)
        var marker = new google.maps.Marker("""),format.raw/*60.45*/("""{"""),format.raw/*60.46*/("""
            """),format.raw/*61.13*/("""position:"""),format.raw/*61.22*/("""{"""),format.raw/*61.23*/("""lat: 43.850572, lng: 18.393421"""),format.raw/*61.53*/("""}"""),format.raw/*61.54*/(""" """),format.raw/*61.55*/(""",
            map: map,
            title: 'Studio Enterijer'
         """),format.raw/*64.10*/("""}"""),format.raw/*64.11*/(""");
     """),format.raw/*65.6*/("""}"""),format.raw/*65.7*/("""
      """),format.raw/*66.7*/("""google.maps.event.addDomListener(window, 'load', initialize);
  </script>


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
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 14:42:09 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/contact.scala.html
                  HASH: e558960d099292248bc4eab24caaf5aaef89079b
                  MATRIX: 831->1|863->25|901->26|933->32|2278->1349|2307->1350|2344->1360|2446->1434|2475->1435|2515->1447|2677->1582|2706->1583|2743->1593|2869->1691|2898->1692|2940->1706|2977->1715|3006->1716|3064->1746|3093->1747|3122->1748|3224->1822|3253->1823|3289->1832|3317->1833|3352->1841
                  LINES: 32->1|32->1|32->1|34->3|83->52|83->52|84->53|85->54|85->54|86->55|89->58|89->58|90->59|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|95->64|95->64|96->65|96->65|97->66
                  -- GENERATED --
              */
          